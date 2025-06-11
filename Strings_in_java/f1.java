package Strings_in_java;

public class f1 {
    public static void printLetters(String str){
    for(int i=0; i<str.length(); i++ ) {
        System.out.print(str.charAt(i)+" ");
    }
    System.out.println();
}
       public static float shortestPath(String path){
        int x = 0, y = 0;
        for(int i=0; i< path.length(); i++){
            char dir = path.charAt(i);
            //North
            if(dir == 'N'){
                y++;
            }
            else if(dir == 'S'){
                y--;
            }
            else if(dir == 'E'){
                x++;
            }
            else{
                x--;
            }
        }
        int x2 = x*x;
            int y2 = y*y;
            return (float)Math.sqrt(x2+y2);
       }
    public static void main(String[] args) {
        // String name = "Tony Stark";
        // System.out.println(name.length());
        // String firstName = "Md";
        // String middleName = "Shad";
        // String lastName = "Alam";
        // String fullName = firstName + " " + middleName + " " + lastName;
        // System.out.println(fullName);
        // System.out.println(fullName.length());
        // System.out.println(fullName.charAt(3));
        // printLetters(fullName);
        // String path = "WNEENESENNN";
        // System.out.println(shortestPath(path)   );

        // String s1 = "Tony";
        // String s2 = "Tony";
        // String s3 = new String("Tony");
    //     if(s1 == s2){
    //         System.out.println("Strings are equal");
    //     } 
    //     else{
    //         System.out.println("Strings are not equal");
    //     }
    //     if(s1 == s3){
    //         System.out.println("Strings are equal");
    //     } 
    //     else{
    //         System.out.println("Strings are not equal");
    //     }
    // }
    // if(s1.equals(s3)){
    //         System.out.println("Strings are equal");
    //     } 
    //     else{
    //         System.out.println("Strings are not equal");
    //     }

}
}
