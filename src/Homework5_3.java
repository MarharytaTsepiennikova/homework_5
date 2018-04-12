/**
 * Написать ф-ю, которая принимает на вход массив чисел и возвращает его длину в байтах как результат.
 */

public class Homework5_3 {
    public static void main(String[] args) {
        int[] array = {2, 1, 5, -4, 3, 8};
        System.out.println(arrayInBytes(array));
    }
    static int arrayInBytes(int[] array){
        int result = 0;
        result = array.length * 4;
        return result;
    }
}
