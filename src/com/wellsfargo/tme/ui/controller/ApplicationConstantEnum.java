/**
 * 
 */
package com.wellsfargo.tme.ui.controller;
/**
 * @author Prabal Nandi
 *
 */
public enum ApplicationConstantEnum {
   DEFAULT_TEMPLTE_PAGE("TeamMemberManagement.fxml"), MAIN_CSS_RESOURCE("application.css"), NAVIGATION_LOGIN("LoginHome.fxml"), NAVIGATION_MANAGER_HOME("ManagerHomePage.fxml"), NAVIGATION_MANAGER_HEADER(
         "ManagerHeader.fxml"), NAVIGATION_GLOBAL_HEADER("GlobalHeader.fxml"), NAVIGATION_GLOBAL_FOOTER("GlobalFooter.fxml");
   private final String value;
   private ApplicationConstantEnum(String value) {
      this.value = value;
   }
   public String getConstValue() {
      return this.value;
   }
}