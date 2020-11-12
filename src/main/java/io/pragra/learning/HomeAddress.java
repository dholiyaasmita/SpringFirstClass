package io.pragra.learning;

public class HomeAddress implements iAddress{
    private String streetName;
    private int streetAddress;
    private String city;
    private String country;

    public HomeAddress(String streetName, int streetAddress, String city, String country) {
        this.streetName = streetName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.country = country;
    }

    @Override
    public String getAddress() {
       return toString();
    }

    @Override
    public String toString() {
        return "HomeAddress{" +
                "streetName='" + streetName + '\'' +
                ", streetAddress=" + streetAddress +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public void abcMethod(){
        System.out.println("My Address is ready to use");
    }
}
