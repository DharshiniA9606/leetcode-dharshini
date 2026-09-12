// Last updated: 9/12/2026, 4:27:34 PM
import java.util.Arrays;
class Solution {
    public long elevatorRequests(int n, int start, int[][] requests) {
        int m = requests.length;
        int numStates = 1 << m;
        long[][] dist = new long[numStates][m + 1];
        for (int i = 0; i < numStates; i++) {
            Arrays.fill(dist[i], Long.MAX_VALUE);
        }
        dist[0][0] = 0;
        long minTotalTime = Long.MAX_VALUE;
        for (int mask = 0; mask < numStates; mask++) {
            for (int u = 0; u <= m; u++) {
                long time = dist[mask][u];
                if (time == Long.MAX_VALUE) continue;
                if (mask == numStates - 1) {
                    if (time < minTotalTime) {
                        minTotalTime = time;
                    }
                    continue;
                }
                int floorU = (u == 0) ? start : requests[u - 1][1];
                for (int v = 0; v < m; v++) {
                    if ((mask & (1 << v)) == 0) {
                        int floorV = requests[v][1];
                        long arrivalV = requests[v][0];
                        
                        long travelTime = Math.abs(floorU - floorV);
                        long reachTime = time + travelTime;
                        long fulfillTime = Math.max(reachTime, arrivalV);
                        int nextMask = mask | (1 << v);
                        for (int k = 0; k < m; k++) {
                            if ((nextMask & (1 << k)) == 0) {
                                int floorK = requests[k][1];
                                long arrivalK = requests[k][0];
                                if (floorK >= Math.min(floorU, floorV) && floorK <=Math.max(floorU, floorV)) {
                                    long passTime = time + Math.abs(floorU - floorK);
                                    if (arrivalK <= passTime) {
                                        nextMask |= (1 << k);
                                    }
                                }
                                if (floorK == floorV && arrivalK <= fulfillTime) {
                                    nextMask |= (1 << k);
                                }
                            }
                        }
                        if (fulfillTime < dist[nextMask][v + 1]) {
                            dist[nextMask][v + 1] = fulfillTime;
                        }
                    }
                }
            }
        }
        
        return minTotalTime;
    }
}