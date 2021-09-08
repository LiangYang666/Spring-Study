import com.liang.config.LiangConfig;
import com.liang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1(){
//        new ClassPathXmlApplicationContext()
        ApplicationContext context = new AnnotationConfigApplicationContext(LiangConfig.class);
        User getUser = (User) context.getBean("getUser");
        System.out.println(getUser.hashCode());

//        ApplicationContext context1 = new AnnotationConfigApplicationContext(User.class);
//        User user = (User) context1.getBean("user");
//        System.out.println(user.hashCode());


    }
}
