public class IT26101243Lab9Q3 {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        // Expression i: (3 * 4 + 5 * 7)^2
        int term1 = multiply(3, 4);
        int term2 = multiply(5, 7);
        int sum1 = add(term1, term2);
        int expr1Result = square(sum1);

        // Expression ii: (4 + 7)^2 + (8 + 3)^2
        int sum2 = add(4, 7);
        int sum3 = add(8, 3);
        int square1 = square(sum2);
        int square2 = square(sum3);
        int expr2Result = add(square1, square2);

        System.out.println("Result of (3*4+5*7)^2 : " + expr1Result);
        System.out.println("Result of (4+7)^2+(8+3)^2 : " + expr2Result);
    }
}
