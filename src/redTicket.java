public class redTicket {
    public static void main(String[] args) {
        System.out.println(redTicket(2, 2, 2));
        System.out.println(redTicket(2, 2, 1));
    }
    public static int redTicket(int a, int b, int c) {

        if (a == 2 && b == 2 && c == 2) {
            return 10;
        }

        if (a == b && b == c) {
            return 5;
        }

        if (b != a && c != a) {
            return 1;
        }
        return 0;
    }
}
