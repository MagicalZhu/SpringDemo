package Demo4.ConstructorInjection.XmlInjection;

import Demo3.StandMessageRender;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * <b>Description</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */
public class InjectTest {
    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("constructorXml.xml");
        XmlMessageProvider messageProvider= (XmlMessageProvider) beanFactory.getBean("xmlMessageProvider");
        System.out.println(messageProvider.getMessage());

        XmlMessageProvider messageProvider2= (XmlMessageProvider) beanFactory.getBean("xmlMessageProvider2");
        System.out.println(messageProvider2.getMessage());
    }
}
