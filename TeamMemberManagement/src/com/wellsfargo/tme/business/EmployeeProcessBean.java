/**
 * 
 */
package com.wellsfargo.tme.business;

import java.util.ArrayList;
import java.util.List;

import com.wellsfargo.tme.model.EmployeeDetailsInfo;
import com.wellsfargo.tme.model.TeamDetailsInfo;

/**
 * @author Prabal Nandi
 *
 */
public class EmployeeProcessBean {

   public static List<EmployeeDetailsInfo> getAllEmployeeListByManager(String managerId) {
      List<EmployeeDetailsInfo> dummyList = new ArrayList<EmployeeDetailsInfo>(15);
      boolean flip = true;
      for (int i = 0; i < 15; i++) {
         EmployeeDetailsInfo employeeDetailsInfo = new EmployeeDetailsInfo();
         employeeDetailsInfo.setEmployeeId(String.valueOf((14456 + ((int) Math.random() * 100 + i))));
         employeeDetailsInfo.setFirstName("First " + i);
         employeeDetailsInfo.setMiddleName("Middle " + i);
         employeeDetailsInfo.setLastName("Last " + i);
         if (flip) {
            employeeDetailsInfo.setLocation("Hyderabad");
            flip = false;
         }
         else {
            employeeDetailsInfo.setLocation("Bangalore");
            flip = true;
         }
         TeamDetailsInfo teamDetailsInfo = new TeamDetailsInfo();
         teamDetailsInfo.setAuCode("AU45456");
         teamDetailsInfo.setProjectName("DummyProject " + i);
         employeeDetailsInfo.setTeamDetailsInfo(teamDetailsInfo);
         employeeDetailsInfo.setJobCode("ASE 4");
         employeeDetailsInfo.setJobType("FTE");
         employeeDetailsInfo.setManagerId(managerId);
         dummyList.add(employeeDetailsInfo);
      }
      return dummyList;
   }
}
