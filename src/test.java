import cn.Ober.entity.Users;
import cn.Ober.service.UsersService;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(value = {"classpath:applicationContext.xml"})
public class test {
   private static Logger logger = Logger.getLogger(test.class);
//    //	private ApplicationContext ac = null;
//    @Resource
//    private SmbmsUserService smbmsUserService = null;
    @Test
   public void text(){
       List<Users> user = new ArrayList<Users>();
        ApplicationContext acx = new ClassPathXmlApplicationContext("applicationContext.xml");
       UsersService usersService = (UsersService) acx.getBean("usersService");
   int count= usersService.Login("513902201020155415","123456");
            logger.info("登录结果》》》》》》》》》》》"+count);
    }
}
