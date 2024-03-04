package Lab3;

import static org.junit.Assert.*;

import org.junit.Test;

public class SelectionSortTest {
    
    @Test
    public void testSelectionSort1() {
        int[] arr = {64, 25, 12, 22, 11};
        SelectionSort.selectionSort(arr);
        assertArrayEquals(new int[]{11, 12, 22, 25, 64}, arr);
    }

    @Test
    public void testSelectionSort2() {
        int[] arr = {25, 9, 3, 15, 48, 6};
        SelectionSort.selectionSort(arr);
        assertArrayEquals(new int[]{3, 6, 9, 15, 25, 48}, arr);
    }

    @Test
    public void testSelectionSort3() {
        int[] arr = {-13, 6, -18, 123, 7, 87, 0};
        SelectionSort.selectionSort(arr);
        assertArrayEquals(new int[] {-18, -13, 0, 6, 7, 87, 123}, arr);
    }

    @Test
    public void testSelectionSort4() {
        int[] arr = {5, -5, 15, -25};
        SelectionSort.selectionSort(arr);
        assertArrayEquals(new int[] {-25, -5, 5, 15}, arr);
    }
}