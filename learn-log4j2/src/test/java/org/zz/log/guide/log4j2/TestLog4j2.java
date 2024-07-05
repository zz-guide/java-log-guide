package org.zz.log.guide.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

public class TestLog4j2 {
    @Test
    public void testLog4j2One(){
        Logger logger = LogManager.getLogger(TestLog4j2.class);

        logger.info("hello slf4j-log4j2-One");
    }
}
