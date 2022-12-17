package Demo5.SpEl;

import Demo5.SimpleValue2.InjectionSimple2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * <b>Description</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */

@Component("spELInjection")
public class SpELInjection {
    @Value("#{injectionConfigComponent.name + 'EvaluationAfter '}")
    private String name;

    @Value("#{injectionConfigComponent.age + 100}")
    private int age;

    @Value("#{injectionConfigComponent.height * 2}")
    private float height;

    @Value("#{injectionConfigComponent.programmer}")
    private boolean programmer;

    @Value("#{injectionConfigComponent.ageInSeconds}")
    private Long ageInSeconds;

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("SpELInjection.xml");
        ctx.refresh();
        SpELInjection ctxBean = ctx.getBean("spELInjection", SpELInjection.class);
        // out: InjectionSimple2{name='Huhu2', age=39, height=1.92, programmer=false, ageInSeconds=1241401113}
        System.out.println(ctxBean);
    }

    @Override
    public String toString() {
        return "SpELInjection{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", programmer=" + programmer +
                ", ageInSeconds=" + ageInSeconds +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isProgrammer() {
        return programmer;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public Long getAgeInSeconds() {
        return ageInSeconds;
    }

    public void setAgeInSeconds(Long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }
}
