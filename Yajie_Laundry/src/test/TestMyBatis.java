package test;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.cn.yajie.pojo.User;
import com.cn.yajie.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类 
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestMyBatis {

	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	
	@Resource
	private IUserService userService;

	@Test
	public void test1() {
//		User user = userService.getUserById("111");
		String aa[] = {"李","王","朱","放","孔","屈"};
		String bb[] = {"字","时","代","发","红","强"};
		for(int i = 0 ; i<51 ; i++){
			User user = new User();
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
			user.setUid(sdf.format(date)+i);
			user.setUsername(aa[i%6]+bb[(i+1)%6]);
			user.setCompanyName(aa[i%6]+bb[(i+1)%6]+"有限公司");
			user.setUcompanyAddr("云南省普洱市镇原县"+aa[i%6]+bb[(i+1)%6]+"路"+i+i+"号");
			user.setAddDate(sdf1.format(date));
			user.setUmobile("13"+i%9+"485147"+i%8);
			userService.insertUser(user);
			logger.info(JSON.toJSONString(user));
		}
//		 System.out.println(user.getUserName());
//		 logger.info("值："+user.getUserName());
	}
}
