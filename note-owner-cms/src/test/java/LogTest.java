import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * Copyright (C), 2023, 北京合商云汇科技有限公司
 * FileName: LogTest
 * Author: ZL
 * Date: 2023/1/4 10:07:55
 * Description:
 */
@Slf4j
public class LogTest {

    @Test
    void testLog(){
        String testInfo = "Free flying flowers are like dreams";
        log.info("The test info is :{}", testInfo);
    }
}
