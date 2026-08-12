// Last updated: 8/12/2026, 8:39:05 AM
class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        int n=parent.length;
        int[] head = new int[n];
        int[] next = new int[n];
        Arrays.fill(head,-1);
        int root=-1;
        for(int i=0;i<n;i++){
            if(parent[i]==-1){
                root=i;
            }
            else{
                int p=parent[i];
                next[i]=head[p];
                head[p]=i;
                
            }
        }
        int[] depth = new int[n];
        int[] queue = new int[n];
        int headQ = 0,tailQ=0;
        queue[tailQ++]=root;
        depth[root]=1;
        int h=1;
        while(headQ<tailQ){
            int cur = queue[headQ++];
            if(depth[cur]>h){
                h=depth[cur];
            }
            for(int child=head[cur];child!=-1;child=next[child]){
                depth[child]=depth[cur]+1;
                queue[tailQ++]=child;
                
            }
        }
        long tot = 0;
        for(int i=0;i<n;i++){
            tot+=(long) nums[i]*(h-depth[i]+1);
        }
        return tot;
    }
}