/* ICS 111 Assignment 06
   Robert Warner Section 5
   Due October 17, 2022 */

   import java.util.Scanner;

   public class Assignment06 {
   
       public static void main(String[] args) {
           String mainPass = "ICS111";
           
           Scanner Input = new Scanner(System.in);
           
           System.out.print("Type your current password: ");
           String pass = Input.nextLine();
           
           if (mainPass.equals(pass)) {
               System.out.print("Type a new password: ");
               String newPass = Input.nextLine();
               
               System.out.print("Retype the new password: ");
               String newPassCheck = Input.nextLine();
               
               if (assignment06.passwordChecker(newPass, newPassCheck)) {
                   System.out.println("Your password was changed to: " + newPass);
               }
               else {
                   System.out.println("Your password was not changed.");
                   System.exit(0);
               }
               System.exit(0);
           } 
           else {
               System.out.println("Password not recognized.");
               System.exit(0);
           }
           
       }
       
       public static boolean passwordChecker(String x, String y) {
           boolean result = false;
           
           if (x.equals(y)) {
               if (x.length() > 6) {
                   if (x.contains(" ")){
                       System.out.println("Your new password can not have spaces.");
                       return result;
                   } 
                   else {
                       if (x.contains("!") || x.contains("$") || x.contains("?")) {
                           result = true;
                       }
                       else {
                           System.out.println("Your password must contain ! or $ or ?");
                           return result;
                       }
                   }
               }
               else {
                   System.out.println("Your new password must contain 6 or more characters.");
                   return result;
               }
           }
           else {
               System.out.println("Your new passwords do not match.");
               return result;
           }
           
           return result;
       }
   
   }
   
   