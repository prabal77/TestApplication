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
public class AwardTransactionInfo implements Serializable{
   private String transactionId;
   private String employeeId;
   private String awardId;
   private Date dateOfAward;
   private String managerId;
   private String comments;
   public AwardTransactionInfo() {
      super();
      // TODO Auto-generated constructor stub
   }
   public String getTransactionId() {
      return transactionId;
   }
   public void setTransactionId(String transactionId) {
      this.transactionId = transactionId;
   }
   public String getEmployeeId() {
      return employeeId;
   }
   public void setEmployeeId(String employeeId) {
      this.employeeId = employeeId;
   }
   public String getAwardId() {
      return awardId;
   }
   public void setAwardId(String awardId) {
      this.awardId = awardId;
   }
   public Date getDateOfAward() {
      return dateOfAward;
   }
   public void setDateOfAward(Date dateOfAward) {
      this.dateOfAward = dateOfAward;
   }
   public String getManagerId() {
      return managerId;
   }
   public void setManagerId(String managerId) {
      this.managerId = managerId;
   }
   public String getComments() {
      return comments;
   }
   public void setComments(String comments) {
      this.comments = comments;
   }
   @Override
   public String toString() {
      return "AwardTransactionInfo [transactionId=" + transactionId + ", employeeId=" + employeeId + ", awardId=" + awardId + ", dateOfAward=" + dateOfAward + ", managerId=" + managerId
            + ", comments=" + comments + "]";
   }
}