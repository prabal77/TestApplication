/**
 * 
 */
package com.wellsfargo.tme.ui.controller;

import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import com.wellsfargo.tme.TeamMemberManagement;

/**
 * @author Prabal Nandi
 *
 */
public class ManagerHeaderController implements ViewController {
   private TeamMemberManagement mainApplication;
   @FXML
   private Label errorMessage;

   @Override
   public void setMainApplication(Application application) {
      this.mainApplication = (TeamMemberManagement) application;
   }

   public Label getErrorMessage() {
      return errorMessage;
   }

   public void setErrorMessage(String errorMessage, int severity) {
      this.errorMessage = TeamMemberManagement.generateErrorLable(this.errorMessage, errorMessage, severity);
   }

   @FXML
   public void handleLogout(ActionEvent event) {
      String userID = null;
      if (this.mainApplication.getLoggedUser() != null) {
         userID = this.mainApplication.getLoggedUser().getEmployeeId();
         this.mainApplication.setLoggedUser(null);
      }
      Map<Integer, ApplicationConstantEnum> targetMap = new HashMap<Integer, ApplicationConstantEnum>(2);
      targetMap.put(TeamMemberManagement.HEADER_PANE_INDEX, ApplicationConstantEnum.NAVIGATION_GLOBAL_HEADER);
      targetMap.put(TeamMemberManagement.BODY_PANE_INDEX, ApplicationConstantEnum.NAVIGATION_LOGIN);
      Map<Integer, ViewController> targetController = this.mainApplication.navigateToPage(targetMap);
      ((LoginController) targetController.get(TeamMemberManagement.BODY_PANE_INDEX)).setErrorMessage("User " + userID + " Sucessfully logged out.", TeamMemberManagement.ERROR_SEVERITY_SUCCESS);
   }

   @FXML
   public void gotoManagerHome() {
      Map<Integer, ApplicationConstantEnum> targetMap = new HashMap<Integer, ApplicationConstantEnum>(2);
      targetMap.put(TeamMemberManagement.HEADER_PANE_INDEX, ApplicationConstantEnum.NAVIGATION_MANAGER_HEADER);
      targetMap.put(TeamMemberManagement.BODY_PANE_INDEX, ApplicationConstantEnum.NAVIGATION_MANAGER_HOME);
      this.mainApplication.navigateToPage(targetMap);
   }
}