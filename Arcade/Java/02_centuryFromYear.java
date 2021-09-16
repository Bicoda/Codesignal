// Given a year, return the century it is in. The first century spans from the year 1 up to and including the year 100, the second - from the year 101 up to and including the year 200, etc.

final class CenturyFromYear {
    
    int centuryFromYear(int year) {
        int result = year / 100;
        if (year % 100 != 0) result++;
        return result;
    }
}