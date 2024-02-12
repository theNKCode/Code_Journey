import java.util.HashSet;

public class Array_assignment {

    public static boolean atleast_twice(int arr[]) {
        System.out.println("Approach 1 - Brute Force (O(n^2))");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicate(int[] nums) {
        System.out.println("\nApproach 2 - using Sets (O(n))");
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                return true;
            else
                set.add(nums[i]);
        }
        return false;
    }

    public static int findpivot(int nums[], int t) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i + 1] < nums[i])
                j = i + 1;
        }
        int left = 0, right = j - 1;
        if (t < nums[0]) {
            left = j;
            right = nums.length;
        }
        while (mid = t) {
            mid = (left + right) / 2;
            if (t > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        System.out.println(
                "ARRAYS - Assignment\r\n" + //
                        "\r\n" + //
                        "Question 1: Given an integer array nums, return true if any value appears at least twice in the\r\n"
                        + //
                        "array, and return false if every element is distinct.\r\n" + //
                        "Example 1:\r\n" + //
                        "Input: nums = [1, 2, 3, 1]\r\n" + //
                        "Output: true\r\n" + //
                        "Example 2:\r\n" + //
                        "Input: nums = [1, 2, 3, 4]\r\n" + //
                        "Output: false\r\n" + //
                        "Example 3:\r\n" + //
                        "Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]\r\n" + //
                        "Output: true\r\n" + //
                        "\r\n" + //
                        "Constraints:\r\n" + //
                        " 1 <= nums . lengtth <= 105\r\n" + //
                        " -109 <= nums [ i ] <= 109\n\n" + //
                        "Solution: ");
        int arr[] = { 1, 2, 3, 1 };
        System.out.println(
                atleast_twice(arr) == true ? "Appeared Twice" : "Not appeared twice");
        System.out.println(
                containsDuplicate(arr) == true ? "Appeared Twice" : "Not appeared twice");
        System.out.println(
                "\nQuestion 2: There is an integer array nums sorted in ascending order (with distinct values).\r\n" + //
                        "Prior to being passed to your function, nums is possibly rotated at an unknown \r\n" + //
                        "pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], \r\n" + //
                        "nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For \r\n" + //
                        "example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and \r\n" + //
                        "become [4,5,6,7,0,1,2].\r\n" + //
                        "Given the array nums after the possible rotation and an integer target, return the \r\n" + //
                        "index of target if it is in nums, or -1 if it is not in nums.\r\n" + //
                        "You must write an algorithm with O(log n) runtime complexity. \r\n" + //
                        "Example 1:\r\n" + //
                        "Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 0\r\n" + //
                        "Output: 4\r\n" + //
                        "Example 2:\r\n" + //
                        "Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 3\r\n" + //
                        "Output: -1\r\n" + //
                        "nikhilkamblestudy@gmail.com\r\n" + //
                        "Example 3:\r\n" + //
                        "Input: nums = [1], target = 0\r\n" + //
                        "Output: -1\r\n" + //
                        "Constraints:\r\n" + //
                        "   1 <= nums . lengtth <= 5000\r\n" + //
                        "   -104 <= nums [ i ] <= 104\r\n" + //
                        "   All values of nums are unique.\r\n" + //
                        "   nums is an ascending array that is possibly rotated.\r\n" + //
                        "   -104 <= target <= 10");
        int target = 0;
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        findpivot(nums, target);
    }
}
