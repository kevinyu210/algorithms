import java.util.*;
// method to replace all spaces in a string with '%20'.
// you ma yassume that the string has sufficient space at the end to hold additional characters.
// true length of string. Use character array so that you can perfomr this operation in place.
public class URLify {
  public static void main(String[] args) {
    System.out.println(url("pota t o"));
  }
  public static String url(String word) {
    char space = ' ';
    String back = "";
    for (int i = 0; i < word.length(); i++) {
      char letter = word.charAt(i);
      if (letter == space) {
        back = back + "%20";

      } else {
        back = back + letter;
      }
    }
    return back;
  }
}
