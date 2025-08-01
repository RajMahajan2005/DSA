public class mincostclimb {
    public static int minClimb(int[] cost){
        int n = cost.length;
        int[] dp = new int[n+1];
        for(int i=2; i<n+1; i++){
            dp[i] = Math.min(cost[i-2]+dp[i-2] , cost[i-1]+dp[i-1]);
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int[] cost = {1,2,3};
        System.out.println(minClimb(cost));
    }
}
