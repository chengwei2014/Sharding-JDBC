package com.gupaoedu;

import com.gupaoedu.service.ConfigService;
import com.gupaoedu.service.IpsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan(basePackages = "com.gupaoedu.mapper")
public class ShardingTest {
    @Resource
    IpsService ipsService;

    @Test
    public void testCreateTable() {
        ipsService.insert();
    }
}

