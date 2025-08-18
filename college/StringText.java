public class StringText {
    public static void main(String[] args) {
        String name = "Hello World";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.startsWith(name));

        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World");
        sb.insert(5, " ");
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer("Hello");
        sb1.append("Java");
        sb1.insert(5, " ");
        System.out.println(sb1);

    }
}
