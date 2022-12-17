package Demo4.FieldInijection;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * <b>Description</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */

@Component("singer")
public class Singer {

    /**
     * 即使这里的 Inspiration 是私有的也没有关系,因为 Spring 利用反射的机制将Bean 组件注入进来
     */
    @Resource
    private Inspiration inspiration;

    public void sing () {
        System.out.println("sings:"+inspiration.getMsg());
    }
}
