
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
public class TextFileExample{
    //contact list
    //is an instance variable so that it is available throughout the program
    private Contact[] contacts;
    private int position = 0;

    //constructor
    public TextFileExample(){
        //create a balnk file reader
        FileReader file = null;
        try{
            URL url= TextFileExample.class.getResource("input.txt");
        System.out.println(url); 
        file= new FileReader(url.getFile());
         }catch (Exception e){
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
        contacts = new Contact[numAddresses];

        //go through the file
        for (int i = 0; i < numAddresses; i++) {
            String name = in.next();
            String phone = in.next();
            String email = in.nextLine();
            //create contact
            Contact c = new Contact(name);
            c.setEmail(email);
            c.setNumber(phone);
            //add contact to list
            contacts[i] = c;
        }//print out rolodex
    }
        public String getName(){
            return contacts[position].getName();
        }
        public String getPhone(){
            return contacts[position].getPhone();
        }
        public String getEmail(){
            return contacts[position].getEmail();
        }
        public int getPosition(){
            return position;
        }
        public int numContacts(){
            return contacts.length;
        }
        public void next (){
            //if there is another contact
            if(position<contacts.length-1){
                position++;
            }
        }
        public void prev(){
            //if still contacts left
            if(position>0){
                position--;
            }
        }
                
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a balnk file reader
        FileReader file = null;
        try{
            URL url= TextFileExample.class.getResource("input.txt");
        System.out.println(url); 
        file= new FileReader(url.getFile());
         }catch (Exception e){
             //handle any errors
            //print out the lovely red errors
            e.printStackTrace();
            
//create file reader
//        try {
//            file = new FileReader("input.txt");
//        } catch (Exception e) {
            

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
        for (int i = 0; i < numAddresses; i++) {
            String name = in.next();
            String phone = in.next();
            String email = in.nextLine();
            //create contact
            Contact c = new Contact(name);
            c.setEmail(email);
            c.setNumber(phone);
            //add contact to list
            contacts[i] = c;
        }//print out rolodex
        for (int i = 0; i < contacts.length; i++) {
            System.out.println(contacts[i]);
        }
    }
}