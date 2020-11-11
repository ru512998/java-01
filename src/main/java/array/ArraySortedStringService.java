package array;

public class ArraySortedStringService {
    public ArraySortedStringService() {
    }

    String[] arraySortedString(String[] arrayString) {
        boolean isSorted = true;

        while(isSorted) {
            isSorted = false;

            for(int i = 0; i < arrayString.length - 1; ++i) {
                if (arrayString[i].length() > arrayString[i + 1].length()) {
                    String temp = arrayString[i];
                    arrayString[i] = arrayString[i + 1];
                    arrayString[i + 1] = temp;
                    isSorted = true;
                }
            }
        }

        return arrayString;
    }
}