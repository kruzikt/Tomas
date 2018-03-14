package PreIntermediate;

import java.util.ArrayList;

public class Task4 {
    static ArrayList printSecondHalfOfArray(int[] numbers) {
        int a;
        int b;
        ArrayList myList = new ArrayList();
        a = numbers.length / 2;
        b = numbers.length;
        for (int i = a; i < b; i++) {
            myList.add(numbers[i]);
        }
        return myList;
    }

    public static void main(String[ ] args) {
        int[] array = {1,2,3,4,5,6,7};
        ArrayList myList = printSecondHalfOfArray(array);
        System.out.println(myList);
    }
}
