package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayLength3() {
        int[] data = new int[] {15, 9, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {7, 9, 15};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayLength5() {
        int[] data = new int[] {6, -2, 0, 93, -72};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-72, -2, 0, 6, 93};
        assertThat(result).containsExactly(expected);
    }
}