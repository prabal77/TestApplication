/**
 * 
 */
package com.wellsfargo.tme.model;
import java.io.Serializable;
/**
 * @author Prabal Nandi
 *
 */
public class TeamDetailsInfo implements Serializable {
   private String teamUID;
   private String auCode;
   private String lobID;
   private String projectName;
   private String subProjectName;
   private String dioID;
   private String usManagerID;
   private String usManagerFirstName;
   private String usManagerLastName;
   private String managerID;
   public TeamDetailsInfo() {
      super();
   }
   public String getTeamUID() {
      return teamUID;
   }
   public void setTeamUID(String teamUID) {
      this.teamUID = teamUID;
   }
   public String getAuCode() {
      return auCode;
   }
   public void setAuCode(String auCode) {
      this.auCode = auCode;
   }
   public String getLobID() {
      return lobID;
   }
   public void setLobID(String lobID) {
      this.lobID = lobID;
   }
   public String getProjectName() {
      return projectName;
   }
   public void setProjectName(String projectName) {
      this.projectName = projectName;
   }
   public String getSubProjectName() {
      return subProjectName;
   }
   public void setSubProjectName(String subProjectName) {
      this.subProjectName = subProjectName;
   }
   public String getDioID() {
      return dioID;
   }
   public void setDioID(String dioID) {
      this.dioID = dioID;
   }
   public String getUsManagerID() {
      return usManagerID;
   }
   public void setUsManagerID(String usManagerID) {
      this.usManagerID = usManagerID;
   }
   public String getUsManagerFirstName() {
      return usManagerFirstName;
   }
   public void setUsManagerFirstName(String usManagerFirstName) {
      this.usManagerFirstName = usManagerFirstName;
   }
   public String getUsManagerLastName() {
      return usManagerLastName;
   }
   public void setUsManagerLastName(String usManagerLastName) {
      this.usManagerLastName = usManagerLastName;
   }
   public String getManagerID() {
      return managerID;
   }
   public void setManagerID(String managerID) {
      this.managerID = managerID;
   }
   @Override
   public String toString() {
      return "TeamDetailsInfo [teamUID=" + teamUID + ", auCode=" + auCode + ", lobID=" + lobID + ", projectName=" + projectName + ", subProjectName=" + subProjectName + ", dioID=" + dioID
            + ", usManagerID=" + usManagerID + ", usManagerFirstName=" + usManagerFirstName + ", usManagerLastName=" + usManagerLastName + ", managerID=" + managerID + "]";
   }
}