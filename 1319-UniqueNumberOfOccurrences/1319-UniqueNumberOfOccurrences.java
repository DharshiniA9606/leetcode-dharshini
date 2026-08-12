// Last updated: 8/12/2026, 8:42:31 AM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> frq = new HashMap<>();

        for(int num : arr){
            frq.put(num, frq.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();

        for(int freq : frq.values()){
            if(!set.add(freq)){
                return false;
            }
        }

        return true;
    }
}