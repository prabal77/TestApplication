/**
 * 
 */
package com.wellsfargo.tme.ui.object;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * @author Prabal Nandi
 *
 */
public class EmployeeListDisplay {
   private SimpleStringProperty employeeID;
   private SimpleStringProperty employeeName;
   private SimpleStringProperty location;
   private SimpleStringProperty auCode;
   private SimpleStringProperty projectName;
   private SimpleStringProperty jobCode;
   private SimpleStringProperty jobType;
   private SimpleStringProperty managerName;

   public EmployeeListDisplay() {
      super();
      this.employeeID = new SimpleStringProperty();
      this.employeeName = new SimpleStringProperty();
      this.location = new SimpleStringProperty();
      this.auCode = new SimpleStringProperty();
      this.projectName = new SimpleStringProperty();
      this.jobCode = new SimpleStringProperty();
      this.jobType = new SimpleStringProperty();
      this.managerName = new SimpleStringProperty();
   }

   public String getEmployeeID() {
      return employeeID.get();
   }

   public void setEmployeeID(String employeeID) {
      this.employeeID.set(employeeID);
   }

   public String getEmployeeName() {
      return employeeName.get();
   }

   public void setEmployeeName(String employeeName) {
      this.employeeName.set(employeeName);
   }

   public String getLocation() {
      return location.get();
   }

   public void setLocation(String location) {
      this.location.set(location);
   }

   public String getAuCode() {
      return auCode.get();
   }

   public void setAuCode(String auCode) {
      this.auCode.set(auCode);
   }

   public String getProjectName() {
      return projectName.get();
   }

   public void setProjectName(String projectName) {
      this.projectName.set(projectName);
   }

   public String getJobCode() {
      return jobCode.get();
   }

   public void setJobCode(String jobCode) {
      this.jobCode.set(jobCode);
   }

   public String getJobType() {
      return jobType.get();
   }

   public void setJobType(String jobType) {
      this.jobType.set(jobType);
   }

   public String getManagerName() {
      return managerName.get();
   }

   public void setManagerName(String managerName) {
      this.managerName.set(managerName);
   }

   public void setEmployeeName(String firstName, String middleName, String lastName) {
      StringBuilder builder = new StringBuilder();
      builder.append(firstName).append(" ").append(((middleName != null && middleName.equals("")) ? middleName : ""));
      builder.append("").append(lastName);
      this.employeeName = new SimpleStringProperty(builder.toString());
   }

   public void setManagerName(String firstName, String middleName, String lastName) {
      StringBuilder builder = new StringBuilder();
      builder.append(firstName).append(" ").append(((middleName != null && middleName.equals("")) ? middleName : ""));
      builder.append("").append(lastName);
      this.managerName = new SimpleStringProperty(builder.toString());
   }

   public String toString() {
      return "EmployeeListDisplay [employeeID=" + employeeID + ", employeeName=" + employeeName + ", location=" + location + ", auCode=" + auCode + ", projectName=" + projectName + ", jobCode="
            + jobCode + ", jobType=" + jobType + ", managerName=" + managerName + "]";
   }

   public static List<PropertyValueFactory> getPropertyValueFactoryList() {
      List<PropertyValueFactory> propertyList = new ArrayList<PropertyValueFactory>();
      propertyList.add(new PropertyValueFactory<EmployeeListDisplay, String>("employeeID"));
      propertyList.add(new PropertyValueFactory<EmployeeListDisplay, String>("employeeName"));
      propertyList.add(new PropertyValueFactory<EmployeeListDisplay, String>("location"));
      propertyList.add(new PropertyValueFactory<EmployeeListDisplay, String>("auCode"));
      propertyList.add(new PropertyValueFactory<EmployeeListDisplay, String>("projectName"));
      propertyList.add(new PropertyValueFactory<EmployeeListDisplay, String>("jobCode"));
      propertyList.add(new PropertyValueFactory<EmployeeListDisplay, String>("jobType"));
      propertyList.add(new PropertyValueFactory<EmployeeListDisplay, String>("managerName"));
      return propertyList;
   }

}
