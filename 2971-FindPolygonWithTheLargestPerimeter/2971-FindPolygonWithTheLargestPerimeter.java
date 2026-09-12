// Last updated: 9/12/2026, 4:29:21 PM


class Solution {
    public long largestPerimeter(int[] nums) {
        long sum = 0;
        Arrays.sort(nums);
        for (int num : nums) {
            sum += num;
        }
        int n = nums.length;
        for (int i = n - 1; i >= 2; i--) {
            sum -= nums[i];
            if (sum > nums[i]) {
                return sum + nums[i];
            }
        }
        return -1;
    }
}
