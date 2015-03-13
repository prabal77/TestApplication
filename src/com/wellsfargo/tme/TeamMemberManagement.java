package com.wellsfargo.tme;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import com.wellsfargo.tme.model.UserLoginInfo;
import com.wellsfargo.tme.ui.controller.ApplicationConstantEnum;
import com.wellsfargo.tme.ui.controller.ViewController;

public class TeamMemberManagement extends Application {
   public static final String UI_FXML_PATH = "/com/wellsfargo/tme/ui/fxml/";
   public static final String UI_CSS_PATH = "/css/";
   public static final String UI_CONTROLLER_PATH = "/com/wellsfargo/tme/ui/controller/";
   public static final int HEADER_PANE_INDEX = 0;
   public static final int BODY_PANE_INDEX = 1;

   public static final int ERROR_SEVERITY_SUCCESS = 0;
   public static final int ERROR_SEVERITY_ERROR = 1;
   public static final int ERROR_SEVERITY_WARN = 2;

   private Stage primaryStage;
   private TeamMemberManagement mainApplication;
   private UserLoginInfo loggedUser;
   private ViewController currentHeaderController;

   @Override
   public void start(Stage primaryStage) {
      try {
         this.primaryStage = primaryStage;
         this.mainApplication = this;
         primaryStage.setTitle("Team Member Management Tool");
         primaryStage.setMinWidth(800);
         primaryStage.setMinHeight(600);
         VBox root = (VBox) FXMLLoader.load(getClass().getResource(UI_FXML_PATH + ApplicationConstantEnum.DEFAULT_TEMPLTE_PAGE.getConstValue()));
         primaryStage.setScene(new Scene(root));
         primaryStage.getScene().getStylesheets().add(UI_CSS_PATH + ApplicationConstantEnum.MAIN_CSS_RESOURCE.getConstValue());
         primaryStage.show();
         // Navigate to the Login Page
         navigateToPage(ApplicationConstantEnum.NAVIGATION_LOGIN);
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }

   public ViewController navigateToPage(ApplicationConstantEnum constantEnum) {
      return navigateToPage(Collections.singletonMap(BODY_PANE_INDEX, constantEnum)).get(BODY_PANE_INDEX);
   }

   public ViewController navigateToPage(ApplicationConstantEnum constantEnum, int indexOfTargetPane) {
      return navigateToPage(Collections.singletonMap(indexOfTargetPane, constantEnum)).get(indexOfTargetPane);
   }

   public Map<Integer, ViewController> navigateToPage(Map<Integer, ApplicationConstantEnum> targetPaneMap) {
      Map<Integer, ViewController> returnControllerMap = new HashMap<Integer, ViewController>(targetPaneMap.size());

      VBox rootScene = (VBox) getPrimaryStage().getScene().getRoot();

      for (Map.Entry<Integer, ApplicationConstantEnum> entry : targetPaneMap.entrySet()) {

         FXMLLoader loader = new FXMLLoader();
         loader.setBuilderFactory(new JavaFXBuilderFactory());
         loader.setLocation(this.getClass().getResource(UI_FXML_PATH + entry.getValue().getConstValue()));
         try (InputStream in = this.getClass().getResourceAsStream(UI_FXML_PATH + entry.getValue().getConstValue())) {
            Pane nextTargetPane = loader.load(in);
            Pane pane = (Pane) rootScene.getChildren().get(entry.getKey());
            pane.getChildren().setAll(nextTargetPane);
            ViewController controller = loader.getController();
            if (controller != null) {
               controller.setMainApplication(this.mainApplication);
               returnControllerMap.put(entry.getKey(), loader.getController());
            }
         }
         catch (IOException e) {
            e.printStackTrace();
         }

      }
      if (returnControllerMap.containsKey(HEADER_PANE_INDEX)) {
         this.currentHeaderController = returnControllerMap.get(HEADER_PANE_INDEX);
      }
      primaryStage.getScene().setRoot(rootScene);
      return returnControllerMap;
   }

   public static void main(String[] args) {
      launch(args);
   }

   // Getter and Setters
   public Stage getPrimaryStage() {
      return this.primaryStage;
   }

   public UserLoginInfo getLoggedUser() {
      return loggedUser;
   }

   public void setLoggedUser(UserLoginInfo loggedUser) {
      this.loggedUser = loggedUser;
   }

   public static Label generateErrorLable(Label targetLabel, String errorMessage, int severity) {
      targetLabel.setFont(Font.font("Arial", FontWeight.BOLD, 12));
      targetLabel.setText(errorMessage);
      Background background = null;

      switch (severity) {
         case ERROR_SEVERITY_SUCCESS: {
            targetLabel.setTextFill(Paint.valueOf("black"));
            background = new Background(new BackgroundFill(Paint.valueOf("#04B404"), new CornerRadii(5d), new Insets(2d)));
            break;
         }
         case ERROR_SEVERITY_WARN: {
            targetLabel.setTextFill(Paint.valueOf("black"));
            background = new Background(new BackgroundFill(Paint.valueOf("#FF8000"), new CornerRadii(5d), new Insets(2d)));
            break;
         }
         case ERROR_SEVERITY_ERROR: {
            targetLabel.setTextFill(Paint.valueOf("black"));
            background = new Background(new BackgroundFill(Paint.valueOf("#FA5858"), new CornerRadii(5d), new Insets(2d)));
            break;
         }
         default: {
            background = new Background(new BackgroundFill(null, new CornerRadii(5d), new Insets(2d)));
            break;
         }
      }
      targetLabel.setBackground(background);
      targetLabel.setPadding(new Insets(10d));
      return targetLabel;
   }

   public ViewController getCurrentHeaderController() {
      return currentHeaderController;
   }

   public void setCurrentHeaderController(ViewController currentHeaderController) {
      this.currentHeaderController = currentHeaderController;
   }

}