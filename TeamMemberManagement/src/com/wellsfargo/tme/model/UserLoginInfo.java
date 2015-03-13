/**
 * 
 */
package com.wellsfargo.tme.model;
import java.io.Serializable;
/**
 * @author Prabal Nandi
 *
 */
public class UserLoginInfo implements Serializable {
   private static final long serialVersionUID = 2905678464937908838L;
   private String userName;
   private String password;
   private String role;
   private String employeeId;
   public UserLoginInfo() {
      super();
   }
   public UserLoginInfo(String userName, String password, String role, String employeeId) {
      super();
      this.userName = userName;
      this.password = password;
      this.role = role;
      this.employeeId = employeeId;
   }
   public String getUserName() {
      return userName;
   }
   public void setUserName(String userName) {
      this.userName = userName;
   }
   public String getPassword() {
      return password;
   }
   public void setPassword(String password) {
      this.password = password;
   }
   public String getRole() {
      return role;
   }
   public void setRole(String role) {
      this.role = role;
   }
   public String getEmployeeId() {
      return employeeId;
   }
   public void setEmployeeId(String employeeId) {
      this.employeeId = employeeId;
   }
   @Override
   public String toString() {
      return "UserLoginInfo [userName=" + userName + ", password=" + password + ", role=" + role + ", employeeId=" + employeeId + "]";
   }
}