package Demo4.ConstructorInjection.XmlAndAnnotation;

import Demo3.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * <b>Description</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */

@Service("configurationXmlAnnotationMessageProvider")
public class ConfigurationXmlAnnotationMessageProvider implements MessageProvider{
    private String message;
    @Autowired
    public ConfigurationXmlAnnotationMessageProvider(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
