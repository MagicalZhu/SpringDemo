package Demo1;

/**
 * <b>一句话描述</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">zyl</a>
 */
public class Person {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setName");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setAge");
        this.age = age;
    }


    public void setAddress(Address address) {
        System.out.println("setAddress");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public String name;

    public int age;
    public Address address;

    public Person() {
        System.out.println("create person instance...");
    }

    public void initPerson(){
        System.out.println("do init");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
