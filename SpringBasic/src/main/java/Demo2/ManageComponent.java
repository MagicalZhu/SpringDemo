package Demo2;

/**
 * <b>管理组件的接口,直接作用于容器</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */
public interface ManageComponent {
    /**
     * 从容器中查询组件,而不是注册表中查询
     * @param container
     */
    void allowQuery(Container container);
}
