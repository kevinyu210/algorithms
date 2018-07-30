import java.util.*;

public class oneAway {
  public static void main(String[] args) {
    System.out.println(check("potato", "potat"));
    System.out.println(check("potato", "potato"));
    System.out.println(check("pota", "potato"));
    System.out.println(check("potato", "pota"));
    System.out.println(check("potato", "potat"));

  }
  public static boolean check(String str1, String str2) {
    char[] phrase1 = str1.toCharArray();
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    for (int i = 0; i< phrase1.length; i++) {
      char key = phrase1[i];
      if (map.containsKey(key)) {
        map.put(key, map.get(key) + 1);
      } else {
        map.put(key,1);
      }
    }
    char[] phrase2 = str2.toCharArray();
    for (int j = 0; j< phrase2.length; j++) {
      char key = phrase2[j];
      if (map.containsKey(key)) {
        map.put(key, map.get(key) - 1);
      } else {
        map.put(key, 1);
      }
    }
    int count = 0;
    for (char letter : map.keySet()) {
      if (map.get(letter)!=0) {
        count++;
      }
    }
    if (count >1) {
      return false;
    } else {
      return true;
    }
  }
}
