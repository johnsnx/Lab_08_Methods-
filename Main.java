public class Main {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        int num3 = 6;

        int result = multiplyThreeNumbers(num1, num2, num3);
        System.out.println("The product is: " + result);
    }
    public static int multiplyThreeNumbers(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }
}
