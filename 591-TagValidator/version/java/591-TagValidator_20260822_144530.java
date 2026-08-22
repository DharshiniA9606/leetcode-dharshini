// Last updated: 8/22/2026, 2:45:30 PM
1class Solution {
2      public boolean isValid(String exp) {
3        int length = exp.length();
4        Stack S=new Stack();
5        for (int i = 0; i < length; i++) {
6            if(i>0 && S.empty())
7                return false;
8            if(exp.startsWith("<![CDATA[",i)){
9                int pos=exp.indexOf("]]>",i+9);
10                if (pos==-1)
11                    return false;
12                else
13                    i=pos+2;
14            }
15            else if(exp.startsWith("</",i)){
16                int pos=exp.indexOf('>',i+2);
17                if (pos==-1) {
18                    return false;
19                }
20                String to_be_matched=exp.substring(i+2,pos);
21                if(S.empty())
22                   return false;
23                if(!to_be_matched.equals((String)S.pop()))
24                    return false;
25                i=pos;
26            }
27            else if (exp.charAt(i) == '<') {
28                int pos=exp.indexOf('>',i+1);
29                if (pos==-1)
30                    return false;
31                String to_be_pushed=exp.substring(i+1, pos);
32                if(!(to_be_pushed.length() >=1 && to_be_pushed.length() <=9))
33                    return false;
34                for(int k=0;k<to_be_pushed.length();k++) {
35                    char temp = to_be_pushed.charAt(k);
36                    if (!(temp >= 65 && temp <= 90))
37                        return false;
38                }
39                S.push(to_be_pushed);
40                i=pos;
41            }
42            else
43            {
44                int pos=exp.indexOf('<',i);
45                if (pos!=-1) {
46                    i=pos-1;
47                }
48            }
49        }
50        if(S.empty())
51            return true;
52        else
53            return false;
54    }
55}