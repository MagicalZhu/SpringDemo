package Demo4.FieldInijection;

import org.springframework.stereotype.Service;

/**
 * <b>Description</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */

@Service("inspiration")
public class Inspiration {
    private String msg = "field Injection [Inspiration]";

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
