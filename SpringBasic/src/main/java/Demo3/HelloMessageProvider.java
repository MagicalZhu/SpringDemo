package Demo3;

/**
 * <b>Description</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */
public class HelloMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello";
    }
}
