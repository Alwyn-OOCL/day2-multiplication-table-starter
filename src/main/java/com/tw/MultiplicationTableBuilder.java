package com.tw;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
        if (isValid(start, end)) {
            return IntStream.rangeClosed(start, end)
                    .mapToObj(currentItem -> generateExpression(start, currentItem))
                    .collect(Collectors.joining(" "));
        }
        return null;
    }
}
