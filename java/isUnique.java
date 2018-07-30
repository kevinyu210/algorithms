import java.util.*;

public class isUnique{
  public static void main(String[] args) {
    System.out.print(isUnique1("potato"));
  }
  // assuming string is of ASCII so 128 characters
  public static boolean isUnique1(String string) {
    if (string.length() == 0) {

    }
    if (string.length() >128) {
      return false;
    }
    boolean[] vector = new boolean[128];
    for (int i = 0; i<string.length(); i++) {
      int val = string.charAt(i);
      if (vector[val] == true) {
        return false;
      }
      vector[val] = true;
    }
    return true;
  }

  // This one uses a Hashmap. Add to hashmap and if exists already then return false 
}
