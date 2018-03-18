package PreIntermediate;

public class Task9 {
    static int calculateAmoutOfDigits(int number) {
        String str1 = Integer.toString(number);
        char[] ch1 = str1.toCharArray();
        int[] t1 = new int[ch1.length];
        int result = 0;
        for(int i=0;i<ch1.length;i++) {
            t1[i] = (int) ch1[i] - 48;
            result += t1[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int num1 = 123456;
        int result1 = calculateAmoutOfDigits(num1);
        System.out.println(result1);

        int num2 = 2519607;
        int result2 = calculateAmoutOfDigits(num2);
        System.out.println(result2);
    }
}
