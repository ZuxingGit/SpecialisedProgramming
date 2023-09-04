package topcoder.wk2;

import java.util.Arrays;

public class DiceOperation {
    public static void main(String[] args) {
        int[] a1= {1,2,3};
        getCombinations(a1);
    }

    public static double solve(int[] dice) {
        int number = dice.length;   //number of dices
        if (number == 0)
            return 0;
        
        double expectV = 0;
        
        int total = 1;
        for (int i = 0; i < number; i++) {
            total = total * dice[i];    //number of all results
        }
        int[][] results= new int[total][number];    //Array of all combinations
        if (number > 1) {
            for (int i = 0; i < total; i++) {
                int[] combine = new int[number];
                
                for (int j = 0; j < number; j++) {
                    int faces = dice[j];    //faces of certain dice
                    for (int k = 1; k <= faces; k++) {
                        combine[j]=k;
                    }
                }
                results[i]=combine;
                
            }
            //            
            
        } else {
            
        }

        return expectV;
    }
    
    public static int[][] getCombinations(int[] dice){
        int number = dice.length;
        int total=1;
        for (int i = 0; i < number; i++) {
            total = total * dice[i];    //number of all results
        }
        int[][] results= new int[total][number];
        for (int i = 0; i < number; i++) {
            int[] combination=new int[number];
            int value=1;
            int faces=dice[i];
            while (i<number-1 && value<faces){
                
                value++;
            }
            
        }
        
        return results;
    }
}
