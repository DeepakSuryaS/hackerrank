// Java program to find maximum sum of hourglass in matrix
import java.io.*;

class MaxHourGlassSum {
  static int R = 5;
  static int C = 5;

  // return max sum of hourglass in arr[][]
  static int findMaxSum(int [][]mat) {
    if(R < 3 || C < 3)
      return -1;
    
    // loop run (R-2)*(C-2) times considering different top left cells of hourglasses
    int max_sum = Integer.MIN_VALUE;
    for(int i = 0; i < R - 2; i++) {
      for(int j = 0; j < C - 2; j++) {
        // considering mat[i][j] as top left cell of hour glass
        int sum = (mat[i][j] + mat[i][j+1] + mat[i][j+2]) + 
                  (mat[i+1][j+1]) +
                  (mat[i+2][j] + mat[i+2][j+1] + mat[i+2][j+2]);
        
        // if previous sum is less than current sum, update new sum in max_sum
        max_sum = Math.max(max_sum, sum);
      }
    }
    return max_sum;
  }

  public static void main(String[] args) {
    int [][]mat = { {1, 2, 3, 0, 0}, 
                    {0, 0, 0, 0, 0}, 
                    {2, 1, 4, 0, 0}, 
                    {0, 0, 0, 0, 0}, 
                    {1, 1, 0, 1, 0} }; 
    int res = findMaxSum(mat);
    if(res == -1) {
      System.out.println("Not possible");
    } else {
      System.out.println(res);
    }
  }
}

