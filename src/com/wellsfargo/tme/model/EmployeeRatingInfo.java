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
public class EmployeeRatingInfo implements Serializable {
   private String employeeId;
   private String yearOfReview;
   private String reviewCycle;
   private String currentRating;
   private String currentGradeCode;
   private String targetGradeCode;
   private String lastRoleHeld;
   private Date dateOfReview;
   private String comments;
   public EmployeeRatingInfo() {
      // TODO Auto-generated constructor stub
   }
   public String getEmployeeId() {
      return employeeId;
   }
   public void setEmployeeId(String employeeId) {
      this.employeeId = employeeId;
   }
   public String getYearOfReview() {
      return yearOfReview;
   }
   public void setYearOfReview(String yearOfReview) {
      this.yearOfReview = yearOfReview;
   }
   public String getReviewCycle() {
      return reviewCycle;
   }
   public void setReviewCycle(String reviewCycle) {
      this.reviewCycle = reviewCycle;
   }
   public String getCurrentRating() {
      return currentRating;
   }
   public void setCurrentRating(String currentRating) {
      this.currentRating = currentRating;
   }
   public String getCurrentGradeCode() {
      return currentGradeCode;
   }
   public void setCurrentGradeCode(String currentGradeCode) {
      this.currentGradeCode = currentGradeCode;
   }
   public String getTargetGradeCode() {
      return targetGradeCode;
   }
   public void setTargetGradeCode(String targetGradeCode) {
      this.targetGradeCode = targetGradeCode;
   }
   public String getLastRoleHeld() {
      return lastRoleHeld;
   }
   public void setLastRoleHeld(String lastRoleHeld) {
      this.lastRoleHeld = lastRoleHeld;
   }
   public Date getDateOfReview() {
      return dateOfReview;
   }
   public void setDateOfReview(Date dateOfReview) {
      this.dateOfReview = dateOfReview;
   }
   public String getComments() {
      return comments;
   }
   public void setComments(String comments) {
      this.comments = comments;
   }
   @Override
   public String toString() {
      return "EmployeeRatingInfo [employeeId=" + employeeId + ", yearOfReview=" + yearOfReview + ", reviewCycle=" + reviewCycle + ", currentRating=" + currentRating + ", currentGradeCode="
            + currentGradeCode + ", targetGradeCode=" + targetGradeCode + ", lastRoleHeld=" + lastRoleHeld + ", dateOfReview=" + dateOfReview + ", comments=" + comments + "]";
   }
}