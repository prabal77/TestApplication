package com.prabal.wallet;

import java.io.InputStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.prabal.wallet.ui.controller.WalletAppController;

public class ExpenseWallet extends Application {
   public static final String UI_FXML_PATH = "/com/prabal/wallet/ui/fxml/";
   public static final String UI_CSS_PATH = "/com/prabal/wallet/style/css/";
   public static final int MAIN_BODY_INDEX = 1;

   private ExpenseWallet application;
   private Stage primaryStage;

   @Override
   public void start(Stage primaryStage) {
      try {
         this.primaryStage = primaryStage;
         this.application = this;
         VBox root = (VBox) FXMLLoader.load(getClass().getResource(UI_FXML_PATH + "ExpenseWallet.fxml"));
         Scene scene = new Scene(root, 800, 600);
         scene.getStylesheets().add(getClass().getResource(UI_CSS_PATH + "application.css").toExternalForm());
         primaryStage.setScene(scene);
         primaryStage.show();
         //Thread.sleep(5000);
         gotoLoginScreen();
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }

   public void gotoLoginScreen() {
      try {
         WalletAppController controller = replaceSceneContent(UI_FXML_PATH + "LoginPane.fxml");
         controller.setMainApplication(this.application);
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }

   public void gotoHomeScreen() {
      try {
         WalletAppController controller = replaceSceneContent(UI_FXML_PATH + "HomeScreen.fxml");
         controller.setMainApplication(this.application);
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }

   public static void main(String[] args) {
      launch(args);
   }

   private WalletAppController replaceSceneContent(String fxml) throws Exception {
      FXMLLoader loader = new FXMLLoader();
      InputStream in = ExpenseWallet.class.getResourceAsStream(fxml);
      loader.setBuilderFactory(new JavaFXBuilderFactory());
      loader.setLocation(ExpenseWallet.class.getResource(fxml));
      try {
         Pane vBox = (VBox) primaryStage.getScene().getRoot();
         Node currentMainBodyNode = vBox.getChildren().get(MAIN_BODY_INDEX);
         Node newBodyNode = (Node) loader.load(in);
         vBox.getChildren().set(MAIN_BODY_INDEX, newBodyNode);
      }
      finally {
         in.close();
      }
      return (WalletAppController) loader.getController();
   }

   public ExpenseWallet getApplication() {
      return application;
   }

   public Stage getPrimaryStage() {
      return primaryStage;
   }

}
