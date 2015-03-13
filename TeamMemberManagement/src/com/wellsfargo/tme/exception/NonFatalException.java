/**
 * 
 */
package com.wellsfargo.tme.exception;
import java.util.Arrays;
/**
 * @author Prabal Nandi
 *
 */
public class NonFatalException extends RuntimeException {
   public NonFatalException(String message, Throwable cause) {
      super(message, cause);
      // TODO Auto-generated constructor stub
   }
   public NonFatalException(String message) {
      super(message);
      // TODO Auto-generated constructor stub
   }
   public NonFatalException(Throwable cause) {
      super(cause);
      // TODO Auto-generated constructor stub
   }
   
   public String getStackTraceAsString(){
      return Arrays.toString(getStackTrace());
   }
   @Override
   public String toString() {
      return "NonFatalException [getMessage()=" + getMessage() + ", getStackTrace()=" + Arrays.toString(getStackTrace()) + "]";
   }
}