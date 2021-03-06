/*
You are given the following information, but you may prefer to do some research for yourself.
1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
*/

/*
Solution:
There are 100 years to consider in the solution to the problem.
And We know that 12 times the DATE 01 occurs in a year.
Therefore in 1200 months. By Probablity we can conclude there are 1200/7 Sundays.
That is Approximately 171 Sundays.

*/

public class CountingSundays {
    public static void main(String[] args) {
        System.out.println("Number of Sundays in 20th Century: " + numberOfSundays());
    }

    private static int numberOfSundays() {
        int numberOfSunday = 0;
        int dayNumberOfWeek = 2;//As 1 Jan 1901 is Tuesday.
        for (int year = 1901; year <= 2000; year++) {
            for (int month = 1; month <= 12; month++) {
                for (int date = 1; date <= getNoOfDays(year, month); date++) {
                    dayNumberOfWeek++;
                    if (dayNumberOfWeek == 7) {
                        if (date == 1) numberOfSunday++;
                        dayNumberOfWeek = 0;
                    }
                }
            }
        }
        return numberOfSunday;
    }


    private static int getNoOfDays(int year, int month) {
        if (month == 2)
            return year % 4 == 0 ? 29 : 28;
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        else
            return 31;
    }


}
