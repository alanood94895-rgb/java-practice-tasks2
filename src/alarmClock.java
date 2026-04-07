public class alarmClock {
    public static void main(String[] args) {
        System.out.println(alarmClock(1, false));
        System.out.println(alarmClock(5, false));

    }

    public static String alarmClock(int day, boolean vacation) {
        boolean isWeekday = (day >= 1 && day <= 5);

        if (isWeekday) {
            if (vacation){
                return "10:00" ;
            } else {
                return "7:00";
            }

        } else {
            if (vacation){
                return "off";

            }else {
                return "10:00";
            }
        }
    }
}
