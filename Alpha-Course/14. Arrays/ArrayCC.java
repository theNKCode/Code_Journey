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

    // 14.7 - Binary Search - TC = O(logn)
    public static int binary_search(int bin[], int keybin, int left, int right) {
        int mid = left + (right - left) / 2;
        if (bin[mid] == keybin)
            return mid;
        if (bin[mid] > keybin)
            return binary_search(bin, keybin, left, mid - 1);
        if (bin[mid] < keybin)
            return binary_search(bin, keybin, mid + 1, right);
        return -1;
    }
    // Mam Approach - Binary Search
    // public static int binary_search(int bin[], int keybin, int start, int end) {
    // while (start <= end) {
    // int mid = start + (end - start) / 2;
    // if (bin[mid] == keybin)
    // return mid;
    // if (bin[mid] > keybin)
    // end = mid-1;
    // if (bin[mid] < keybin)
    // start = mid+1;
    // }
    // return -1;
    // }

    // 14.9 - Reverse an array
    public static void reverse(int rev[]) {
        int start = 0, end = rev.length - 1;
        while (start < end) {
            int temp = rev[start];
            rev[start] = rev[end];
            rev[end] = temp;
            start++;
            end--;
        }
    }

    // 14.10 - Pairs in Arrays - O(n^2)
    public static void printpairs(int nums[]) {
        int tp = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + nums[i] + "," + nums[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = " + tp);
    }

    // 14.11 - Print Subarrays - a continuous part of array
    public static void printsubarrays(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k] + " ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // H.W. 14.12 - Find sum of all subarray also print max and min sum of subarray
    // - O(n^3)
    public static void printsubarrayssum(int nums[]) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k] + " ");
                    sum += nums[k];
                    if (sum > max)
                        max = sum;
                    if (sum < min)
                        min = sum;
                }
                System.out.print(" |  Sum is : " + sum + " |  ");
            }
            System.out.println();
        }
        System.out.println("Maximum sum = " + max);
        System.out.println("Minimum sum = " + min);
    }

    // 14.13 - Max Subarray sum (Prefix Method)
    public static void maxsubarraysum(int nums[]) {
        System.out.println("\n14.13 Max Subarray sum - (Prefix Sum Approach)");
        int n = nums.length;
        int prefix_arr[] = new int[n];
        prefix_arr[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix_arr[i] = prefix_arr[i - 1] + nums[i];
        }
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;
                currSum = start == 0 ? prefix_arr[end] : prefix_arr[end] - prefix_arr[start - 1];
                if (currSum > max)
                    max = currSum;
            }
        }
        System.out.println("Maximum sum is " + max);
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

        // 14.7 - Binary Search
        int bin[] = { 2, 4, 6, 8, 10, 12, 14, 16 }; // Prerequisite- In Increasing/ Decreasing Order
        int keybin = 14, left = 0, right = bin.length - 1;
        int index1 = binary_search(bin, keybin, left, right);
        System.out.println(index1 == -1 ? "Key not Found" : "Key Found at index " + index1);

        // 14.9 - Reverse an Array
        int rev[] = { 2, 4, 6, 8, 10, 11, 14, 15, 16 };
        reverse(rev);
        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i] + " ");
        }
        System.out.println();

        // 14.10 - Pairs in Array
        int nums[] = { 2, 4, 6, 8, 10 };
        printpairs(nums);

        // 14.11 - Print Subarray
        printsubarrays(nums);

        // H.W. 14.12 - Subarray sum and max / min sum print
        printsubarrayssum(nums);

        // 14.12 Max Subarray sum - (Brute Force)
        int subarray[] = { 1, -2, 6, -1, 3 };
        printsubarrayssum(subarray);

        //14.13 Max Subarray sum - (Prefix Sum Approach)
        maxsubarraysum(subarray);
    }
}
