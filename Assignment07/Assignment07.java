/* ICS 111 Assignment 07
   Robert Warner Section 5
   Due October 23, 2022 */

import java.util.Scanner;

public class Assignment07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 0;

        while(i<3) {
            System.out.print("Username: ");
            String inputUser = input.nextLine();
            System.out.print("Type your current password: ");
            String inputPass = input.nextLine();

            if(Assignment07.userPasswordMatch(inputUser, inputPass)) {
                System.out.println("Login successful.");
                System.out.print("Type a new password: ");
                String newPass = input.nextLine();

                System.out.print("Retype the new password: ");
                String newPassCheck = input.nextLine();

                if (Assignment07.passwordChecker(newPass, newPassCheck)) {
                    System.out.println("Your password was changed to: " + newPass);
                    break;
                }
                else {
                    System.out.println("Your password was not changed.");
                    break;
                }
            }
            else {
                System.out.println("Try again.");
            }
            i++;
        }
    }

    public static boolean userPasswordMatch(String uIn, String pIn) {
        
        String[] user = {"alpha", "beta", "gamma", "delta"};
        String[] pass = {"alpha1", "beta1", "gamma1", "delta1"};

        for(int i = 0; i<user.length; i++) {
            if(user[i].equals(uIn) && pass[i].equals(pIn)) {
                return true;
            }
        } 
        return false;
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
