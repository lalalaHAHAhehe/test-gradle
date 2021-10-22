package meter;

import com.alibaba.fastjson.JSON;
import com.meter.A;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;

public class TestNG {

    @Test
    public void success222() {
        System.out.println("JunitTest fail");
        A.a();
        Assertions.assertTrue(true, "123");
    }

    @Test
    public void fail() {
        System.out.println("JunitTest fail");
        A.a();
        Assertions.assertTrue(false, "123");
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "{\"hashUserId\":\"0ca175b9c0f726a831d895e269332461\"}";
        JSON.parseObject(s,ExtendInfo.class);

    }

    public static class ExtendInfo {
        private String hashUserId;

        public String getHashUserId() {
            return hashUserId;
        }

        public void setHashUserId(String hashUserId) {
            this.hashUserId = hashUserId;
        }
    }

}
