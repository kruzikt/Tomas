package PreIntermediate;

public class Task10 {
    static void quadraticEquation(int a, int b, int c) {
        double root1, root2, d;
        d = b * b - 4 * a * c;
        if(d > 0)
        {
            System.out.println("Roots are real and unequal");
            root1 = ( - b + Math.sqrt(d))/(2*a);
            root2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("First root is:"+root1);
            System.out.println("Second root is:"+root2);
        }
        else if(d == 0)
        {
            System.out.println("Roots are real and equal");
            root1 = (-b+Math.sqrt(d))/(2*a);
            System.out.println("Root:"+root1);
        }
        else
        {
            System.out.println("Roots are imaginary");
        }
    }

    public static void main(String[] args) {
        // test 1, d > 0
        int a = 14;
        int b = 22;
        int c = 7;
        quadraticEquation(a, b, c);

        // test 2, d = 0
        int a2 = -4;
        int b2 = 12;
        int c2 = -9;
        quadraticEquation(a2, b2, c2);

        // test 3, d < 0
        int a3 = 1;
        int b3 = -3;
        int c3 = 4;
        quadraticEquation(a3, b3, c3);
    }
}
