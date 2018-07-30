import java.util.*;
public class zeroMatrix {
  public static void main(String[] args) {
    int[][] somematrix = { {1,1,1,1,1,0},
                         {1,1,1,1,1,1},
                         {0,0,1,1,1,1},
                         {1,1,1,1,1,3},
                         {2,4,5,2,6,1}};

    printMatrix(somematrix);
    System.out.println();
    zero(somematrix);
    printMatrix(somematrix);
  }
  public static void printMatrix(int[][] matrix) {
      for (int i = 0; i<matrix.length; i++) {
        for (int j = 0; j<matrix[i].length;j++) {
          System.out.print(matrix[i][j] + " ");
        }
        System.out.println("");
      }
    }
  public static void zero(int[][] matrix) {
    if (matrix.length == 0) {return;}
    int m = matrix.length;
    int n = matrix[0].length;
    boolean[] M = new boolean[m];
    boolean[] N = new boolean[n];
    for (int i = 0; i < m;i++) {
      for (int j = 0; j<n;j++) {
        if (matrix[i][j] == 0) {
          M[i] = true;
          N[j] = true;
        }
      }
    }
    for (int i = 0; i < m;i++) {
      if (M[i] == true) {
        matrix[i] = new int[n];
      } else {
        for (int j = 0; j<n;j++) {
          if (N[j] == true) { matrix[i][j] = 0;}
        }
      }
    }
  }
}
