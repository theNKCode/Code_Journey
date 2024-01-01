import java.util.Scanner;

public class ArrayCC {

    // 14.3
    public static void update(int scores[], int nonchagable) {
        nonchagable = 132;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scores[i] + 1;
        }
    }

    // 14.5
    public static int linear_search(int no[], int key) {
        for (int i = 0; i < no.length; i++) {
            if (no[i] == key)
                return i;
        }
        return -1;
    }

    // 14.6
    public static void largest_find(int lar[]) {
        System.out.print("The array : ");
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < lar.length; i++) {
            System.out.print(lar[i] + " ");
            if (lar[i] > largest)
                largest = lar[i];
            if (lar[i] < smallest)
                smallest = lar[i];
        }
        System.out.println("\nThe largest among above array is : " + largest);
        System.out.println("\nThe smallest among above array is : " + smallest);
    }

    

    public static void main(String[] args) {
        // 14.1
        int score[] = new int[50];
        int numbers[] = { 1, 2, 3 };
        String fruits[] = { "apple", "mango", "orange" };

        // 14.2
        // Input
        int mark[] = new int[100];
        // Array Length
        System.out.println("Length of Array : " + mark.length);
        System.out.println("14.2 - Input values in Arrays");
        Scanner sc = new Scanner(System.in);
        // int phy;
        // phy =sc.nextInt();
        mark[0] = sc.nextInt(); // phy
        mark[1] = sc.nextInt(); // math
        mark[2] = sc.nextInt(); // che

        // Output
        System.out.println("phy : " + mark[0]);
        System.out.println("math : " + mark[1]);
        System.out.println("che : " + mark[2]);
        System.out.println("Not Input : " + mark[3]);

        // Updation
        mark[1] = mark[1] + 2;
        mark[2] = 100;
        System.out.println("math : " + mark[1]);
        System.out.println("che : " + mark[2]);

        // 14.3 - Array as Function Arguments
        System.out.println("\n14.3 - Array as Function Arguments");
        int scores[] = { 97, 98, 99 };
        int nonchagable = 5;
        System.out.print("Old Scores : ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        update(scores, nonchagable);
        System.out.print("\nNew Scores : ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println("\n\tArray Values Changes as Array always on Pass by Reference");
        System.out.println(
                "Nonchangable Integer : " + nonchagable + "\n\tAs Integer Does is passed by value it will not change");

        // 14.4 - Reading Material : Time and Space Complexity

        // 14.5 - Linear Search // TC - O(n)
        System.out.println("/n 14.5 - Linear Search");
        int key = 10;
        int no[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int index = linear_search(no, key);
        System.out.println((index == -1) ? "Key not Exist" : "Found key at index " + index);

        // 14.6 - Largest No
        int lar[] = new int[50];
        System.out.println("Enter Input in Array (-1 to stop)");
        for (int i = 0; i < lar.length; i++) {
            lar[i] = sc.nextInt();
            if (lar[i] == -1) {
                lar[i] = 0;
                break;
            }
        }
        largest_find(lar);
    }
}
