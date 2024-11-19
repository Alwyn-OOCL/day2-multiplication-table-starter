package com.tw;

public class MultiplicationTableBuilder {
    public boolean isInRange(int number) {
        return number > 1 && number <= 1000;
    }

    public boolean isStartNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public boolean isValid(int start, int end) {
        return isInRange(start) && isInRange(end) && isStartNotBiggerThanEnd(start, end);
    }

    public String generateExpression(int start, int end) {
        if (isValid(start, end)) {
            return start + "*" + end + "=" + start * end;
        }
        return null;
    }

    public String generateMultiplicationTableRow(int start, int end) {
        return "";
    }
}
