public class withoutDoubles {
    public static void main(String[] args) {
        System.out.println(withoutDoubles(2, 3, true));
        System.out.println(withoutDoubles(3, 3, true));
    }

    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {

        if (!noDoubles || die1 != die2) {
            return die1 + die2;
        }

        die1 = die1 + 1;
        if (die1 > 6) {
            die1 = 1;
        }
        return die1 + die2;
    }
}

