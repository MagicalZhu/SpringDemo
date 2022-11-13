import Demo1.HelloConfiguration;
import Demo1.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * <b>一句话描述</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">zyl</a>
 */
public class Hello {
    public static void main(String[] args) {
        // 基于 XML 的方式
       /* ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml");
        Person p = (Person) ctx.getBean("huakucha");
        System.out.println(p);*/

        // 基于注解的方式
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloConfiguration.class);
        // Person p = (Person) ctx.getBean("Lilei");
        //System.out.println(p);
    }
}
