/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class Contact {
    private String name;
    private String phoneNumber;
    private String email;
    
    //constructor using the name
    public Contact (String name){
        this.name = name;
    }
    
    public void setNumber (String number){
        this.phoneNumber = number;
    }
    
    public void setEmail (String email){
        this.email=email;
    }
    public String getName(){
        return name;
    }
    public String getPhone(){
        return phoneNumber;
    }
    public String getEmail(){
        return email;
    }
    @Override
    //pretty way to print out the contact information
    public String toString(){
        String format= this.name +"\n";
        format += "Phone: " + this.phoneNumber +"\n";
        format += "Email: " + this.email +"\n";
        return format;
    }
}
