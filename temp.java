public class temp {
    public static int maxSubArray(int[] nums) {
        //Time Excced Problem - But Good Approach
        int n = nums.length;
        int prefix_arr[] = new int[n];
        prefix_arr[0] = nums[0];
        int maxSum = Integer.MIN_VALUE;
        int ct = nums[0] < 0 ? 1 : 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] < 0) {
                ct++;
                maxSum = Math.max(maxSum, nums[i]);
            }
            prefix_arr[i] = prefix_arr[i - 1] + nums[i];
        }
        if (ct == n ) 
            return n==1 ? (maxSum = nums[0]) : (maxSum=Math.max(maxSum,nums[0]));
        int currSum = 0;
        maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                currSum = i == 0 ? prefix_arr[j] : prefix_arr[j] - prefix_arr[i - 1];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int num[] ={-1,-2,-3,0};
        int max = maxSubArray(num);
        System.out.println(max);
    }
}
