package PreIntermediate;

public class Task5 {
    static boolean checkArray(int[] a) {
        boolean b = true;
        int c = a.length;
        for (int i = 0; i < c; i++) {
            if (a[i] == 7 || a[i] == 9) {
                b = false;
            }
        }
        return b;
    }

    public static void main(String[ ] args) {
        int[] a = {1,2,3,4,5,6,8};
        boolean b = checkArray(a);
        System.out.println(b);
        int[] c = {1,2,3,4,5,6,7,8,9};
        boolean d = checkArray(c);
        System.out.println(d);
    }
}
