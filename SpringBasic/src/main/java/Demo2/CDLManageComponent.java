package Demo2;

/**
 * <b>Description</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */
public class CDLManageComponent implements ManageComponent {
    private Dependency dependency;
    @Override
    public void allowQuery(Container container) {
        this.dependency = (Dependency)container.getDependency("dependenceyName");
    }
}
