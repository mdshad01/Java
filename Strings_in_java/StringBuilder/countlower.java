package Strings_in_java.StringBuilder;
import java.util.*;
public class countlower {
    public static String CountLower(String str){
    StringBuilder sb = new StringBuilder("");
    int count = 0;
    for(int i=0; i<str.length(); i++){
        char c = str.charAt(i);
        sb.append(c);
       if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
        count++;
       } 
    }
    System.out.println("lower case vowels is equal to : "+count);
    return sb.toString();
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(CountLower(str));
        sc.close();

    }
}
