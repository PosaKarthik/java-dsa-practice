public class RemoveSpaceFromString {
    public static void main(String[] args) {

        String s = "I love Java";
        String replace = s.replace(" ", "");
        String replace2 = s.replace(" ", ",");

        System.out.println("Original : " + s);
        System.out.println("Replaced : " + replace);
        System.out.println("Replaced : " + replace2);
    }

}
