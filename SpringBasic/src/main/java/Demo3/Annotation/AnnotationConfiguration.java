package Demo3.Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <b>Description</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */

@Configuration
@ComponentScan
public class AnnotationConfiguration {
    @Bean
    public AnnotationMessageProvider provider() {
        return new  AnnotationMessageProvider();
    }

    @Bean
    public AnnotationMessageRender messageRender() {
        AnnotationMessageRender render = new AnnotationMessageRender();
        render.setMessageProvider(provider());
        return render;
    }
}
