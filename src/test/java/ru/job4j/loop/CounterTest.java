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
}