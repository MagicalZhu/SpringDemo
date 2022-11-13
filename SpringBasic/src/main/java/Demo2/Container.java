package Demo2;

/**
 * <b>容器接口</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */
public interface Container {
    /**
     * 提供给外部根据依赖名称获取容器中的管理对象
     * @param dependencyName
     * @return Object
     */
    Object getDependency(String dependencyName);
}
