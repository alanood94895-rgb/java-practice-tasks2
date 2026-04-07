public class lessBy10 {
    public static void main(String[] args) {
        System.out.println(lessBy10(1, 7, 11));
        System.out.println(lessBy10(1, 7, 10));

    }

    public static boolean lessBy10(int a, int b, int c) {
        if (Math.abs(a - b) >= 10) return true;
        if (Math.abs(a - c) >= 10) return true;
        if (Math.abs(b - c) >= 10) return true;

        return false;
    }
}
