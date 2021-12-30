import java.util.*;
import java.io.*;
import java.net.*;
public class TCP_Client {
    public static void main(String[] args) {import java.util.*;
import java.io.*;
import java.net.*;
public class TCP_Client {
    public static void main(String[] args) {
        try {
        Socket s =new Socket("localhost",1234);
        DataOutputStream out =new DataOutputStream(s.getOutputStream());
        DataInputStream in =new DataInputStream(s.getInputStream());
        Scanner userin =new Scanner(System.in);
        String username ="",pass="",str="";
        while (!str.equals("Server said : Username and Password are Correct ...")){
            System.out.println("Enter The User Name : ");
            username =userin.nextLine();
            out.writeUTF(username);
            out.flush();
            System.out.println("Enter The Password : ");
            pass =userin.nextLine();
            out.writeUTF(pass);
            out.flush();
            str =in.readUTF();
            System.out.println(str);
        }
        s.close();
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
