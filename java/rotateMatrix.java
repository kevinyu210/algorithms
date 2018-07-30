import java.util.*;
public class rotateMatrix {
  public static void main(String[] args) {
    int[][] meow = {{1,1,1,2},
                    {4,5,6,2},
                    {4,8,7,2},
                    {4,3,3,3}};
    printMatrix(meow);
    rotate(meow);
    System.out.println();
    printMatrix(meow);
    boolean[] potato = new boolean[5];
    System.out.println(potato[0]);
  }
  public static void printMatrix(int[][] matrix) {
    for (int i = 0; i<matrix.length; i++) {
      for (int j = 0; j<matrix[i].length;j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println("");
    }
  }
  public static void rotate(int[][] matrix) {
    if (matrix.length == 0) {
      return;
    }
    if (matrix.length != matrix[0].length) {
      return;
    }
    int layers = matrix.length/2;
    for (int i = 0; i< layers; i++) {
      int last = matrix.length - i - 1;
      for (int j = i; j<last; j++) {
        int temp = matrix[i][i+j];
        matrix[i][j] = matrix[matrix.length -j -1][i];
        matrix[matrix.length -j -1][i] = matrix[last][matrix.length-j-1];
        matrix[last][matrix.length-j-1] = matrix[j][last];
        matrix[i+j][last] = temp;
      }
    }
  }
}
