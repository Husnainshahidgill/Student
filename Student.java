public class Student {
    public String stdName ;
    public String regNumber;
    public static String uniName;
    public Address address;


    public Student(String stdName, String regNumber){
        this.stdName = stdName;
        this.regNumber = regNumber;
    }
    public Student(String stdName, String regNumber, Address address){
        this.stdName = stdName;
        this.regNumber = regNumber;
        this.address = address;
    }
    public void display(){
        System.out.println("Student Name: " + stdName);
        System.out.println("Registeration Number: " + regNumber);
        System.out.println("University: " + uniName);
        address.displayPrint();
    }

}