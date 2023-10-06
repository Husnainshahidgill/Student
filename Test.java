import java.net.spi.InetAddressResolver;

public class Test {

    public static void main( String args[]){

        Student s1 = new Student("Husnain Shahid Gill","SP23-BCS-054",new Address("Fsd",30000));
        Student s2 = new Student("Haseeb Farooq","SP23-BCS-055", new Address("Grw",43980));
        Student.uniName = "COMSATS University Islamabad";







        s2.display();

    }

}
