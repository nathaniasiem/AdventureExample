
import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simon7323
 */
public class TextFileExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a balnk file reader
        FileReader file = null;
        //fix loading later
//        try{
//            URL url= ClassLoader.getSystemClassLoader().getResource("input.txt");
//            //create file reader
//            file = new FileReader(url.getPath());

        try {
            file = new FileReader("input.txt");
        } catch (Exception e) {
            //handle any errors
            //print out the lovely red errors
            e.printStackTrace();

            //exit the program
            System.exit(0);
        }
        //Use a scanner with the file
        Scanner in = new Scanner(file);
        //get first number of the addresses
        int numAddresses = in.nextInt();
        
        //move to next line
        in.nextLine();
        
        //create an empty roladex
        Contact[] contacts = new Contact[numAddresses];
        
        //go through the file
        for (int i=0;i<numAddresses;i++){
        String name = in.next();
        String phone = in.next();
        String email = in.nextLine();
        //create contact
        Contact c = new Contact (name);
        c.setEmail(email);
        c.setNumber(phone);
        //add contact to list
        contacts[i]=c;
        
    }
    }
}