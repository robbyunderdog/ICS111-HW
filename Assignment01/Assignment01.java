/* ICS 111 Assignment 01
   Robert Warner Section 5
   Due September 4, 2022 */

public class Assignment01 {
    public static void main(String[] args) {

        String myFirstName = "Robert"; //This is my first name
        String myLastName = "Warner"; //This is my last name
        int classNumber = 111;

        int nFirst = myFirstName.length();
        int nLast = myLastName.length();

        System.out.println("My name is " + myFirstName + " " + myLastName + ".");
        System.out.println("There are " + (nFirst+nLast) + " letters in my name.");
        System.out.println("This is my first assignment for ICS " + classNumber + ".");

    }
}