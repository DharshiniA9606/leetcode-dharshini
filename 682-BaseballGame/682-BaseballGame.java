// Last updated: 8/12/2026, 8:44:42 AM
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int t1 = s.peek();
                s.pop();
                int t2 = s.peek();
                s.push(t1);
                s.push(t1+t2);
                
            }
            else if(operations[i].equals("D")){
                s.push(s.peek()*2);
            }
            else if(operations[i].equals("C")){
                s.pop();
            }    
            else{
                s.push(Integer.parseInt(operations[i]));
            }

        }
        int sum=0;
        while(!s.isEmpty()){
            sum+=s.peek();
            s.pop();
        }
        return sum;
    }
}