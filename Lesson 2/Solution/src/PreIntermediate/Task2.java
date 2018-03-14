package PreIntermediate;

public class Task2 {
    static String swapChar(String s) {
        int length = s.length();

        if (length <= 1) {
            return s;
        } else {
            return s.charAt(length - 1) + s.substring(1, length - 1) + s.charAt(0);
        }
    }

    public static void main(String[ ] args) {
        String s = "char";
        String a = swapChar(s);
        System.out.println(a);
    }
}
