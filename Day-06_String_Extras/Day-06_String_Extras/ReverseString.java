public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversed = reverseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String str) {
       return new StringBuilder(str).reverse().toString();
    }
}
