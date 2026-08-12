// Last updated: 8/12/2026, 8:40:39 AM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int consumedFuel = 0;
        int countFive = 0;
        while(mainTank > 0) {
            countFive++;
            if(countFive == 5) {
                countFive = 0;
                if(additionalTank > 0) {
                    mainTank++;
                    additionalTank--;
                }
            }
            consumedFuel++;
            mainTank--;
        }
        int ans = consumedFuel * 10;
        return ans;
    }
}