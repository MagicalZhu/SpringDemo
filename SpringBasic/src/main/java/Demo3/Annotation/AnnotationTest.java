package Demo3.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <b>Description</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */
public class AnnotationTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationConfiguration.class);
        AnnotationMessageRender messageRender = ctx.getBean("messageRender", AnnotationMessageRender.class);
        messageRender.render();
    }
}
