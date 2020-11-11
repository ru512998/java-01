package array;

public class TriangleMatrix {
    public TriangleMatrix() {
    }

    public int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int k = 0;

        for(int i = 0; i < count; ++i) {
            triangle[i] = new int[i + 1];

            for(int j = 0; j <= i; ++j) {
                int[] var10000 = triangle[i];
                ++k;
                var10000[j] = k;
            }
        }

        return triangle;
    }
}