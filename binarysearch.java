public class binarysearch {
    public static int Serach(int[] arr, int x){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[low] < x && arr[mid] > x){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-5, -2, 0, 1, 2, 4, 5, 6, 7, 10};
        int x = 10;
        System.out.println(Serach(arr,x));
    }
}
