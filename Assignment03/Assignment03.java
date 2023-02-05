/* ICS 111 Assignment 03
   Robert Warner Section 5
   Due September 18, 2022 */

   public class Assignment03 {
    public static void main(String[] args) {
        VotingMachine vm1 = new VotingMachine();    //new voting machine instance vm1
        VotingMachine vm2 = new VotingMachine();    //new voting machine instance vm2
        
        //Votes on the first voting machine
        vm1.voteForCandidate1("HL76983");
        vm1.voteForCandidate2("HL17522");
        vm1.voteForCandidate1("HL32437");
        vm1.voteForCandidate1("HL02845");
        vm1.voteForCandidate1("HL32710");
        vm1.voteForCandidate2("HL39835");

        //Votes on the second voting machine
        vm2.voteForCandidate2("HL93952");
        vm2.voteForCandidate1("HL38385");
        vm2.voteForCandidate2("HL90310");
        vm2.voteForCandidate2("HL59293");
        vm2.voteForCandidate2("HL32346");
        
        System.out.println("Voter ID List: " + (vm1.vIDS() + vm2.vIDS()));    //outputs all the voter ids
        System.out.println("Total Number of votes: " + (vm1.c1Votes() + vm1.c2Votes() + vm2.c1Votes() + vm2.c2Votes()));    //outputs total amount of votes
        System.out.println("Votes for candidate 1: " + (vm1.c1Votes() + vm2.c1Votes()));    //outputs votes for candidate 1
        System.out.println("Votes for candidate 2: " + (vm1.c2Votes() + vm2.c2Votes()));    //outputs votes for candidate 2
    }
}

class VotingMachine {    //main voting class
    private int candidate1Votes = 0;    //votes for candidate 1
    private int candidate2Votes = 0;    //votes for candidate 2
    
    private String voterIDS = "";    //voterID list
    
    public void voteForCandidate1(String ID) {    //main voting method for candidate 1
        voterIDS = voterIDS.concat(ID + " ");
        candidate1Votes++;
    }
    public void voteForCandidate2(String ID) {    //main voting method for candidate 2
        voterIDS = voterIDS.concat(ID + " ");
        candidate2Votes++;
    }
    
    public int c1Votes() {    //accessor method for candidate 1
        return candidate1Votes;
    }
    public int c2Votes() {    //accessor method for candidate 2
        return candidate2Votes;
    }
    public String vIDS() {    //accessor method for voter ids
        return voterIDS;
    }
}