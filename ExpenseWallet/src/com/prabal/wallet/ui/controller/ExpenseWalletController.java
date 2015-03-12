package com.prabal.wallet.ui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import com.prabal.wallet.ExpenseWallet;

public class ExpenseWalletController implements Initializable, WalletAppController {
   @FXML
   private TextField userName;
   @FXML
   private TextField passsword;

   private ExpenseWallet mainApplication;

   @FXML
   protected void handleLogin(ActionEvent event) {
      System.out.println("Printing " + this.userName.getText());
      System.out.println("Printing " + this.passsword.getText());
      this.mainApplication.gotoHomeScreen();
   }

   @Override
   public void setMainApplication(Application application) {
      this.mainApplication = (ExpenseWallet) application;
   }

   @Override
   public void initialize(URL location, ResourceBundle resources) {
   }

}
