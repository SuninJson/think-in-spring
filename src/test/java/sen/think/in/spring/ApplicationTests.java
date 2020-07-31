package sen.think.in.spring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
        this.getClass().getClassLoader().getResource("111").getFile();
    }

}
