package Demo5.Simplevalue;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * <b>Description</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */
public class SimpleInjectionTest {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("SimpleValue.xml");
        ctx.refresh();
        InjectionSimple ctxBean = ctx.getBean("injectionSimple", InjectionSimple.class);
        // out: InjectionSimple{name='Huhu', age=22, height=1.92, programmer=true, ageInSeconds=123114011112}
        System.out.println(ctxBean);
    }
}
