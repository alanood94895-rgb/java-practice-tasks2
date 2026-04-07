public class answerCell {
    public static void main(String[] args) {
        System.out.println(answerCell(false, false, false));
        System.out.println(answerCell(false, false, true));

    }
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

        if (isAsleep) {
            return false;
        }

        if (isMorning) {
            if (isMom) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}
