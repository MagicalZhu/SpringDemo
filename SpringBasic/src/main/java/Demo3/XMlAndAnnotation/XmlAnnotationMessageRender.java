package Demo3.XMlAndAnnotation;

import Demo3.MessageProvider;
import Demo3.MessageRender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <b>Description</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */

@Service("messageRender")
public class XmlAnnotationMessageRender implements MessageRender {
    private MessageProvider messageProvider;
    @Override
    public void render() {
        System.out.println(messageProvider.getMessage());
    }

    @Override
    @Resource(name = "provider")
    public void setMessageProvider(MessageProvider providerOther) {
        this.messageProvider = providerOther;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
