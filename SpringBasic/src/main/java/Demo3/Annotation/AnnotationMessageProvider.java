package Demo3.Annotation;

import Demo3.MessageProvider;

/**
 * <b>Description</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */
public class AnnotationMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "annotation";
    }
}
