package Beginner;
import java.util.ArrayList;

public class Task6 {
    static ArrayList<Integer> EvenValues(int[] arr) {
        ArrayList<Integer> myList = new ArrayList<Integer>();

        int i=0;
        for(int stuff : arr) {
            if (stuff > 0 && stuff % 2 == 0) {
                myList.add(stuff);
            }
        }
        return myList;
    }

    public static void main(String[] args) {
        int[] array = new int[51];

        for(int p=0;p<array.length;p++)
        {
            array[p] = p;
        }

        ArrayList<Integer> a = EvenValues(array);

        for(int stuff : a) {
            System.out.println(stuff);
        }
    }
}
