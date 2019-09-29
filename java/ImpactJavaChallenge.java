import java.util.*;

public class ImpactJavaChallenge {

    public static void main(String[] args) {
        int x[] = {1, 1, 3, 1, 2, 3, 3, 3, 1};

        System.out.println(toGoodString("HellOOOOOO ThErEE"));

        System.out.println(listGenerator(x));

        System.out.println(duplicates(x));

        System.out.println(completeValidator("Hi There"));
        System.out.println(completeValidator("abcdefghijklmnopqrsTUVWXYZ"));
    }

    private static String toGoodString(String x) {
        String goodString = "";

        for (int index = 0; index < x.length(); index++) {
            goodString += x.charAt(index);
            while (index < x.length() - 1) {
                if (x.charAt(index) == x.charAt(index + 1)) {
                    index++;
                } else break;
            }
        }

        return goodString;
    }

    private static String listGenerator(int[] x) {
        String listOfNumbers = "";

        // if array is empty, return no numbers
        if (x.length == 0) listOfNumbers = "No Numbers";

        // if array only has one value, return value as a string
        if (x.length == 1) listOfNumbers = String.valueOf(x[0]);

        // if array has more than one value
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

                // all values between first and last
                if (index > 0 && index < x.length - 1) {
                    // if previous is not sequential
                    if (x[index - 1] != x[index] - 1) {
                        // if next is sequential
                        if (x[index + 1] == x[index] + 1) listOfNumbers += x[index];
                        // if next is not sequential
                        if (x[index + 1] != x[index] + 1) listOfNumbers += (x[index] + ", ");
                    }
                    //if previous is sequential
                    if (x[index - 1] == x[index] - 1) {
                        // if next is sequential
                        if (x[index + 1] == x[index] + 1) index++;
                        // if next is not sequential
                        if (x[index + 1] != x[index] + 1) listOfNumbers += ("-" + x[index] + ", ");
                    }
                }
            }
        }

        return listOfNumbers;
    }

    private static ArrayList<Integer> duplicates(int[] x) {
        Set<Integer> numbers = new HashSet<Integer>();
        ArrayList<Integer> duplicates = new ArrayList<>(5);

        for (int index = 0; index < x.length; index++) {
            if (!numbers.contains(x[index])) {
                numbers.add(x[index]);
            } else {
                duplicates.add(x[index]);
            }
        }

        Collections.sort(duplicates);
        return duplicates;
    }

    private static Boolean completeValidator(String x) {
        String lowerCaseString = x.toLowerCase();
        Boolean isComplete = false;
        Set<Character> letters = new HashSet<Character>();

        if (x.length() < 26) isComplete = false;
        else {
            for (int index = 0; index < lowerCaseString.length(); index++) {
                if (!letters.contains(lowerCaseString.charAt(index))) {
                    letters.add(lowerCaseString.charAt(index));
                }
            }
        }

        if (letters.size() == 26) isComplete = true;

        return isComplete;
    }
}