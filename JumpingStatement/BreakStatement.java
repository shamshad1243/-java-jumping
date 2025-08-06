package JumpingStatement;

public class BreakStatement {
    public static void main(String[] arge) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            if (i == 6)
                break;
            System.out.println(i);
        }
    }
}