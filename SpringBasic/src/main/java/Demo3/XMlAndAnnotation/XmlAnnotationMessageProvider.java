package Demo3.XMlAndAnnotation;

import Demo3.MessageProvider;
import org.springframework.stereotype.Component;

/**
 * <b>Description</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */

@Component("provider")
public class XmlAnnotationMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "XmlAnnotation";
    }
}
