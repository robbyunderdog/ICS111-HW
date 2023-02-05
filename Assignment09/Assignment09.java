import java.util.*;

public class Assignment09 {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      
      ArrayList<String> people = new ArrayList<String>();
      
      while (1>0) {
          System.out.print("Command: ");
          String command = input.nextLine();
          
          if (command.equals("")) {
              System.out.println("Done.");
              break;
          } else if (command.charAt(0) == '+') {
              Voter person = new Voter(command.replace("+", ""));
              people.add(person.toString());
          } else if (command.charAt(0) == '-') {
                String name = command.replace("-", "");
                for (int i = 0; i < people.size(); i++) {
                    String temp = people.get(i);
                    if (temp.contains(name)) {
                        people.remove(i);
                        i = people.size();
                    }
                }
          } else {
              System.out.println("No action taken.");
          }
          System.out.println(people);
      }
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