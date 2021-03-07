import org.junit.Assert;

import java.util.stream.LongStream;

import static org.junit.jupiter.api.Assertions.*;

class RangeExampleImplTest {

    @org.junit.jupiter.api.Test
    void calculate() {
        long x,y;
        x=2L;
        y=2L;
        Assert.assertEquals(2L, LongStream.rangeClosed(x, y).reduce(1, (a, b) -> a * b));

    }
}