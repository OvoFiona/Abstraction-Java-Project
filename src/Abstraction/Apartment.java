
package Abstraction;

public class Apartment extends Hostels{
    public String apartmentType;
    public String apartmentLoc;
    
    public Apartment(int newhId,String newhName, String newoName,String newaLoc, String newaType){
        super(newhId, newhName, newoName);
        
        apartmentType = newaType;
        apartmentLoc = newaLoc;
    } 
    @Override
    public void giveBreakfast(){
       System.out.println("This Apartment provides breakfast for the owners");
    }
    @Override
    public void doLaundry(){
        System.out.println("This Apartment does Laundry for the owners");
    }
    @Override
    public void giveWifi(){
        System.out.println("This Apartment offers Wifi to the owners");
    }
    
}

