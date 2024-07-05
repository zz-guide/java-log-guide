package org.zz.log.guide.jul;

import org.junit.jupiter.api.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestJUL {
    @Test
    public void testJUL1(){
        Logger logger = Logger.getLogger("jul1");

        logger.info("hello jul");

        logger.log(Level.INFO, "info msg");

        logger.log(Level.INFO, "用户信息：{0},{1}", new Object[]{"仔仔", 18});
    }

    @Test
    public void testJUL2(){
        Logger logger = Logger.getLogger("jul2");

        logger.severe("severe");
        logger.warning("warning");
        logger.info("info");

        // 以下级别均未实现
        logger.config("config");
        logger.fine("fine");
        logger.finer("finer");
        logger.finest("finest");
    }

    @Test
    public void testJUL3(){

    }
}
