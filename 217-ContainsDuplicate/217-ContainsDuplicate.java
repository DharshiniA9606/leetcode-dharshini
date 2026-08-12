// Last updated: 8/12/2026, 8:48:01 AM
class Solution {
    public boolean containsDuplicate(int[] n) {
        Arrays.sort(n);
        for(int i=0;i<n.length-1;i++){
           if(n[i]==n[i+1]){
            return true;
           }
            
        }
        return false;
    }
    
}