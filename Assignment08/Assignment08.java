/* ICS 111 Assignment 08
   Robert Warner Section 5
   Due October 30, 2022 */

public class Assignment08 {
    public static void main(String args[]) {
        int winner;
        String[] name = {"Grace Hopper", "Ada Lovelace", "Katherine Johnson", "Frances Allen", "Shafi Goldwasser"}; 
        int[][] group1 = { {1,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0},    
                           {0,0,0,1,0,0,0,0,1,0,0,1,1,1,0,0,0,0,1,0}, 
                           {0,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0}, 
                           {0,1,0,0,0,0,1,0,0,0,0,0,0,0,1,1,1,1,0,1}, 
                           {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0} };

        int[][] group2 = { {0,0,1,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0}, 
                           {0,0,0,1,0,0,0,0,0,1,0,0,0,1,1,1,0,0,0,1}, 
                           {1,1,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0}, 
                           {0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,0,0}, 
                           {0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,1,0,0,0} };

        System.out.println("Voting Group 1");
        winner = winnerIndex(group1,name);
        System.out.println("The winner is " + name[winner]);
        System.out.println("Raw data row x column: ");
        printAllData(group1);
        System.out.println("Raw data column x row: ");
        printTransposeData(group1);

        System.out.println("\nVoting Group 2");
        winner = winnerIndex(group2,name);
        System.out.println("The winner is " + name[winner]);
        System.out.println("Raw data row x column: ");
        printAllData(group2);
        System.out.println("Raw data column x row: ");
        printTransposeData(group2);
    }

    public static int winnerIndex(int[][] votes, String[] names) {
        int[] results;
        results = new int[5];

        int tempBig = 0;
        int temp = 0;

        int winningIndex = 0;

        for (int i = 0; i<votes.length; i++) {
            for (int j = 0; j<votes[i].length; j++) {
                if (votes[i][j] == 1) {
                    temp++;
                }
            }

            results[i] = temp; 

            if (temp > tempBig) {
                tempBig = temp;
            }

            System.out.println("Votes for " + names[i] + " = " + temp);
            temp = 0;
        }

        winningIndex = getArrayIndex(results, tempBig);

        return winningIndex;
    }

    public static void printAllData(int[][] data) {
        for (int i = 0; i<data.length; i++) {
            for (int j = 0; j<data[i].length; j++) {
                System.out.print(data[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void printTransposeData(int[][] data) {
        for (int i = 0; i<data[0].length; i++) {
            for (int j = 0; j<data.length; j++) {
                System.out.print(data[j][i]);
            }
            System.out.print("\n");
        }
    }

    public static int getArrayIndex(int[] arr,int value) {

        int k=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==value){
                k=i;
                break;
            }
        }
        return k;
    }

}

