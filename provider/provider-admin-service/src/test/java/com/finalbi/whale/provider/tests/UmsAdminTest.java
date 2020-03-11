package com.finalbi.whale.provider.tests;
import java.util.Date;

import com.finalbi.whale.provider.api.UmsAdminService;
import com.finalbi.whale.provider.domain.UmsAdmin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UmsAdminTest {

    @Resource
    private UmsAdminService umsAdminService;

    @Resource
    private BCryptPasswordEncoder passwordEncoder;

    @Test
    public void getTest() {
        UmsAdmin umsAdmin = umsAdminService.get("admin");
        System.out.println(umsAdmin);
    }

    @Test
    public void insertTest() {
        UmsAdmin umsAdmin = new UmsAdmin();
        umsAdmin.setUsername("admin");
        umsAdmin.setPassword("123456");
        umsAdmin.setIcon("http://b-ssl.duitang.com/uploads/item/201707/19/20170719211350_4PnBt.jpeg");
        umsAdmin.setEmail("admin@qq.com");
        umsAdmin.setNickName("系统管理员");
        umsAdmin.setNote("系统管理员");
        umsAdmin.setCreateTime(new Date());
        umsAdmin.setLoginTime(new Date());
        umsAdmin.setStatus(1);
        umsAdminService.insert(umsAdmin);
    }
}
