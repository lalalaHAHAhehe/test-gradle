package meter.one;

import com.meter.A;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

@Slf4j
public class TestNGOne {

    @Test
    public void success() {
        System.out.println("JunitTest fail");
        A.a();
        Assertions.assertTrue(true, "123");
    }

    @Test
    public void fail() {
        System.out.println("JunitTest fail");
        log.info("1111.infoq11 kk");
        log.info("1111.infoq11 kk");
        throw new RuntimeException("111");
    }

}
