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
import javafx.scene.control.TextField;
import com.wellsfargo.tme.TeamMemberManagement;
import com.wellsfargo.tme.business.LoginProcessBean;
import com.wellsfargo.tme.exception.NonFatalException;
import com.wellsfargo.tme.model.UserLoginInfo;

/**
 * @author Prabal Nandi
 *
 */
public class LoginController implements ViewController {
   private TeamMemberManagement mainApplication;
   @FXML
   private TextField userNameTxt;
   @FXML
   private TextField passwordTxt;
   @FXML
   private Label errorMessageLbl;

   @FXML
   public void handleLogin(ActionEvent actionEvent) {
      UserLoginInfo loginInfo = null;
      try {
         loginInfo = LoginProcessBean.processLogin(this.userNameTxt.getText(), this.passwordTxt.getText());
         this.mainApplication.setLoggedUser(loginInfo);
         this.errorMessageLbl = TeamMemberManagement.generateErrorLable(this.errorMessageLbl, "Loging Successful. Welcome " + loginInfo.getEmployeeId(), TeamMemberManagement.ERROR_SEVERITY_SUCCESS);
      }
      catch (NonFatalException nonFatalException) {
         this.errorMessageLbl = TeamMemberManagement.generateErrorLable(this.errorMessageLbl, nonFatalException.getMessage(), TeamMemberManagement.ERROR_SEVERITY_ERROR);
         return;
      }
      if (loginInfo != null) {
         this.mainApplication.setLoggedUser(loginInfo);
         Map<Integer, ApplicationConstantEnum> targetMap = new HashMap<Integer, ApplicationConstantEnum>(2);
         targetMap.put(TeamMemberManagement.HEADER_PANE_INDEX, ApplicationConstantEnum.NAVIGATION_MANAGER_HEADER);
         targetMap.put(TeamMemberManagement.BODY_PANE_INDEX, ApplicationConstantEnum.NAVIGATION_MANAGER_HOME);
         Map<Integer, ViewController> targetController = this.mainApplication.navigateToPage(targetMap);
         this.mainApplication.getCurrentHeaderController().setErrorMessage(this.errorMessageLbl.getText(), TeamMemberManagement.ERROR_SEVERITY_SUCCESS);
      }
   }

   @Override
   public void setMainApplication(Application application) {
      this.mainApplication = (TeamMemberManagement) application;
   }

   public void setErrorMessage(String errorMessage, int severity) {
      this.errorMessageLbl = TeamMemberManagement.generateErrorLable(this.errorMessageLbl, errorMessage, severity);
   }
}