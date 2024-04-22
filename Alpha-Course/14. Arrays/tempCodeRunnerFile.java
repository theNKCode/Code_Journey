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