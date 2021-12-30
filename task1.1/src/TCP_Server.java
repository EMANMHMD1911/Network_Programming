import java.io.*;
import java.net.*;
import java.util.*;
public class TCP_Server {
    public static void main(String[] args) {
        try {
           String username ="",pass="";
            ServerSocket ss = new ServerSocket(1234);
            Socket s =ss.accept();
            DataInputStream in =new DataInputStream(s.getInputStream());
            DataOutputStream out =new DataOutputStream(s.getOutputStream());
            Scanner userin =new Scanner(System.in);
            while (!username.equals("EMAN")&& !pass.equals("123")){
                username=in.readUTF();
                pass=in.readUTF();
                if(username.equals("EMAN")&& pass.equals("123")){
                    out.writeUTF("Server said : Username and Password are Correct ...");
                }
                else {
                    out.writeUTF("Server said : Enter Username and Password Again ...");
                }
            }
            s.close();ss.close();

        }catch (Exception e){
          import java.io.*;
import java.net.*;
import java.util.*;
public class TCP_Server {
    public static void main(String[] args) {
        try {
           String username ="",pass="";
            ServerSocket ss = new ServerSocket(1234);
            Socket s =ss.accept();
            DataInputStream in =new DataInputStream(s.getInputStream());
            DataOutputStream out =new DataOutputStream(s.getOutputStream());
            Scanner userin =new Scanner(System.in);
            while (!username.equals("EMAN")&& !pass.equals("123")){
                username=in.readUTF();
                pass=in.readUTF();
                if(username.equals("EMAN")&& pass.equals("123")){
                    out.writeUTF("Server said : Username and Password are Correct ...");
                }
                else {
                    out.writeUTF("Server said : Enter Username and Password Again ...");
                }
            }
            s.close();ss.close();

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
