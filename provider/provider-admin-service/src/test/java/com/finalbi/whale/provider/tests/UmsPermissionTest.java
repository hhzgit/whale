package com.finalbi.whale.provider.tests;

import com.finalbi.whale.provider.api.UmsPermissionService;
import com.finalbi.whale.provider.domain.UmsPermission;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@SpringBootTest(properties = "spring.profiles.active=dev")
@RunWith(SpringRunner.class)
public class UmsPermissionTest {

    @Resource
    private UmsPermissionService umsPermissionService;

    @Test
    public void getUserPermissionsTest() {
        List<UmsPermission> userPermissions = umsPermissionService.getUserPermissions(1L);
        userPermissions.forEach(umsPermission -> {
            System.out.println(umsPermission);
        });
    }

    @Test
    public void insertTest() {
        UmsPermission permission = new UmsPermission();
        permission.setPid(0L);
        permission.setName("test");
        permission.setValue("test");
        permission.setIcon("");
        permission.setType(0);
        permission.setUri("test");
        permission.setStatus(0);
        permission.setCreateTime(new Date());
        permission.setSort(0);
        int result = umsPermissionService.insert(permission);
        System.out.println(result);
    }

    @Test
    public void updateTest() {
        UmsPermission permission = new UmsPermission();
        permission.setId(19L);
        permission.setName("1111111111");
        int result = umsPermissionService.update(permission);
        System.out.println(result);
    }

    @Test
    public void getAllTest() {
        List<UmsPermission> all = umsPermissionService.getAll();
        for (UmsPermission p: all) {
            System.out.println(p);
        }
    }

    @Test
    public void getAllNormalTests() {
        List<UmsPermission> all = umsPermissionService.getAllNormal();
        for (UmsPermission p: all) {
            System.out.println(p);
        }
    }

    @Test
    public void getAllDeletedTests() {
        List<UmsPermission> all = umsPermissionService.getAllDeleted();
        for (UmsPermission p: all) {
            System.out.println(p);
        }
    }
}
