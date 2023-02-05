/* ICS 111 Assignment 10
   Robert Warner Section 5
   Due November 20, 2022 */

import java.util.*;
import java.io.*;

public class VoterNames {
    public static void main(String args[]) throws FileNotFoundException {
        ArrayList<Voter> voters = new ArrayList<Voter>();
        voters = VoterNames.readFile();

        Collections.sort(voters);

        VoterNames.writeFile(voters);

        for (Voter p : voters) {
            System.out.println(p.getLName() + "," + p.getFName() + " (" + p.getGender() + ")");
            System.out.println("District: " + p.getDistrict());
            System.out.println(p.getAddress() + "\n");
        }
    }

    public static ArrayList<Voter> readFile() throws FileNotFoundException {     //read file and return an array list of voter objects method
        File inFile = new File("HI_Island_Voters.csv");
        Scanner scan = new Scanner(inFile);
        ArrayList<Voter> complete = new ArrayList<Voter>();

        int district;
        String line;
        String[] lineSpaced;

        while (scan.hasNextLine()) {
            line = scan.nextLine();
            lineSpaced = line.split(",");
            district = Integer.parseInt(lineSpaced[0]);
            complete.add(new Voter(district, lineSpaced[1], lineSpaced[2], lineSpaced[3], lineSpaced[4]));
        }
        scan.close();

        System.out.println(complete.size() + " voters created.");
        System.out.println("District 1: " + Voter.getD1Voters());
        System.out.println("District 2: " + Voter.getD2Voters());
        System.out.println("District 3: " + Voter.getD3Voters());
        System.out.println("District 4: " + Voter.getD4Voters() + "\n");

        return complete;
    }

    public static void writeFile(ArrayList<Voter> v) throws FileNotFoundException {     //write to file method
        PrintWriter outFile = new PrintWriter("HI_Island_Voters_Sorted2.csv");

        for (Voter p : v) {
            outFile.println(p.getDistrict() + "," + p.getLName() + "," + p.getFName() + "," + p.getGender() + "," + p.getAddress());
        }

        outFile.close();
    }
}
class Voter implements Comparable<Voter> {
    private static int nVoters = 0;
    private static int d1Voters = 0;
    private static int d2Voters = 0;
    private static int d3Voters = 0;
    private static int d4Voters = 0;
    private String fName, lName, gender, address;
    private int district;
    
    public Voter(int d, String ln, String fn, String g, String a) {    //constructor
        fName = fn;
        lName = ln;
        gender = g;
        address = a;
        district = d;

        if (d == 1) {    //counting the number of voters each district has
            d1Voters++;
        } else if (d == 2) {
            d2Voters++;
        } else if (d == 3) {
            d3Voters++;
        } else {
            d4Voters++;
        }
    }
    public static int getNVoters() {    //accessor returns number of voters
        return nVoters;
    }
    public static int getD1Voters() {    //accessor returns d1 voters
        return d1Voters;
    }
    public static int getD2Voters() {    //accessor returns d2 voters
        return d2Voters;
    }
    public static int getD3Voters() {    //accessor returns d3 voters
        return d3Voters;
    }
    public static int getD4Voters() {    //accessor returns d4 voters
        return d4Voters;
    }
    public int getDistrict() {    //accessor returns district number
        return district;
    }
    public String getFName() {    //accessor returns first name
        return fName;
    }
    public String getLName() {    //accessor returns last name
        return lName;
    }
    public String getGender() {    //accessor returns gender
        return gender;
    }
    public String getAddress() {    //accessor returns address
        return address;
    }
    public int compareTo(Voter w) {    //sorting by district and name code
        return (Integer.toString(this.getDistrict()) + this.getLName() + this.getFName()).compareTo(Integer.toString(w.getDistrict()) + w.getLName() + w.getFName());
    }
/*  public int compareTo(Voter w) {                         //Sorting by district code
        if (this.getDistrict() > w.getDistrict()) {
            return 1;
        } else if (this.getDistrict() < w.getDistrict()) {
            return -1;
        } else {
            return 0;
        }
    }  */
}