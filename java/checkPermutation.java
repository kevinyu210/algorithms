import java.util.*;
import org.junit.Test;
import org.junit.Assert.*;
// check if 1 string is a permutation of another.
public class checkPermutation {
  public static void main(String[] args) {
    System.out.println(check("asdf", "ssdf"));
    System.out.println(check("asdf", "fdas"));
    System.out.println(check("as", "asas"));
    System.out.println(check("", "asd"));
    System.out.println(Character.getNumericValue("a ".charAt(1)));
  }
  public static boolean check(String str1, String str2) {
    if (str1.length() != str2.length()) {
      System.out.println("strings not equal length");
      return false;
    }
    HashMap<Integer, Integer> map1 = new HashMap<Integer,Integer>();
    HashMap<Integer, Integer> map2 = new HashMap<Integer,Integer>();
    for (int i = 0; i <str1.length() ; i++) {
      int key = str1.charAt(i);
      int key2 = str2.charAt(i);
      if (map1.containsKey(key)) {
        map1.put(key, map1.get(key) + 1);
      }
      else {
        map1.put(key,1);
      }
      if (map2.containsKey(key2)) {
        map2.put(key, map2.get(key2) + 1);
      }
      else{
        map2.put(key2, 1);
      }
    }
    for (int i = 0; i<str1.length(); i++) {
      int key = str1.charAt(i);
      if (map1.get(key) != map2.get(key)) {
        System.out.println("Different count(null if letter not in other word)");
        return false;
      }
    }
    System.out.println("same count for all letters");
    return true;
  }
}

// NLOGN time solution would just sort it NLOGN and then see if strings are the same.
