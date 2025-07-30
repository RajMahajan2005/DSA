import java.util.*;
public class notout12 {
    public static int longestsubstring(String s){
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, res=0;
        for(int right=0; right<s.length(); right++){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(map.get(s.charAt(right))+1,left);

            }
            map.put(s.charAt(right), right);
            res = Math.max(res, right-left+1);

        }
        return res;
    }
    public static void main(String[] args) {
        String s = "abcabca";
        System.out.println(longestsubstring(s));
    }
}
