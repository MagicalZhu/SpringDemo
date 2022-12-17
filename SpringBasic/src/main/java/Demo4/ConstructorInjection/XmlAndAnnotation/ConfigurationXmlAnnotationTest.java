package Demo4.ConstructorInjection.XmlAndAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * <b>Description</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */
public class ConfigurationXmlAnnotationTest {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("Constructor/XmlAndAnnotation.xml");
        ctx.refresh();
        ConfigurationXmlAnnotationMessageProvider provider =
                ctx.getBean("configurationXmlAnnotationMessageProvider", ConfigurationXmlAnnotationMessageProvider.class);
        System.out.println(provider.getMessage());  // out: annotation inject message
    }
}
