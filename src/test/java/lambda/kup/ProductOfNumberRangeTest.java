package lambda.kup;

import org.junit.jupiter.api.Assertions;

public class ProductOfNumberRangeTest {

    ProductOfNumberRange productOfNumberRange = new ProductOfNumberRange();

    @org.junit.jupiter.api.Test
    void getProductOfRange() {

        long test1 = productOfNumberRange.getProductOfRange(0L, 1L);
        Assertions.assertEquals(0L, test1);

        long test2 = productOfNumberRange.getProductOfRange(2L, 2L);
        Assertions.assertEquals(2L, test2);

        long test3 = productOfNumberRange.getProductOfRange(1L, 4L);
        Assertions.assertEquals(24L, test3);

        long test4 = productOfNumberRange.getProductOfRange(5L, 15L);
        Assertions.assertEquals(54486432000L, test4);



    }
}
