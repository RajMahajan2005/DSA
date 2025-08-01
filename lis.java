import java.util.*;
public class lis {
    public static int longestinc(int[] nums1){
        Set<Integer> set = new HashSet<>();
        
        for(int n : nums1){
            set.add(n);
        }
        int nums2[] = new int[set.size()];
        int idx = 0;
        for(int num : set){
            nums2[idx++] = num;
        }

        Arrays.sort(nums2);
        
        int n = nums1.length;
        int m = nums2.length;
        int[][] dp = new int[n+1][m+1];
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(nums1[i-1] == nums2[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        int[] nums1 = {0,1,0,3,2,3};
        System.out.println(longestinc(nums1));
    }
}
