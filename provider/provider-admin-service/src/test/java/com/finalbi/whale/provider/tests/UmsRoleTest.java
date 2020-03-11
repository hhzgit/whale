package com.finalbi.whale.provider.tests;
import java.util.Date;
import java.util.List;

import com.finalbi.whale.provider.api.UmsRoleService;
import com.finalbi.whale.provider.domain.UmsRole;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(properties = "spring.profiles.active=dev")
@RunWith(SpringRunner.class)
public class UmsRoleTest {

    @Resource
    private UmsRoleService roleService;

    @Test
    public void insertTest() {
        UmsRole umsRole = new UmsRole();
        umsRole.setName("test");
        umsRole.setDescription("test");
        umsRole.setAdminCount(0);
        umsRole.setCreateTime(new Date());
        umsRole.setStatus(0);
        umsRole.setSort(0);
        int result = roleService.insert(umsRole);
        System.out.println(result);
    }

    @Test
    public void updateTest() {
        UmsRole umsRole = new UmsRole();
        umsRole.setId(5L);
        umsRole.setName("hahah");
        int result = roleService.update(umsRole);
        System.out.println(result);
    }

    @Test
    public void getAllTest() {
        List<UmsRole> all = roleService.getAll();
        all.forEach(role -> {
            System.out.println(role);
        });
    }

    @Test
    public void getAllNormalTest() {
        List<UmsRole> allNormal = roleService.getAllNormal();
        allNormal.forEach(role -> {
            System.out.println(role);
        });
    }

    @Test
    public void getAllDeletedTest() {
        List<UmsRole> allDeleted = roleService.getAllDeleted();
        allDeleted.forEach(role -> {
            System.out.println(role);
        });
    }

    @Test
    public void getUserRolesTest() {
        List<UmsRole> userRoles = roleService.getUserRoles(1L);
        userRoles.forEach(role -> {
            System.out.println(role);
        });
    }
}
