package org.zz.log.guide.jcl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;

public class TestJCL {
    @Test
    public void testJCL1(){
        Log log = LogFactory.getLog(TestJCL.class);

        // 没有实现包的话，默认使用的是JUL
        log.info("hello jul");
    }
}
