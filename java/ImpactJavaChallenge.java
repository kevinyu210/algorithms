import java.util.*;

public class ImpactJavaChallenge {
    public static void main(String[] args) {
        System.out.println("listGenerator Tests:");
        int x[] = {0, 1, 5, 6, 1, 3, 1, 2, 3, 3, 3, 1, 6, 100, 101};
        System.out.println(listGenerator(x));
        System.out.println(listGenerator(new int[]{1, 2, 3}));
        System.out.println(listGenerator(new int[]{}));
        System.out.println(listGenerator(new int[]{1,1}));
        System.out.println(listGenerator(new int[]{1,1,5}));
        System.out.println(listGenerator(new int[]{1,5,5}));

        System.out.println("\ntoGoodString Tests:");
        System.out.println(toGoodString("hi there!!!!\\!"));
        System.out.println(toGoodString(""));
        System.out.println(toGoodString("hii"));
        System.out.println(toGoodString("hii there."));
        System.out.println(toGoodString("hh"));
        System.out.println(toGoodString("h"));

        System.out.println("\ndistinctNumbers Tests:");
        System.out.println(distinctNumbers(x));
        System.out.println(distinctNumbers(new int[]{}));
        System.out.println(distinctNumbers(new int[]{1}));
        System.out.println(distinctNumbers(new int[]{0,0}));
        System.out.println(distinctNumbers(new int[]{1,2,3,1,2,3}));
        System.out.println(distinctNumbers(new int[]{1,1,1,1,1,1}));
        System.out.println(distinctNumbers(new int[]{9,1,2,3,4,4,5,6,7,8}));


        System.out.println("\ncompleteValidator Tests:");
        System.out.println(completeValidator("Hi There"));
        System.out.println(completeValidator("abcdefghijklmnopqrsTUVWXZzzzzzY"));
        System.out.println(completeValidator("abcdefghijk lmnopqrsTUVWXZzzzzzY"));
        System.out.println(completeValidator("abcdefghijk lmnopqrsTUVWXZzzzzzY?"));
        System.out.println(completeValidator(""));
        System.out.println(completeValidator("abcdefghijklmnopq123456789"));
    }

    // Challenge #1
    // assume input is an array of whole numbers
    // assume output is a string
    // assume input array should be sorted so that numbers can be grouped in ranges
    // keeping duplicates if present
    private static String listGenerator(int[] x) {
        String listOfNumbers = "";

        if (x.length == 0) listOfNumbers = "No Numbers";

        if (x.length == 1) listOfNumbers = String.valueOf(x[0]);

        if (x.length > 1) {
            Arrays.sort(x);

            for (int index = 0; index < x.length; index++) {
                // if first value
                if (index == 0) {
                    listOfNumbers += (x[index + 1] == x[index] + 1) ? x[index] : (x[index] + ", ");
                }
                // if last value
                if (index == x.length - 1) {
                    listOfNumbers += (x[index - 1] == x[index] - 1) ? ("-" + x[index]) : (x[index]);
                }
                // for all other values
                if (index > 0 && index < (x.length - 1)) {
                    // if previous is sequential
                    if (x[index - 1] == x[index] - 1) {
                        // if next is sequential, move on to next iteration
                        // if next is not sequential
                        if (x[index + 1] != x[index] + 1) listOfNumbers += ("-" + x[index] + ", ");
                    }
                    // if previous is not sequential
                    else {
                        // if next is sequential
                        if (x[index + 1] == x[index] + 1) listOfNumbers += x[index];
                        // if next is not sequential
                        else listOfNumbers += (x[index] + ", ");
                    }
                }
            }
        }

        return listOfNumbers;
    }

    // Challenge # 2
    // assuming all lowercase
    // not deleting duplicate punctuation marks
    private static String toGoodString(String S) {
        String goodString = "";

        for (int index = 0; index < S.length(); index++) {
            goodString += S.charAt(index);
            if (Character.isLetter(S.charAt(index))) {
                while (index < S.length() - 1) {
                    if (S.charAt(index) == S.charAt(index + 1)) {
                        index++;
                    } else break;
                }
            }
        }

        return goodString;
    }

    // Challenge #3
    // assume output returned in ascending order
    private static ArrayList<Integer> distinctNumbers(int[] x) {
        Set<Integer> numbers = new HashSet<Integer>();

        for(int number: x) {
            numbers.add(number);
        }

        ArrayList<Integer> distinct = new ArrayList<Integer>(numbers);
        Collections.sort(distinct);
        return distinct;
    }

    // Challenge #4
    // instructions show a-z but will validate assuming letter case independent
    private static Boolean completeValidator(String x) {
        String lowerCaseString = x.toLowerCase();
        Set<Character> letters = new HashSet<Character>();

        if (x.length() >= 26) {
            for (int index = 0; index < lowerCaseString.length(); index++) {
                if (Character.isLetter(lowerCaseString.charAt(index))) {
                    letters.add(lowerCaseString.charAt(index));
                }
            }
        }

        return letters.size() == 26;
    }
}