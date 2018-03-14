package PreIntermediate;

public class Task7 {
    static void multiplicationTable(int input) throws IllegalArgumentException {
        if (input < 0 || input > 10) {
            throw new IllegalArgumentException("Invalid input, should be 0...10");
        } else {
            for (int i = 1; i <= input; i++) {
                int result = i * input;
                System.out.println(i + "*" + input + "=" + result);
            }
        }
    }
    public static void main(String[] args) {
        int input = 10;
        multiplicationTable(input);
    }
}
