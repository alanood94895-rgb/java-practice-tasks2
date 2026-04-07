public class squirrelPlay {
    public static void main(String[] args) {
        System.out.println(squirrelPlay(70, false));
        System.out.println(squirrelPlay(95, false));
    }
    public static boolean squirrelPlay(int temp, boolean isSummer) {
        int upperLimit = isSummer ? 100 : 90;

        if (temp >= 60 && temp <= upperLimit) {
            return true;
        }
        return false;
    }
}
