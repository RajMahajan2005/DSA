public class productSub {
    public static int maxProduct(int[] nums){
        int n = nums.length;
        int leftprod = 1;
        int rightprod = 1;
        int ans = 0;
        for(int i=0; i<n; i++){
            leftprod = leftprod == 0 ? 1 : leftprod;
            rightprod = rightprod == 0 ? 1 : rightprod;
            leftprod *= nums[i];
            rightprod *= nums[n-1-i];
            ans = Math.max(ans, Math.max(leftprod, rightprod));
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 0, -2, 4};
        System.out.println(maxProduct(nums));
    }
}
