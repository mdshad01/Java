package Strings_in_java.StringBuilder;

public class stringbulder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch=97; ch<=122; ch++){
            sb.append(ch+" ");
        }
        System.out.println(sb);
    }
}
