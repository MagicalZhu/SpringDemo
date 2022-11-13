package Demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * <b>基于注解的方式</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */
@Configuration
public class HelloConfiguration {
    // @lazy 注解表示 Bean 是懒加载的
    @Lazy
    // @Bean 注解中,方法名就是 Bean 的 name, 通过 initMethod 指定初始化方法
    @Bean(initMethod = "initPerson")
    public Person Lilei() {
        Person person = new Person();
        person.setName("Lilei");
        person.setAge(22);
        person.setAddress(SzAddress());
        return person;
    }

    @Bean
    public Address SzAddress() {
        Address address = new Address();
        address.setAddressName("苏州");
        address.setCountryName("江苏");
        return address;
    }

}
