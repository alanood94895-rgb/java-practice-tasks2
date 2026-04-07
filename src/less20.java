public class less20 {
    public static void main(String[] args) {
        System.out.println(less20(18));
        System.out.println(less20(19));
    }
    public static boolean less20(int n) {
        if (n % 20 == 18) {
            return true;
        }
        if (n % 20 == 19) {
            return true;
        }
        return false;
    }
}
