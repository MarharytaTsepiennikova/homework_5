import java.util.Arrays;

/**
 * Написать ф-ю для объединения 2-х массивов в один. Вывести результат на консоль.
 */

public class Homework5_4 {
    public static void main(String[] args) {
        int[] array1 = {3, 1, 6, -2, 8};
        int[] array2 = {-1, 4, 3, -3, 12};
        String newArr = makeArr(array1, array2);
        System.out.println(newArr);
    }
    static String makeArr(int[] array1, int[] array2){
        int elements = 0;
        elements = array1.length + array2.length;
        int[] result = new int[elements];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, 5, array2.length);
        String strResult = Arrays.toString(result);
        return strResult;
    }
}
