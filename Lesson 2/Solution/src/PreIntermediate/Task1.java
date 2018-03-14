package PreIntermediate;

public class Task1 {
    static boolean visitCinema(boolean heSmile, boolean sheSmile) {
        if (heSmile == true && sheSmile == true) {
            return true;
        }
        else if (heSmile == false && sheSmile == false) {
            return true;
        }
        return false;
    }

    public static void main(String[ ] args) {
        boolean heSmile = false;
        boolean sheSmile = false;

        boolean a = visitCinema(heSmile, sheSmile);
        System.out.println(a);
    }
}
