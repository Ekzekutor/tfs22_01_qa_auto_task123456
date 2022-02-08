import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SorterTests {
    Sorter sorter = new Sorter();
    @Test
    public void simpleTests(){
        int[] arrayToSort = {3,2,1};
        int[] sortedArray = sorter.sort(arrayToSort);
        Assertions.assertArrayEquals(Arrays.stream(arrayToSort).sorted().toArray(), sortedArray);
    }

    @Test
    public void simpleTests2(){
        int[] arrayToSort = {3,2,1};
        int[] sortedArray = sorter.sort(arrayToSort);
        Assertions.assertArrayEquals(Arrays.stream(arrayToSort).sorted().toArray(), sortedArray);
    }

    @Test
    public void simpleTests3(){
        int[] arrayToSort = {3,2,1};
        int[] sortedArray = sorter.sort(arrayToSort);
        Assertions.assertArrayEquals(Arrays.stream(arrayToSort).sorted().toArray(), sortedArray);
    }

    @Test
    public void simpleTests4(){
        int[] arrayToSort = {3,2,1};
        int[] sortedArray = sorter.sort(arrayToSort);
        Assertions.assertArrayEquals(Arrays.stream(arrayToSort).sorted().toArray(), sortedArray);
    }


}
