public class climbing{
    public static int climbingStairs(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<=n; i++){
            dp[i] = dp[i-2] + dp[i-1];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbingStairs(n));
    }
}