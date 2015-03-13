/**
 * 
 */
package com.wellsfargo.tme.ui.controller;

import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import com.wellsfargo.tme.TeamMemberManagement;
import com.wellsfargo.tme.business.EmployeeProcessBean;
import com.wellsfargo.tme.model.EmployeeDetailsInfo;
import com.wellsfargo.tme.model.UserLoginInfo;
import com.wellsfargo.tme.ui.object.EmployeeListDisplay;

/**
 * @author Prabal Nandi
 *
 */
public class ManagerHomeController implements ViewController {
   private TeamMemberManagement mainApplication;
   private ObservableList<EmployeeListDisplay> employeeListData;
   @FXML
   private TableView<EmployeeListDisplay> employeeListTable;

   @Override
   public void setMainApplication(Application application) {
      this.mainApplication = (TeamMemberManagement) application;
      init();
   }

   public void setErrorMessage(String message, int severity) {
      this.mainApplication.getCurrentHeaderController().setErrorMessage(message, severity);
   }

   public void init() {
      int count = 0;
      for (TableColumn column : employeeListTable.getVisibleLeafColumns()) {
         column.setCellValueFactory(EmployeeListDisplay.getPropertyValueFactoryList().get(count++));
      }
      this.employeeListTable.setItems(this.employeeListData);
   }

   @FXML
   public void loadData(ActionEvent event) {
      if (checkUserAuthentication()) {
         Task<ObservableList<EmployeeListDisplay>> task = new GetEmployeeListData(this.mainApplication.getLoggedUser().getEmployeeId());
         this.employeeListTable.itemsProperty().bind(task.valueProperty());
         new Thread(task).start();
      }
   }

   public boolean checkUserAuthentication() {
      UserLoginInfo loggedUser = this.mainApplication.getLoggedUser();
      if (loggedUser == null || !loggedUser.getRole().equalsIgnoreCase("MANAGER")) {
         setErrorMessage("Either User is not properly Logged in or not Authorised to see this view", TeamMemberManagement.ERROR_SEVERITY_ERROR);
         return false;
      }
      return true;
   }

   /**
    * Load Employee List Data Asynchronously
    * 
    * @author Prabal Nandi
    *
    */
   public class GetEmployeeListData extends Task<ObservableList<EmployeeListDisplay>> {
      private String userId;

      public GetEmployeeListData(String userId) {
         this.userId = userId;
      }

      protected ObservableList<EmployeeListDisplay> call() throws Exception {

         List<EmployeeDetailsInfo> employeeList = EmployeeProcessBean.getAllEmployeeListByManager(userId);
         ObservableList<EmployeeListDisplay> employeeDisplayList = FXCollections.observableArrayList();
         for (EmployeeDetailsInfo detailsInfo : employeeList) {
            EmployeeListDisplay employeeListDisplay = new EmployeeListDisplay();
            employeeListDisplay.setEmployeeID(detailsInfo.getEmployeeId());
            employeeListDisplay.setEmployeeName(detailsInfo.getFirstName(), detailsInfo.getMiddleName(), detailsInfo.getLastName());
            employeeListDisplay.setLocation((detailsInfo.getLocation()));
            employeeListDisplay.setAuCode(detailsInfo.getTeamDetailsInfo().getAuCode());
            employeeListDisplay.setProjectName(detailsInfo.getTeamDetailsInfo().getProjectName());
            employeeListDisplay.setJobCode(detailsInfo.getJobCode());
            employeeListDisplay.setJobType(detailsInfo.getJobType());
            employeeListDisplay.setManagerName(detailsInfo.getManagerId());
            employeeDisplayList.add(employeeListDisplay);
         }
         return employeeDisplayList;
      }
   }
}