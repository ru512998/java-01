package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraySortedStringServiceTest {
    public ArraySortedStringServiceTest() {
    }

    @Test
    void whenTakeArrayThenReturnSortedArray() {
        ArraySortedStringService arraySortedStringService = new ArraySortedStringService();
        String[] arrayString = new String[]{"Elephant", "Buzzard", "Pig", "Mockingbird", "Lions", "Bittern", "Bees", "Seahorse", "Turtles", "Wallaby"};
        String[] actualArray = new String[]{"Pig", "Bees", "Lions", "Buzzard", "Bittern", "Turtles", "Wallaby", "Elephant", "Seahorse", "Mockingbird"};
        Assertions.assertArrayEquals(actualArray, arraySortedStringService.arraySortedString(arrayString));
    }
}