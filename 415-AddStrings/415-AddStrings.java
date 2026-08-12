// Last updated: 8/12/2026, 8:46:24 AM
class Solution {
    public String addStrings(String num1, String num2) {

        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        String res = "";

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) sum += num1.charAt(i--) - '0';
            if (j >= 0) sum += num2.charAt(j--) - '0';

            res = (sum % 10) + res;
            carry = sum / 10;
        }
        return res;
    }
}
