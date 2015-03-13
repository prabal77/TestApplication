/**
 * 
 */
package com.wellsfargo.tme.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Prabal Nandi
 *
 */
public class EmployeeDetailsInfo implements Serializable {
   private String employeeId;
   private String firstName;
   private String middleName;
   private String lastName;
   private String gender;
   private Date dateOfBirth;
   private String location;
   private String jobCode;
   private String jobType;
   private TeamDetailsInfo teamDetailsInfo;
   private Date dateOfJoiningCompany;
   private Date dateOfJoiningCurrentTeam;
   private String employeeStatus;
   private String managerId;
   private String currentGradeCode;
   private Date confirmationDate;

   public EmployeeDetailsInfo() {
      super();
      // TODO Auto-generated constructor stub
   }

   public String getEmployeeId() {
      return employeeId;
   }

   public void setEmployeeId(String employeeId) {
      this.employeeId = employeeId;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getMiddleName() {
      return middleName;
   }

   public void setMiddleName(String middleName) {
      this.middleName = middleName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getGender() {
      return gender;
   }

   public void setGender(String gender) {
      this.gender = gender;
   }

   public Date getDateOfBirth() {
      return dateOfBirth;
   }

   public void setDateOfBirth(Date dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
   }

   public String getLocation() {
      return location;
   }

   public void setLocation(String location) {
      this.location = location;
   }

   public String getJobCode() {
      return jobCode;
   }

   public void setJobCode(String jobCode) {
      this.jobCode = jobCode;
   }

   public String getJobType() {
      return jobType;
   }

   public void setJobType(String jobType) {
      this.jobType = jobType;
   }

   public Date getDateOfJoiningCompany() {
      return dateOfJoiningCompany;
   }

   public void setDateOfJoiningCompany(Date dateOfJoiningCompany) {
      this.dateOfJoiningCompany = dateOfJoiningCompany;
   }

   public Date getDateOfJoiningCurrentTeam() {
      return dateOfJoiningCurrentTeam;
   }

   public void setDateOfJoiningCurrentTeam(Date dateOfJoiningCurrentTeam) {
      this.dateOfJoiningCurrentTeam = dateOfJoiningCurrentTeam;
   }

   public String getEmployeeStatus() {
      return employeeStatus;
   }

   public void setEmployeeStatus(String employeeStatus) {
      this.employeeStatus = employeeStatus;
   }

   public String getManagerId() {
      return managerId;
   }

   public void setManagerId(String managerId) {
      this.managerId = managerId;
   }

   public String getCurrentGradeCode() {
      return currentGradeCode;
   }

   public void setCurrentGradeCode(String currentGradeCode) {
      this.currentGradeCode = currentGradeCode;
   }

   public Date getConfirmationDate() {
      return confirmationDate;
   }

   public void setConfirmationDate(Date confirmationDate) {
      this.confirmationDate = confirmationDate;
   }

   public TeamDetailsInfo getTeamDetailsInfo() {
      return teamDetailsInfo;
   }

   public void setTeamDetailsInfo(TeamDetailsInfo teamDetailsInfo) {
      this.teamDetailsInfo = teamDetailsInfo;
   }

   public String toString() {
      return "EmployeeDetailsInfo [employeeId=" + employeeId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", gender=" + gender + ", dateOfBirth="
            + dateOfBirth + ", location=" + location + ", jobCode=" + jobCode + ", jobType=" + jobType + ", teamDetailsInfo=" + teamDetailsInfo + ", dateOfJoiningCompany=" + dateOfJoiningCompany
            + ", dateOfJoiningCurrentTeam=" + dateOfJoiningCurrentTeam + ", employeeStatus=" + employeeStatus + ", managerId=" + managerId + ", currentGradeCode=" + currentGradeCode
            + ", confirmationDate=" + confirmationDate + "]";
   }

}