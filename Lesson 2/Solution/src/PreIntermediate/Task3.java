package PreIntermediate;

public class Task3 {
    static boolean check21(int a, int b) {
        if ((a == 21) || (b == 21)) {
            return true;
        }
        else if (a + b == 21) {
            return true;
        }
        else return false;
    }

    public static void main(String[ ] args) {
        int a = 21;
        int b = 1;
        boolean result1 = check21(a, b);
        System.out.println(result1);

        int c = 17;
        int d = 4;
        boolean result2 = check21(c, d);
        System.out.println(result2);

        int e = 3;
        int f = 21;
        boolean result3 = check21(e, f);
        System.out.println(result3);

        int g = 20;
        int h = 0;
        boolean result4 = check21(g, h);
        System.out.println(result4);
    }
}
