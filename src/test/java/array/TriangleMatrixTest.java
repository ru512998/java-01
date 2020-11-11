package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleMatrixTest {
    public TriangleMatrixTest() {
    }

    @Test
    public void whenRows1() {
        TriangleMatrix triangleMatrix = new TriangleMatrix();
        int[][] result = new int[][]{{1}};
        Assertions.assertArrayEquals(result, triangleMatrix.rows(1));
    }

    @Test
    public void whenRows2() {
        TriangleMatrix triangleMatrix = new TriangleMatrix();
        int[][] result = new int[][]{{1}, {2, 3}};
        Assertions.assertArrayEquals(result, triangleMatrix.rows(2));
    }

    @Test
    public void whenRows3() {
        TriangleMatrix triangleMatrix = new TriangleMatrix();
        int[][] result = new int[][]{{1}, {2, 3}, {4, 5, 6}};
        Assertions.assertArrayEquals(result, triangleMatrix.rows(3));
    }
}