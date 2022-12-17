package Demo4.ConstructorInjection.XmlInjection2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <b>Description</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */

@Service("sameParam")
public class SameParam {
    public String name;
    public String addressName;
    public Integer age;

    @Autowired
    public SameParam(String name) {
        this.name = name;
    }
    public SameParam(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SameParam{" +
                "name='" + name + '\'' +
                ", addressName='" + addressName + '\'' +
                ", age=" + age +
                '}';
    }
}
