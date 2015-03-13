/**
 * 
 */
package com.wellsfargo.tme.model;
import java.io.Serializable;
import java.util.List;
/**
 * @author Prabal Nandi
 *
 */
public class EmployeeReportingInfo implements Serializable {
   private String reportingId;
   private String employeeId;
   private String teamDetailsId;
   private List<EmployeeDetailsInfo> employeesReporting;
   public EmployeeReportingInfo() {
      super();
      // TODO Auto-generated constructor stub
   }
   public String getReportingId() {
      return reportingId;
   }
   public void setReportingId(String reportingId) {
      this.reportingId = reportingId;
   }
   public String getEmployeeId() {
      return employeeId;
   }
   public void setEmployeeId(String employeeId) {
      this.employeeId = employeeId;
   }
   public String getTeamDetailsId() {
      return teamDetailsId;
   }
   public void setTeamDetailsId(String teamDetailsId) {
      this.teamDetailsId = teamDetailsId;
   }
   public List<EmployeeDetailsInfo> getEmployeesReporting() {
      return employeesReporting;
   }
   public void setEmployeesReporting(List<EmployeeDetailsInfo> employeesReporting) {
      this.employeesReporting = employeesReporting;
   }
   @Override
   public String toString() {
      return "EmployeeReportingInfo [reportingId=" + reportingId + ", employeeId=" + employeeId + ", teamDetailsId=" + teamDetailsId + ", employeesReporting=" + employeesReporting + "]";
   }
}