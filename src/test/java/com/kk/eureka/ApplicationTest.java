package com.kk.eureka;



import com.kk.eureka.model.User;
import com.kk.eureka.service.UserMng;
import com.kk.eureka.utils.IdUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.Timestamp;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTest {
  @Resource
  private UserMng userMng;
  @Test
  public void test1() throws Exception {
    User user = new User();
    user.setId(IdUtil.getUID());
    user.setCreateTime(new Timestamp(System.currentTimeMillis()));
    user.setGender("1");
    user.setPassword("123456");
    user.setUserName("管理员");
    user.setShortName("admin");
    user.setUserNo("U00001");
    user.setTelephone("13023889130");
    user.setQqCode("574708264");
    userMng.addUser(user);
  }
}
