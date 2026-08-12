// Last updated: 8/12/2026, 8:39:13 AM
class Solution {
    public int maxDistance(String moves) {
        int x =0;
        int y=0;
        int wildcard = 0;
        for(int i=0;i<moves.length();i++){
            char c = moves.charAt(i);
            if(c=='U'){
                y++;
            }
            else if(c=='D'){
                y--;
            }
            else if(c=='R'){
                x++;
                
            }
            else if(c=='L'){
                x--;
            }
            else if(c=='_'){
                wildcard++;
            }
        }
        return Math.abs(x)+Math.abs(y)+wildcard;
    }
}