import java.util.*;
public class meadian {
    public static double findMedian(int[] n1, int[] n2){
        int[] merged = new int[n1.length + n2.length];
        int k = 0;
        for(int i=0; i<n1.length; i++){
            merged[k++] = n1[i];
        }
        for(int i=0; i<n2.length; i++){
            merged[k++] = n2[i];
        }
        Arrays.sort(merged);
        int total = merged.length;

        if(total % 2 == 1){
            return (double) merged[total/2];
        }
        else {
            int middle1 = merged[total/2-1];
            int middle2 = merged[total/2];
            return ((double)middle1 + (double) middle2) / 2.0;
        }
    }
    public static void main(String[] args) {
        int n1[] = {1, 3};
        int n2[] = {2, 4};
        System.out.println(findMedian(n1, n2));
    }
}
