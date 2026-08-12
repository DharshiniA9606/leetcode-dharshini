// Last updated: 8/12/2026, 8:39:32 AM
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder();
        
        for(String word:words){
            int sum=0;
            for(char c:word.toCharArray()){
                sum+=weights[c-'a'];
            }
        int val = sum%26;
        result.append((char)('z'-val));
        }
        return result.toString();
    }
}  
