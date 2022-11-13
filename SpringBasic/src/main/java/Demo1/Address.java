package Demo1;

/**
 * <b>Description</b>
 *
 * @author <a href="mailto:zhuyuliangm@gmail.com">yuliang zhu</a>
 */
public class Address {
    public String addressName;
    public String countryName;

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        System.out.println("setAddressName");
        this.addressName = addressName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        System.out.println("setCountryName");
        this.countryName = countryName;
    }

    public Address() {
        System.out.println("create Address instance...");
    }
    public Address(String addressName, String countryName) {
        this.addressName = addressName;
        this.countryName = countryName;
        System.out.println("create Address instance 2...");
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressName='" + addressName + '\'' +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}
