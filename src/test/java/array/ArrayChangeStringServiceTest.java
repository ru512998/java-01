package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayChangeStringServiceTest {
    public ArrayChangeStringServiceTest() {
    }

    @Test
    void whenTakeArrayThenReturnChangeArray() {
        ArrayChangeStringService arrayChangeStringService = new ArrayChangeStringService();
        String[] arrayString = new String[]{"Elephant", "Buzzard", "Pig", "Mockingbird", "Lions", "Bittern", "Bees", "Seahorse", "Turtles", "Wallaby"};
        String[] actualArray = new String[]{"Wallaby", "Turtles", "Seahorse", "Bees", "Bittern", "Lions", "Mockingbird", "Pig", "Buzzard", "Elephant"};
        Assertions.assertArrayEquals(actualArray, arrayChangeStringService.arrayChangeString(arrayString));
    }
}