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
        int nos = 0;
        int dow = 2;//As 1 Jan 1901 is Tuesday.
        for (int year = 1901; year <= 2000; year++) {
            for (int month = 1; month <= 12; month++) {
                for (int day = 1; day <= getNoOfDays(year, month); day++) {
                    dow++;
                    if (dow == 7) {
                        if (day == 1) nos++;
                        dow = 0;
                    }
                }
            }
        }
        return nos;
    }


    private static int getNoOfDays(int y, int m) {
        if (m == 2)
            return y % 4 == 0 ? 29 : 28;
        if (m == 4 || m == 6 || m == 9 || m == 11)
            return 30;
        else
            return 31;
    }


}
