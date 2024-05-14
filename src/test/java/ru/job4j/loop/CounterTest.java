package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void when1And8Sum36() {
        int expected = 36;
        int start = 1;
        int finish = 8;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenMinus10AndMinus7SumMinus34() {
        int expected = -34;
        int start = -10;
        int finish = -7;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when10ANd5Sum0() {
        int expected = 0;
        int start = 10;
        int finish = 5;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusFifteenToZeroThenMinusFiftySiz() {
        int start = -15;
        int finish = 0;
        int result = Counter.sumByEven(start, finish);
        int expected = -56;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromSevenToSevenThenZero() {
        int start = 7;
        int finish = 7;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromTenToTwoThenZero() {
        int start = 10;
        int finish = 2;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}