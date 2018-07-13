package Conditionals;

import java.util.Calendar;
import java.util.Date;

public class SwitchStatement {

        public static void main(String[] args) {
            System.out.println(SwitchStatement.method2());
        }

        public static String method2 () {
            switch (weekday()) {
                case 1:
                    return "Sunday";
                case 2:
                    return "monday";
                case 3:
                    return "tuesday";
                case 4:
                    return "wednesday";
                case 5:
                    return "thursday";
                case 6:
                    return "friday";
                default:
                    return "Saturday";
            }
        }


            public static int weekday(){

                Date now = new Date();
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(now);
                return (calendar.get(Calendar.DAY_OF_WEEK));
            }
}
