import java.util.*;

public class twoSum {
    public static void main(String[] args) {
      int[] potato = {2,7,11,15};
      int target = 9;
      System.out.println(check(potato, target)[0]);
      System.out.println(check(potato, target)[1]);
    }
    public static int[] check(int[] nums, int target) {
        for (int i = 0; i< nums.length-1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                  int[] solution = {nums[i], nums[j]};
                  return solution;
                }
            }
        }
        int[] solution = {0,0};
        return solution;
    }
}
