class Solution {
    public int dayOfYear(String date) {

        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        int total = day;

        // Add days of previous months
        for (int i = 1; i < month; i++) {

            if (i == 2) {
                total += isLeapYear(year) ? 29 : 28;
            }
            else if (i == 4 || i == 6 || i == 9 || i == 11) {
                total += 30;
            }
            else {
                total += 31;
            }
        }

        return total;
    }

    boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0)
                || year % 400 == 0;
    }
}