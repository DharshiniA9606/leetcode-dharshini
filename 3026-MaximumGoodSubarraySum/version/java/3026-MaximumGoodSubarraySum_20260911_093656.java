// Last updated: 9/11/2026, 9:36:56 AM
1class Solution {
2    public boolean hasAlternatingBits(int n) {
3        int prev = 5;   
4        
5        while(n > 0){
6            int bit = n % 2;   
7            n /= 2;          
8            
9            if(prev == 5){
10                prev = bit;    
11            }else{
12                if(bit == prev) return false; 
13                prev = bit;
14            }
15        }
16        return true;
17    }
18}