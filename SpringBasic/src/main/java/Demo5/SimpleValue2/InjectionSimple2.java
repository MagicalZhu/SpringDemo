package Demo5.SimpleValue2;

import Demo5.Simplevalue.InjectionSimple;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * <b>Description</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */

@Component("injectionSimple2")
public class InjectionSimple2 {
    @Value("Huhu2")
    private String name;
    @Value("39")
    private int age;
    @Value("1.92")
    private float height;
    @Value("false")
    private boolean programmer;
    @Value("1241401113")
    private Long ageInSeconds;

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("SimpleValue2.xml");
        ctx.refresh();
        InjectionSimple2 ctxBean = ctx.getBean("injectionSimple2", InjectionSimple2.class);
        // out: InjectionSimple2{name='Huhu2', age=39, height=1.92, programmer=false, ageInSeconds=1241401113}
        System.out.println(ctxBean);
    }

    @Override
    public String toString() {
        return "InjectionSimple2{" +
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
