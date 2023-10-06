public class Address {
    public String city;
    public static String country = "Pakistan";
    public int postalCode;

    public Address(String city, int postalCode) {
        this.city = city;
        this.postalCode = postalCode;
    }

    public void displayPrint(){
        System.out.println("City: " + city);
        System.out.println("Postal Code: " + postalCode);
        System.out.println("Country: " + country);
    }

}
