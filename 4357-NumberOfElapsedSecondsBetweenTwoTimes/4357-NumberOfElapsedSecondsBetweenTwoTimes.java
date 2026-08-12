// Last updated: 8/12/2026, 8:38:53 AM
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        return converttosec(endTime)-converttosec(startTime);
    }
    private int converttosec(String time){
        int h = (time.charAt(0)-'0')*10+(time.charAt(1)-'0');
        int m = (time.charAt(3)-'0')*10+(time.charAt(4)-'0');
        int s = (time.charAt(6)-'0')*10+(time.charAt(7)-'0');
        return h*3600+m*60+s;
    }
}