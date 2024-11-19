package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MultiplicationTableBuilderTest {
    @Test
    void should_return_true_when_isInRange_given_a_number_5() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int number = 5;

        // When
        boolean isInRange = multiplicationTableBuilder.isInRange(number);

        // Then
        assertTrue(isInRange);
    }


    @Test
    void should_return_false_when_isInRange_given_a_number_0() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int number = 0;

        // When
        boolean isInRange = multiplicationTableBuilder.isInRange(number);

        // Then
        assertFalse(isInRange);
    }

    @Test
    void should_return_false_when_inInRange_given_a_number_1001() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int number = 1001;

        // When
        boolean isInRange = multiplicationTableBuilder.isInRange(number);

        // Then
        assertFalse(isInRange);
    }

    @Test
    void should_return_true_when_isStartNotBiggerThanEnd_given_a_start_2_and_end_3() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 3;

        // When
        boolean isStartNotBiggerThanEnd = multiplicationTableBuilder.isStartNotBiggerThanEnd(start, end);

        // Then
        assertTrue(isStartNotBiggerThanEnd);
    }

    @Test
    void should_return_false_when_isStartNotBiggerThanEnd_given_a_start_3_and_end_2() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 3;
        int end = 2;

        // When
        boolean isStartNotBiggerThanEnd = multiplicationTableBuilder.isStartNotBiggerThanEnd(start, end);

        // Then
        assertFalse(isStartNotBiggerThanEnd);
    }

    @Test
    void should_return_true_when_isStartNotBiggerThanEnd_given_a_start_3_and_end_3() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 3;
        int end = 3;

        // When
        boolean isStartNotBiggerThanEnd = multiplicationTableBuilder.isStartNotBiggerThanEnd(start, end);

        // Then
        assertTrue(isStartNotBiggerThanEnd);
    }

    @Test
    void should_return_true_when_isValid_given_a_start_2_and_end_3() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 3;

        // When
        boolean isValid = multiplicationTableBuilder.isValid(start, end);

        // Then
        assertTrue(isValid);
    }

    @Test
    void should_return_false_when_isValid_given_a_start_2_and_end_1() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 1;

        // When
        boolean isValid = multiplicationTableBuilder.isValid(start, end);

        // Then
        assertFalse(isValid);
    }

    @Test
    void should_return_false_when_isValid_given_a_start_0_and_end_2() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 0;
        int end = 2;

        // When
        boolean isValid = multiplicationTableBuilder.isValid(start, end);

        // Then
        assertFalse(isValid);
    }

    @Test
    void should_return_false_when_isValid_given_a_start_2_and_end_1001() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 1001;

        // When
        boolean isValid = multiplicationTableBuilder.isValid(start, end);

        // Then
        assertFalse(isValid);
    }

    @Test
    void should_return_expression_when_generateExpression_given_a_start_2_and_end_3() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 3;

        // When
        String multiplicationTable = multiplicationTableBuilder.generateExpression(start, end);

        // Then
        assertEquals("2*3=6", multiplicationTable);
    }

    @Test
    void should_return_null_when_generateExpression_given_a_start_2_and_end_1() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 1;

        // When
        String multiplicationTable = multiplicationTableBuilder.generateExpression(start, end);

        // Then
        assertNull(multiplicationTable);
    }

    @Test
    void should_return_null_when_generateExpression_given_a_start_2_and_end_1001() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 1001;

        // When
        String multiplicationTable = multiplicationTableBuilder.generateExpression(start, end);

        // Then
        assertNull(multiplicationTable);
    }

    @Test
    void should_return_multiplicationTableRow_when_generateMultiplicationTableRow_given_a_start_2_and_end_3() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 3;

        // When
        String multiplicationTableRow = multiplicationTableBuilder.generateMultiplicationTableRow(start, end);

        // Then
        assertEquals("2*2=4 2*3=6", multiplicationTableRow);
    }

    @Test
    void should_return_null_when_generateMultiplicationTableRow_given_a_start_3_and_end_2() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 3;
        int end = 2;

        // When
        String multiplicationTableRow = multiplicationTableBuilder.generateMultiplicationTableRow(start, end);

        // Then
        assertNull(multiplicationTableRow);
    }

    @Test
    void should_return_null_when_generateMultiplicationTableRow_given_a_start_2_and_end_1001() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 1001;

        // When
        String multiplicationTableRow = multiplicationTableBuilder.generateMultiplicationTableRow(start, end);

        // Then
        assertNull(multiplicationTableRow);
    }
}
