package Demo4.ConstructorInjection.XmlInjection2;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * <b>Description</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */
public class InjectionTest2 {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("Constructor/XmlAndAnnotation.xml");
        ctx.refresh();
        SameParam bean = ctx.getBean("sameParam", SameParam.class);
        System.out.println(bean);
    }
}
