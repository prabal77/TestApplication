/**
 * 
 */
package com.wellsfargo.tme.business;

import java.util.HashMap;
import java.util.Map;
import com.wellsfargo.tme.exception.NonFatalException;
import com.wellsfargo.tme.model.UserLoginInfo;

/**
 * @author Prabal Nandi
 *
 */
public class LoginProcessBean {
   private static Map<String, UserLoginInfo> dummyLoginTable = new HashMap<String, UserLoginInfo>();
   static {
      dummyLoginTable.put("prabal", new UserLoginInfo("prabal", "prabal", "MANAGER", "1446566"));
      dummyLoginTable.put("guru", new UserLoginInfo("guru", "guru", "EMPLOYEE", "1445010"));
      dummyLoginTable.put("anand", new UserLoginInfo("anand", "microsoft", "ADMIN", "1443000"));
   }

   public static UserLoginInfo processLogin(String userName, String password) {
      // Dummy logic for Login
      if (userName == null || userName.equals("") || password == null || password.equals(""))
         throw new NonFatalException("User Name or Password is Empty");
      if (dummyLoginTable.containsKey(userName.toLowerCase()) && (dummyLoginTable.get(userName.toLowerCase())).getPassword().equals(password)) {
         return dummyLoginTable.get(userName.toLowerCase());
      }
      throw new NonFatalException("User Name or Password is incorrect. Try again with correct credentials");
   }
}