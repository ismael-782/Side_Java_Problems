import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String option;
        String ansStr;
        Scanner input = new Scanner(System.in);

        System.out.println("""
                Welcome to Palindrome Checker

                Please choose an option:
                1) Sentence
                2) Word
                3) Number
                4) Terminate
                """);

        option = input.nextLine().strip();

        while (true) {
            if (!option.equals("1") && !option.equals("2") && !option.equals("3") && !option.equals("4")) {
                System.out.println("Invalid Option! Try Again.\n");
            } else {
                if (option.equals("1")) {
                    System.out.print("Enter your sentence: ");
                    ansStr = input.nextLine().trim();
                    if (isPalindrome(ansStr.trim())) {
                        System.out.println("The Sentence is Palindrome\n");
                    } else {
                        System.out.println("The Sentence is not Palindrome\n");
                    }
                } else if (option.equals("2")) {
                    System.out.print("Enter your Word: ");
                    ansStr = input.nextLine().trim();
                    if (isPalindrome(ansStr.trim())) {
                        System.out.println("The Word is Palindrome\n");
                    } else {
                        System.out.println("The Word is not Palindrome\n");
                    }
                } else if (option.equals("3")) {
                    System.out.print("Enter your Number: ");
                    ansStr = input.nextLine().trim();
                    if (isPalindrome(ansStr.trim())) {
                        System.out.println("The Number is Palindrome\n");
                    } else {
                        System.out.println("This Number is not Palindrome\n");
                    }
                } else if (option.equals("4")) {
                    System.out.println("Program Terminated");
                    System.exit(0);
                } else {
                    PrintChoice();
                    option = input.nextLine().trim();
                }
            }
            PrintChoice();
            option = input.nextLine().trim();
        }
    }

    public static void PrintChoice() {
        System.out.println("""
                Please choose an option:
                1) Sentence
                2) Word
                3) Number
                4) Terminate
                    """);
    }

    public static boolean isPalindrome(String x) throws Exception {
        if (x.isEmpty()) {
            throw new Exception("No Text Entered");
        }
        int len = x.length();
        int start = 0;
        int last = len - 1;
        return isPalindromeHelper(x, start, last);
    }

    private static boolean isPalindromeHelper(String x, int start, int last) {
        if (start >= last) {
            return true;
        } else {
            if (Character.toLowerCase(x.charAt(start)) != Character.toLowerCase(x.charAt(last))) {
                return false;
            } else {
                return isPalindromeHelper(x, start + 1, last - 1);
            }
        }
    }
}