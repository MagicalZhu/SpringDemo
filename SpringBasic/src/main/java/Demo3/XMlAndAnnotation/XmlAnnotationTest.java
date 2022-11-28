package Demo3.XMlAndAnnotation;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Arrays;

/**
 * <b>Description</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */
public class XmlAnnotationTest {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("XmlAnnotation.xml");
        ctx.refresh();
        XmlAnnotationMessageRender render = ctx.getBean("messageRender", XmlAnnotationMessageRender.class);
        render.render();
    }
}
