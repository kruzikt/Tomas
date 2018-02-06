package Beginner;

public class Task5 {
    static String ResultFromMark(int mark) {
        String s = "";

        switch(mark) {
            case 1:
                s = "Excellent";
                break;
            case 2:
                s = "Good";
                break;
            case 3:
                s = "Average";
                break;
            case 4:
                s = "Poor";
                break;
            case 5:
                s = "Very Poor";
                break;
            default:
                s = "Wrong mark";
        }
        return s;
    }

    public static void main(String args[]) {
        String result = ResultFromMark(4);
        System.out.println(result);
    }
}
