public class inOrderEqual {
    public static void main(String[] args) {
        System.out.println(inOrderEqual(2, 5, 11, false));
        System.out.println(inOrderEqual(5, 7, 6, false));

    }
    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {

        if (equalOk) {

            return (a <= b && b <= c);
        } else {

            return (a < b && b < c);
        }
    }
}
