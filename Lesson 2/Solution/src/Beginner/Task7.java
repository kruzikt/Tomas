package Beginner;

import java.util.ArrayList;
import java.util.Collections;

public class Task7 {
    static void MaxValue(ArrayList<Integer> array) {
        System.out.println("Max value: " + Collections.max(array));
    }

    public static void main(String[ ] args) {
        int[] array = { 3, 36, 73, 40, 115 };

        ArrayList<Integer> list = new ArrayList<>(array.length);

        for (int i : array) {
            list.add(Integer.valueOf(i));
        }

        MaxValue(list);
    }
}
