class Solution {
    public int dayOfYear(String date) {

        int[] firstDayArr = {1, 32, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};
        int year = parse(date, 0, 4);
        int month = parse(date, 5, 2);
        int day = parse(date, 8, 2);
        int leap = 0;
        if (month > 2) {
            leap = ((year & 3) == 0) && ((year % 100) != 0 || (year % 400) == 0) ? 1 : 0;
        }
        return firstDayArr[month - 1] + day + leap - 1;
    }

    private int parse(String date, int offset, int length) {
        int sum = 0;
        while (length-- > 0) {
            sum = sum * 10 + date.charAt(offset++) - '0';
        }
        return sum;
    }
}