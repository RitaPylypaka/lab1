import java.util.Scanner;
public class Binary {
    public static String convertToBinary(int number) {
        StringBuilder result = new StringBuilder();
        while (number>0) {
            int remainder = number % 2;
            result.insert(0, remainder);
            number =number /  2;
        }
    return result.toString();
    }

    public static void main (String[] args){
        System.out.println(convertToBinary(9));
    }
}
