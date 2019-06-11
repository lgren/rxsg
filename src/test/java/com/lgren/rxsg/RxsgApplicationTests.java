package com.lgren.rxsg;

import com.lgren.rxsg.entity.CfgTie;
import com.lgren.rxsg.service.ICfgTieService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RxsgApplicationTests {
    @Autowired
    private ICfgTieService cfgTieService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void name() {
        CfgTie cfgTie = new CfgTie();
        cfgTie.setName("你好哇");
        // cfgTie.setTieid(100003);
        cfgTie.setCount(16);
        cfgTieService.save(cfgTie);
        System.out.println();
    }
}
