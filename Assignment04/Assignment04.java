/* ICS 111 Assignment 04
   Robert Warner Section 5
   Due September 25, 2022 */
   
   public class Assignment04 {
    public static void main(String[] args) {
        // Print the number of machines and number of votes from the
        // VotingMachine class before any voting machines are created.
        // Note to students: These are calls to static methods
        System.out.println("Number of voting machines: " + VotingMachine.getNMachines());
        System.out.println("Total number of votes cast: " + VotingMachine.getNVotes());
        
        // Create three voting machines
        System.out.println ("\nCreating voting machines.");
        VotingMachine vm1 = new VotingMachine("Kailua");
        VotingMachine vm2 = new VotingMachine("Kapolei");
        VotingMachine vm3 = new VotingMachine("Honolulu");
        
        // Print the number of machines and number of votes from the
        // VotingMachine class before any voting is recorded
        System.out.println("\nNumber of voting machines: " + VotingMachine.getNMachines());
        System.out.println("Total number of votes cast: " + VotingMachine.getNVotes());
        
        System.out.println("\nCasting votes...");
        
        // Votes on the first voting machine 
        vm1.voteForCandidate1("HL76983");
        vm1.voteForCandidate2("HL17522");
        vm1.voteForCandidate1("HL32437");
        System.out.println("Voting machine 1 done.");
        
        // Votes on the second voting machine
        vm2.voteForCandidate2("HL93952");
        vm2.voteForCandidate2("HL90310");
        vm2.voteForCandidate2("HL59293");
        vm2.voteForCandidate2("HL32346");
        vm2.voteForCandidate1("HL38385");
        System.out.println("Voting machine 2 done.");

         // Votes on the third voting machine
        vm3.voteForCandidate1("HL02845");
        vm3.voteForCandidate1("HL32710");
        vm3.voteForCandidate2("HL39835");
        System.out.println("Voting machine 3 done.");

        System.out.println("All done.");
        
        System.out.println("\nReport:");
        
        // Print the contents of each of the three voting machines
        System.out.println(vm1);
        System.out.println(vm2);
        System.out.println(vm3);

        // Print the number of machines and number of votes from the
        // VotingMachine class after voting has occurred
        System.out.println("\nNumber of voting machines: " + VotingMachine.getNMachines());
        System.out.println("Total number of votes cast: " + VotingMachine.getNVotes());
    }
}

class VotingMachine {    //main voting class
    private int candidate1Votes = 0;    //votes for candidate 1
    private int candidate2Votes = 0;    //votes for candidate 2
    private static int nMachines = 0;    //number of instances
    private static int nVotes = 0;    //total number of votes
    private String machineName = "";
    private int machineNum = 0;
    
    private String voterIDS = "";    //voterID list
    
    public void voteForCandidate1(String ID) {    //main voting method for candidate 1
        voterIDS = voterIDS.concat(ID + " ");
        candidate1Votes++;
        nVotes++;
    }
    public void voteForCandidate2(String ID) {    //main voting method for candidate 2
        voterIDS = voterIDS.concat(ID + " ");
        candidate2Votes++;
        nVotes++;
    }
    public static int getNMachines() {    //number of instances method
        return nMachines;
    }
    public static int getNVotes() {    //number of votes method
        return nVotes;
    }
    
    public VotingMachine(String x) {    //constructor
        machineName = x;
        nMachines++;
        machineNum = nMachines;
    }
    
    public String toString() {
        return "\nVoting Machine: " + machineNum + "\nVoting District: " + machineName + "\nNumber of Votes for Candidate 1: " + candidate1Votes + "\nNumber of Votes for Candidate 2: " + candidate2Votes + "\nVoter list: " + voterIDS + "\n";
    }
}