package Demo4.ConstructorInjection.Eg1;

import Demo3.MessageProvider;

/**
 * <b>Description</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */
public class ConfigurableMessageProvider implements MessageProvider {
    private String message;
    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
