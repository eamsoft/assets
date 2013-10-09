package com.cancosoft.assets.handset.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class CheckProjectServiceTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private CheckProjectService checkProjectService;

    @Transactional(readOnly = true)
    @Test
    public void testIsRegister() throws Exception {
        System.out.println("Test Spring Data JPA @Query , Find CheckProject Table By MachineNo.");
        System.out.println("findByMachineNo:'ABCD-EFG'.'1:yes,0:no'.---" + checkProjectService.isRegister("ABCD-EFG"));
        System.out.println("findByMachineNo:'EEEE-TTT'.'1:yes,0:no'.---" + checkProjectService.isRegister("EEEE-TTT"));
        System.out.println("Jpa Hibernate.cacheable.");
        System.out.println("findByMachineNo:'ABCD-EFG'.'1:yes,0:no'.---" + checkProjectService.isRegister("ABCD-EFG"));
        System.out.println("findByMachineNo:'EEEE-TTT'.'1:yes,0:no'.---" + checkProjectService.isRegister("EEEE-TTT"));
    }
}