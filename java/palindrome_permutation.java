import java.util.*;
public class palindrome_permutation {
  public static void main(String[] args) {
    System.out.println(check("taco cat"));
    System.out.println(check("ocat tac"));
    System.out.println(check("atco cta"));

    System.out.println(check("potato potato potato potato"));
    System.out.println(check(" po tat o"));
  }
  public static boolean check(String word) {
    char space = ' ';
    HashMap<Character, Integer> map = new HashMap<Character,Integer>();
    for(int i = 0; i < word.length(); i++) {
      char letter = word.charAt(i);
      if (letter != space) {
        if (map.containsKey(letter)) {
          map.put(letter, map.get(letter) + 1);
        } else {
          map.put(letter,1);
        }
      }
    }
    Integer odds = 0;
    for (Character letter : map.keySet()) {
      if (map.get(letter) %2 == 1) {
        odds++;
      }
    }
    if (odds >1) {
      return false;
    } else {
      return true;
    }
  }
}
