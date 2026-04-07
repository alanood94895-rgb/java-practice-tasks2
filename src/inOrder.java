public class inOrder {
    public static void main(String[] args) {
        System.out.println(inOrder(1, 2, 4, false));
    }
    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk == false) {
            if (b > a && c > b) {
                return true;
            }
                }
        if (bOk == true) {
            if (c > b) {
                return true;
            }
        }
        return false;
    }
}
