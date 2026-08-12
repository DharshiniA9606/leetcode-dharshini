// Last updated: 8/12/2026, 8:40:46 AM
class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(i%3==0||i%5==0||i%7==0){
                sum += i;
            }
        }
        return sum;
    }
}