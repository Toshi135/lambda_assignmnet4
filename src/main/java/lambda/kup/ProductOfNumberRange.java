package lambda.kup;


import java.util.stream.LongStream;

public class ProductOfNumberRange implements ProductOfNumberRange_Interface {
    @Override
    public long getProductOfRange(long numberOne, long numberTwo) {

        long getProduct = LongStream.rangeClosed(numberOne, numberTwo).reduce(1, (rangeLow, rangeUpper) -> rangeLow * rangeUpper);

        return getProduct;
    };


}
