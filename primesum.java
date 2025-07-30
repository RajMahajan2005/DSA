import java.util.*;
public class primesum {
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i=2; i * i<=num; i++){
            if((num%i) == 0){
                return false;
            }
        }
        return true;
    }

    public static List<Integer> primes(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = prime(n);
        int sum=0,count=0;
        for(int prime : list){
            sum += prime;
            if(sum > n) break;
            if(isPrime(sum)){
                count++;
            }
        }
        System.out.println(count);
    }
}
