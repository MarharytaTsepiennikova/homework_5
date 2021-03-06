import java.util.Arrays;

/**
 * Написать функцию, которая принимает массив чисел в качестве аргумента,
 * увеличивает его первые 3 элемента на 1 и возвращает их сумму как результат.
 * После изменения массив и сумму надо вывести на экран.
 */

public class Homework5_2 {
    public static void main(String[] args) {
        int[] array = {2, 1, 5, 6, 1, 9};
        int sum = sumOfThreeElements(array);
        System.out.println(sum);
        String strArray = Arrays.toString(array);
        System.out.println(strArray);

    }
    static int sumOfThreeElements(int[] array){
        int result = 0;
        for (int index = 0; index < 3; index++) {
            array[index]++;
        }

        for (int index = 0; index < 3; index++) {
            result += array[index];
        }
        return result;
    }
}
