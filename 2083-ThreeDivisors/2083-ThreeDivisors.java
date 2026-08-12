// Last updated: 8/12/2026, 8:41:25 AM
class Solution {
    public boolean isThree(int n) {
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==3){
            return true;
        }
        else{
            return false;
        }
    }
}