import java.net.*;
import java.util.*;
import java.io.*;

public class PageDownloader {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the URL> ");
        String websiteURL = console.nextLine();
        try{
            URL url = new URL(websiteURL);

            Scanner sc = new Scanner(url.openStream());
    
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (MalformedURLException e){
            System.out.print("Invalid URL!");
        } catch (IOException e){
            System.out.print("Invalid");
        }
    }
}
