/**
 * 
 */
package com.prabal.wallet.ui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.Initializable;

import com.prabal.wallet.ExpenseWallet;

/**
 * @author praba_000
 *
 */
public class HomepageController implements Initializable,WalletAppController{
   private ExpenseWallet mainApplication;

   @Override
   public void setMainApplication(Application application) {
      this.mainApplication = (ExpenseWallet)application;
   }

   @Override
   public void initialize(URL location, ResourceBundle resources) {
      // TODO Auto-generated method stub
      
   }

}
