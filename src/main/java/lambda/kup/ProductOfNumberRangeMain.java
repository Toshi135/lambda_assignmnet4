package lambda.kup;

public class ProductOfNumberRangeMain {

    public static void main(String[] args) {

        long num1 = 1L;
        long num2 = 4L;
        ProductOfNumberRange productOfNumberRange = new ProductOfNumberRange();
        long product = productOfNumberRange.getProductOfRange(num1, num2);
        System.out.println("Product is: " +product);

    }
}
