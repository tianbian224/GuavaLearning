package Logger;

import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


/**
 * Created by cang.lv at 2018/7/19 20:34.
 */
public class Slf4jDemo {
    private static final Logger logger = LoggerFactory.getLogger(Slf4jDemo.class);
    @Test
    public void test(){

        logger.info("{}","acd");
        logger.trace("{}","aaaa");
        logger.trace("{}","bbb");

    }
}
