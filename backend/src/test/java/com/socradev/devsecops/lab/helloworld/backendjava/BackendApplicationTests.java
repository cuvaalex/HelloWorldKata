package com.socradev.devsecops.lab.helloworld.backendjava;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BackendApplicationTests {

    @Test
    void contextLoads() {
        var args = new String[]{};
        BackendApplication.main(args);
    }

}
