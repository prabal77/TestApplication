/**
 * 
 */
package com.wellsfargo.tme.model;
import java.io.Serializable;
/**
 * @author Prabal Nandi
 *
 */
public class AwardDetailsInfo  implements Serializable{
   private String awardId;
   private String awardType;
   private String awardDescription;
   public AwardDetailsInfo() {
      super();
      // TODO Auto-generated constructor stub
   }
   public String getAwardId() {
      return awardId;
   }
   public void setAwardId(String awardId) {
      this.awardId = awardId;
   }
   public String getAwardType() {
      return awardType;
   }
   public void setAwardType(String awardType) {
      this.awardType = awardType;
   }
   public String getAwardDescription() {
      return awardDescription;
   }
   public void setAwardDescription(String awardDescription) {
      this.awardDescription = awardDescription;
   }
   @Override
   public String toString() {
      return "AwardDetailsInfo [awardId=" + awardId + ", awardType=" + awardType + ", awardDescription=" + awardDescription + "]";
   }
}