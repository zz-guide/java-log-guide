package org.zz.log.guide.logback;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

public class TestLogback {
    @Test
    public void testLogback1(){
        Logger logger = LoggerFactory.getLogger(TestLogback.class);

        System.out.println("=== slf4j level 级别 ===");
        System.out.println("ERROR:"+ Level.ERROR.toInt());
        System.out.println("WARN:"+ Level.WARN.toInt());
        System.out.println("INFO:"+ Level.INFO.toInt());
        System.out.println("DEBUG:"+ Level.DEBUG.toInt());
        System.out.println("TRACE:"+ Level.TRACE.toInt());

        logger.error("error slf4j-logback-1");
        logger.warn("warn slf4j-logback-1");
        logger.info("info slf4j-logback-1");
        logger.debug("debug slf4j-logback-1");
        logger.trace("trace slf4j-logback-1");
    }

    @Test
    public void testLogback2(){
        Logger logger = LoggerFactory.getLogger(TestLogback.class);

        logger.warn("error {} {} {}", "slf4j-logback-1", 1, 2); // 使用花括号占位，拼接变量
    }
}
