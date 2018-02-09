package Beginner;

import java.util.ArrayList;

public class Task8 {
    static String StringGenerator(String input, int length) {
        ArrayList<String> myString = new ArrayList<String>();

        for (int i=length;i>0;i--) {
            myString.add(input.substring(0, i));
        }

        StringBuilder listString = new StringBuilder();

        for (String s : myString)
            listString.append(s+"");
        String s = listString.toString();
        return s;
    }

    public static void main(String[ ] args) {
        String a = StringGenerator("Testing",4);
        System.out.println(a);
    }
}
