// Last updated: 8/12/2026, 8:39:57 AM
import java.util.HashSet;
import java.util.Set;
class Solution {
    public int minimumGroups(String[] words) {
        Set<String> uniqueGroups = new HashSet<>();
        for(String word:words){
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();
            for(int i=0;i<word.length();i++){
                if(i%2==0){
                    even.append(word.charAt(i));
                }
                else{
                    odd.append(word.charAt(i));
                }
            }
            String ce = getMinRotation(even.toString());
            String co = getMinRotation(odd.toString());
            String groupkey = ce+"#"+co;
            uniqueGroups.add(groupkey);
        }
        return uniqueGroups.size();
        
    }
    private String getMinRotation(String s){
        int n=s.length();
        if(n<=1) return s;
        if(n==0) return "";
        int i=0,j=1;//k=0;
        while(j<n){
            int k=0;
            while(k<n && s.charAt((i+k)%n)==s.charAt((j+k)%n)){
                k++;
            }
            if(k==n){
                break;
            }
            if(s.charAt((i+k)%n)>s.charAt((j+k)%n)){
                i =Math.max(i+k+1,j);
                j=i+1;
            }
            else{
                j+=k+1;
            }
        }
        return s.substring(i)+s.substring(0,i);
        
    }
}