package array;

public class ArrayChangeStringService {
    public ArrayChangeStringService() {
    }

    public String[] arrayChangeString(String[] array) {
        for(int i = 0; i < array.length / 2; ++i) {
            String temp = array[array.length - i - 1];
            array[array.length - 1 - i] = array[i];
            array[i] = temp;
        }

        return array;
    }
}
