package HackerRank;
import java.util.*;


/*                        INSTRUCTION
Problem: Diagonal Difference

Given a square matrix, calculate the absolute difference between the sums of its primary and secondary diagonals.

Time Complexity: O(n)
Space Complexity: O(1)

*/

public class DiagonalDifference {
    
 public static int diagonalDifference(List<List<Integer>> arr) {

        int leftDiagonal = 0;
        int rightDiagonal = 0;

        int n = arr.size();

        for (int i = 0; i < n; i++) {
            leftDiagonal += arr.get(i).get(i);
            rightDiagonal += arr.get(i).get(n - 1 - i);
        }

        return Math.abs(leftDiagonal - rightDiagonal);
    }


    public static void main(String[] args){

    List<List<Integer>> matrix = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(9, 8, 9)
        );

        System.out.println("Diagonal Difference: "+diagonalDifference(matrix));
    }




}
