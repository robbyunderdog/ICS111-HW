/* ICS 111 Assignment 05
   Robert Warner Section 5
   Due October 3, 2022 */

   import java.util.Scanner;

   public class Assignment05 {
       public static void main(String args[]) {
           Scanner voterInput = new Scanner(System.in);    //creating the scanner object
           
           System.out.print("Voter name: ");    //taking input
           String name = voterInput.nextLine();
           Voter voter1 = new Voter(name);    //creating instance voter1 with input as name
           System.out.println("Voter 1 created.");
           
           
           System.out.print("Voter name: ");    //taking input
           name = voterInput.nextLine();
           Voter voter2 = new Voter(name);    //creating instance voter2 with input as name
           System.out.println("Voter 2 created.");
           
           
           System.out.print("Voter name: ");    //taking input
           name = voterInput.nextLine();
           Voter voter3 = new Voter(name);    //creating instance voter3 with input as name
           System.out.println("Voter 3 created.\n");
           
           
           System.out.println(voter1);    //printing all the instance data
           System.out.println(voter2);
           System.out.println(voter3);
       }
   }
   
   class Voter {
       private static int nVoters = 0;
       private String name = "";
       private String voterID = "";
       
       public Voter(String n) {    //constructor
           name = n;
           nVoters++;
           voterID = "HI" + nVoters + name.length();
       }
       public static int getNVoters() {    //accessor returns number of voters
           return nVoters;
       }
       public String toString() {    //toString returns ID and name
           return voterID + " " + name;
       }
   }