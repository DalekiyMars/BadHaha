import java.math.BigInteger;
import java.util.Scanner;

public class FactIteration {

    public static void main(String[] args) {
        Scanner introducedStr = new Scanner(System.in);
        int enteredNum = -1;
        try {
            while(enteredNum < 0) {
                System.out.println("Enter positive number!\n");
                enteredNum = introducedStr.nextInt();
            }
            System.out.println("Your result using iterations= " + factorialIteration(enteredNum));
            System.out.println("Your result using recursions= " + factorialRecursion(enteredNum));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static BigInteger factorialIteration(int value) {
        BigInteger result = BigInteger.ONE;
        if (value == 0 || value == 1) {
            return BigInteger.ONE;
        } else {
            for (int i = 2; i <= value; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        }
    }

    public static BigInteger factorialRecursion(int value) {
        if (value <= 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(value).multiply(factorialRecursion(value - 1));
    }
}
