public class specialEleven {
    public static void main(String[] args) {
        System.out.println(specialEleven(22));
        System.out.println(specialEleven(23));

    }

    public static boolean specialEleven(int n) {
        if (n % 11 == 0) {
            return true;
        }

        if (n % 11 == 1) {
            return true;
        }

        return false;
    }
}
