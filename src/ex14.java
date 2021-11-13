public class ex14 {
    static int product(int... numbers) {
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }
    public static void main(String[] args) {
        System.out.printf("The product of 2 numbers : %d%n", product(4, 6));
        System.out.printf("The product of 3 numbers : %d%n", product(8, 2, 82));
        System.out.printf("The product of 4 numbers : %d%n", product(3, 11, 8, 2));
        System.out.printf("The product of 5 numbers : %d%n", product(1, 9, 46, 7, 5));
    }
}