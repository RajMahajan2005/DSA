public class editdist {
    public static int editDistace(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                if(i == 0){
                    dp[i][j] = j;
                }
                if(j == 0){
                    dp[i][j] = i;
                }
            }
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    int add = dp[i][j-1]+1;
                    int del = dp[i-1][j]+1;
                    int replace = dp[i-1][j-1]+1;

                    dp[i][j] = Math.min(add, Math.min(del,replace));
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String str1 = "execution";
        String str2 = "intention";
        System.out.println(editDistace(str1, str2));
    }
}
