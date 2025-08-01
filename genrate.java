import java.util.*;
public class genrate{
    public static List<String> isgenerate(int n){
        List<String> res = new ArrayList<>();
        helper("", 0,0,n,res);
        return res;
    }
    public static void helper(String curr, int open, int close, int total, List<String> res){
        if(curr.length() == 2 * total){
            res.add(curr);
            return;
        }
        if(open < total){
            helper(curr+"(", open+1, close, total, res);
        }
        if(close < open){
            helper(curr+")", open, close+1, total, res);
        }

    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(isgenerate(n));
    }
}