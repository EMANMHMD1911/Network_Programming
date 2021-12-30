import java.io.*;
import java.net.*;
import java.net.URLConnection;
import java.util.Scanner;

public class urlconnection {import java.io.*;
import java.net.*;
import java.net.URLConnection;
import java.util.Scanner;

public class urlconnection {
    public static void main(String[] args) {

        try {
            String url;
            System.out.println(":enter url");
            Scanner in =new Scanner(System.in);
            url =in.nextLine();
            URL myurl =new URL(url);
            URLConnection URLCON =myurl.openConnection();
            InputStreamReader isr=new InputStreamReader(URLCON.getInputStream());
            BufferedReader br =new BufferedReader(isr);
            BufferedWriter bw =new BufferedWriter(new FileWriter("C:\\Users\\Azza\\OneDrive\\Desktop\\test.txt"));
            String line ;
            while ((line =br.readLine())!=null){
                bw.write(line);
            }
        }catch (Exception e){
            System.out.println(e);
        }




    }
}
