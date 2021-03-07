import java.util.stream.LongStream;

public class RangeExampleImpl implements RangeExample{


    @Override
    public long calculate(Long x, Long y) {


     long  value = LongStream.rangeClosed(x, y).reduce(1, (a, b) -> a * b);

        return value;
        };


    }

