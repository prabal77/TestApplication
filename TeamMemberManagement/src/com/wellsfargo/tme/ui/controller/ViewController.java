/**
 * 
 */
package com.wellsfargo.tme.ui.controller;

import javafx.application.Application;

/**
 * @author Prabal Nandi
 *
 */
public interface ViewController {
   public void setMainApplication(Application application);
   
   public void setErrorMessage(String message, int severity);
   
}