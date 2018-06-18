import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class HostToIP {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String address = null;
        while (address != "exit") {
            System.out.println("Please enter your host address:");
            address = scan.next();
            try {
                getIPAddress(address);
            } catch (UnknownHostException e) {
                System.out.println("You have entered an unknown host address");
            }
        }
    }

    public static void getIPAddress(String name) throws UnknownHostException {
        InetAddress host = InetAddress.getByName(name);
        System.out.println(host.getHostAddress());
    }
}
