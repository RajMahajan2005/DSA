public class permutationinstring {

    public static boolean isFreqSame(int freq1[] , int freq2[]){
        for(int i=0; i<26; i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean isPermutation(String s1, String s2){
        int freq[] = new int[26];
        for(int i=0;i<s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
        }
        int windsize = s1.length();
        for(int i=0; i<s2.length(); i++){
            int windidx = 0 , idx = i;
            int windfreq[] = new int[26];
            while(windidx < windsize && i < s2.length()){
                windfreq[s2.charAt(idx) - 'a']++;
                windidx++;
                idx++;
            }

            if(isFreqSame(freq, windfreq)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(isPermutation(s1, s2));
    }
}
