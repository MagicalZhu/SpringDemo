package Demo4.ConstructorInjection.XmlInjection;

import Demo3.MessageProvider;

/**
 * <b>Description</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */
public class XmlMessageProvider implements MessageProvider {
    private String message;

    public XmlMessageProvider (String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
