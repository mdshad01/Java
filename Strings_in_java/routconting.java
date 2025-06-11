package Strings_in_java;

public class routconting {
    public static double printDist(String str){
        double x = 0, y = 0;
        for(int i=0; i<str.length(); i++){
            char dir = str.charAt(i);
            //North
            if(dir == 'N'){
                y++;
            }
            else if(dir == 'S'){
                y--;
            }
            else if(dir == 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        double X2 = x*x;
        double Y2 = y*y;
        return Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String path = "NEWSNNEWS";
        System.out.println(printDist(path));
    }
}
