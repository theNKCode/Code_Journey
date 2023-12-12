import java.util.Scanner;

public class practicequesolve {
    // Q1 :
    public static int avg(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    // Q2 :
    public static boolean isEven(int n) {
        if (n % 2 == 0)
            return true;
        return false;
    }

    // Q3:
    public static void checkPalindrome(int n) {
        for (int i = 0; i < n / 2; i++) {
            if(n)
        }
    }

    public static void main(String[] args) {
        // Question 1 : Write a Java method to compute the average of three numbers.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three no. ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Average : " + avg(a, b, c));

        /*
         * Question 2 : Write a method named isEven that accepts an int argument. The
         * method should return true if the argument is even, or false otherwise. Also
         * write a program to test your method.
         */
        System.out.println(isEven(5) == true ? "No is Even" : "No is Odd");

        /*
         * Question 3 : Write a Java program to check if a number is a palindrome in
         * Java? ( 121 is a palindrome, 321 is not) A number is called a palindrome if
         * the number is equal to the reverse of a number e.g., 121 is a palindrome
         * because the reverse of 121 is 121 itself. On the other hand, 321 is not a
         * palindrome because the reverse of 321 is 123, which is not equal to 321.
         */

    }
}
