import java.util.*;
public class voters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
       
        int counta = 0, countb = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'A'){
                counta++;
            }
            if(s.charAt(i) == 'B'){
                countb++;
            }
        }
        if(counta == countb){
            System.out.println("Coliation Govt");
        }
        else if(counta > countb){
            System.out.println("A");
        }
        else{
            System.out.println("B");
        }
    }
}
