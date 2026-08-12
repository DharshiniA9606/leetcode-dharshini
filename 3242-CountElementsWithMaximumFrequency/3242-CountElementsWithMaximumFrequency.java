// Last updated: 8/12/2026, 8:40:28 AM
import java.util.*;

public class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int maxFreq = Integer.MIN_VALUE;
        int count = 0;

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(num));
        }

        for (int val : freq.values()) {
            if (val == maxFreq) {
                count += val;
            }
        }

        return count;
    }
}