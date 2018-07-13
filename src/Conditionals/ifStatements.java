package Conditionals;

//there are different types of if statements
//# What is an if/else-if/else used for?
//an if else if else statement can be used in similar circumstances to a switch statement. If is used if you are testing
//multiple different scenarios

import java.util.Calendar;
import java.util.Date;

    public class ifStatements {

        public static void main(String[] args) {
            System.out.println(ifStatements.method2());
        }

        public static String method2 () {
            if (weekday() == 1) {
                return "Sunday";
            } else {
                if (weekday() == 2) {
                    return "Monday";
                } else if (weekday() == 3) {
                    return "Tuesday";
                } else if (weekday() == 4) {
                    return "Wednesday";
                } else if (weekday() == 5) {
                    return "Thursday";
                } else if (weekday() == 6) {
                    return "Friday";
                } else return "Sat";
            }
        }




        public static int weekday(){

            Date now = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(now);
            return (calendar.get(Calendar.DAY_OF_WEEK));
        }
    }


