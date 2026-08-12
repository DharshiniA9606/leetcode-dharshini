// Last updated: 8/12/2026, 8:39:42 AM
class Solution {
    public boolean[] transformStr(String s, String[] strs) {
        char[] sArr = s.toCharArray();
        int n = sArr.length;
        int m = strs.length;
        
        int[] sPrefixZeros = new int[n];
        int totalZerosS = 0;
        for (int i = 0; i < n; i++) {
            if (sArr[i] == '0') {
                totalZerosS++;
            }
            sPrefixZeros[i] = totalZerosS;
        }

        boolean[] ans = new boolean[m];

        for (int j = 0; j < m; j++) {
            char[] tArr = strs[j].toCharArray();
            int fixedZeros = 0;
            int questionMarks = 0;
            
            for (int i = 0; i < n; i++) {
                if (tArr[i] == '0') fixedZeros++;
                else if (tArr[i] == '?') questionMarks++;
            }

            if (fixedZeros > totalZerosS || fixedZeros + questionMarks < totalZerosS) {
                ans[j] = false;
                continue;
            }

            int zerosNeededFromQuestions = totalZerosS - fixedZeros;
            boolean isValid = true;
            int currentZerosT = 0;

            for (int i = 0; i < n; i++) {
                if (tArr[i] == '0') {
                    currentZerosT++;
                } else if (tArr[i] == '?') {
                    if (zerosNeededFromQuestions > 0) {
                        currentZerosT++;
                        zerosNeededFromQuestions--;
                    }
                }

                if (currentZerosT < sPrefixZeros[i]) {
                    isValid = false;
                    break;
                }
            }

            ans[j] = isValid;
        }

        return ans;
    }
}