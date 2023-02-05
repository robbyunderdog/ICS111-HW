/* ICS 111 Assignment 02
   Robert Warner Section 5
   Due September 13, 2022 */

public class Assignment02 {
    public static void main(String args[]) {
      String data = "A string is an object in Java.";
      
      int observedLength = data.length();  //length method variables
      int expectedLength = 30;
      boolean lengthMatch;
      
      String observedSubstring = data.substring(15, 21);  //substring method variables
      String expectedSubstring = "object";
      boolean substringMatch;
      
      String allCapsString = data.substring(25, 29);  //all caps method variables
      String observedAllCaps = allCapsString.toUpperCase();
      String expectedAllCaps = "JAVA";
      boolean allCapsMatch;
      
      if (observedLength == expectedLength) {  //checking if observed and expected lengths match
          lengthMatch = true;
      } else {
          lengthMatch = false;
      }
      
      if (observedSubstring.equals(expectedSubstring) == true) {  //checking if observed and expected substrings match
          substringMatch = true;
      } else {
          substringMatch = false;
      }
      
      if (observedAllCaps.equals(expectedAllCaps) == true) {  //checking if observed and expected all caps match
          allCapsMatch = true;
      } else {
          allCapsMatch = false;
      }
      
      System.out.println("Data: " + data + "\n");  //printing outputs
      System.out.println("Length\nObserved: " + observedLength + "\nExpected: " + expectedLength + "\nMatch: " + lengthMatch + "\n");  //printing length data
      System.out.println("Substring\nObserved: " + observedSubstring + "\nExpected: " + expectedSubstring + "\nMatch: " + substringMatch + "\n");  //printing substring data
      System.out.println("All caps\nObserved: " + observedAllCaps + "\nExpected: " + expectedAllCaps + "\nMatch: " + allCapsMatch);  //printing all caps data
    }
}