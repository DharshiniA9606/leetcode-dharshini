// Last updated: 9/12/2026, 4:27:36 PM
class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int mini = -1;
        int mind = Integer.MAX_VALUE;
        int tx = target[0];
        int ty = target[1];
        for(int i=0;i<drones.length;i++){
            int dx = drones[i][0];
            int dy = drones[i][1];
            int r = drones[i][2];
            int d = Math.abs(dx-tx)+Math.abs(dy-ty);
            if(d<=r&&d<mind){
                mind = d;
                mini =i;
            }
        }
        return mini;
    }
}