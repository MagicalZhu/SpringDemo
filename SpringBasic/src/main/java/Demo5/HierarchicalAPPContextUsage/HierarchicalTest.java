package Demo5.HierarchicalAPPContextUsage;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * <b>Description</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */
public class HierarchicalTest {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctxParent = new GenericXmlApplicationContext();
        ctxParent.load("Hierarchical/ParentCtx.xml");
        ctxParent.refresh();

        GenericXmlApplicationContext ctxSub = new GenericXmlApplicationContext();
        ctxSub.load("Hierarchical/SubCtx.xml");

        // 设置父上下文
        ctxSub.setParent(ctxParent);

        ctxSub.refresh();

        String parent = ctxSub.getBean("parent", String.class);
        String children = ctxSub.getBean("children", String.class);
        Sub hierarchicalSub = ctxSub.getBean("hierarchicalSub", Sub.class);

        // out:parent
        System.out.println(parent);

        // out:children
        System.out.println(children);

        // out:children
        System.out.println(hierarchicalSub.getName());
    }
}
