import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /*
         * Question 1 : How many times 'Hello' is printed?
            public class Solution {
                public static void main(String[] args){
                    for(int i=0; i<5; i++) {
                    System.out.println("Hello");
                    i+=2;
                    }
                }
            }
            Ans : 2 Times
        */

//Question 2 : Write a program that reads a set of integers, and then prints the sum of the
// even and odd integers.
        Scanner sc = new Scanner(System.in);
        char res = 'y';
        int evensum=0, oddsum=0;
        do{
            System.out.print("Enter a no : ");
            int n = sc.nextInt();
            if(n%2==0) evensum+=n;
            else oddsum+=n;
            System.out.println("Want to continue (y/n)");
            res = sc.next().charAt(0);
        }while(res == 'y');
        System.out.println("Even Sum : "+ evensum);
        System.out.println("Odd Sum : "+ oddsum);
    }
}
