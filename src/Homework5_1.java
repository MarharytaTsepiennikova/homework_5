/**
 * Написать функцию, которая принимает в качестве аргументов одну строку X, целое число Y и число с плавающей точкой Z
 * и возвращает как результат строку в виде
 * S = x + y + z.
 */

public class Homework5_1 {

    public static void main(String[] args) {
        String x = "Hello";
        int y = 14;
        double z = 8.6;
        System.out.println(makeConcat(x, y, z));
    }
    static String makeConcat(String x, int y, double z){
        String result;
        result = x + y + z;
        return result;
    }
}
