// Last updated: 8/12/2026, 8:38:48 AM
class Solution {
    public boolean canReach(int[] start, int[] target) {
        int sp = (start[0]+start[1])%2;
        int tp = (target[0]+target[1])%2;
        if(sp<0){
            sp+=2;
        }
        if(tp<0){
            tp+=2;
        }
        return sp==tp;
    }
}