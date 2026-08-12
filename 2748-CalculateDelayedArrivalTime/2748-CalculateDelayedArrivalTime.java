// Last updated: 8/12/2026, 8:40:49 AM
class Solution {
    public int findDelayedArrivalTime(int a, int d) {
        if(a+d<24){
            return a+d;
        }
        else {
            return (a+d)-24;
        }
    }
}