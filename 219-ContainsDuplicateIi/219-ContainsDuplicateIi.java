// Last updated: 8/12/2026, 8:47:59 AM
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            
            if (!set.add(nums[i])) {
                return true;
            }
        }
        
        return false;
    }
}