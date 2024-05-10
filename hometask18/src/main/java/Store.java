public class Store {
    private String storeNumber;
    private String city;
    private String address;
    private String telephoneNumber;

    public Store(String storeNumber, String city, String address, String telephoneNumber) {
        this.storeNumber = storeNumber;
        this.city = city;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    public String getStoreNumber() {
        return storeNumber;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeNumber='" + storeNumber + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                '}';
    }
}
