package Demo4.FieldInijection;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * <b>Description</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */
public class FieldInjectionTest {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("FieldInjection/injection.xml");
        ctx.refresh();
        Singer singer = ctx.getBean("singer", Singer.class);
        singer.sing();
    }
}
