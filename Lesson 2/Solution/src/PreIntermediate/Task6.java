package PreIntermediate;

import java.util.stream.IntStream;

public class Task6 {
    static void sumAndAverageOfArray(int[] a) {
        int sum = IntStream.of(a).sum();
        int average = sum / a.length;
        System.out.println("Sum is " +sum+" a arithmetical average is"+average+" .");
    }

    public static void main(String[ ] args) {
        int[] a = {10,20,30,40,50};
        sumAndAverageOfArray(a);
    }
}
