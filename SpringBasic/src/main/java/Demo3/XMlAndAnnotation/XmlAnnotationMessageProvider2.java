package Demo3.XMlAndAnnotation;

import Demo3.MessageProvider;
import org.springframework.stereotype.Component;

/**
 * <b>Description</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */

@Component("provider2")
public class XmlAnnotationMessageProvider2 implements MessageProvider {
    @Override
    public String getMessage() {
        return "XmlAnnotation2";
    }
}
