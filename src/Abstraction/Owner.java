
package Abstraction;

 public class Owner extends Hostels {
     public String ownerSurname;
     public int ownerAge;
     
   
    public Owner(int hId, String hName, String oName, String newosurName, int newoAge) {
        super(hId, hName, oName);
        
        ownerSurname = newosurName;
        ownerAge = newoAge;
        
    }

    @Override 
    public void giveBreakfast(){
        System.out.println("This Owner " +ownerSurname+" receives breakfast for the Apartment");
     }
    @Override 
    public void doLaundry(){
        System.out.println("This Owner " +ownerSurname+" pays for the laundry to be done from the Apartment");
     }
    @Override
    public void giveWifi(){
        System.out.println("This Owner " +ownerSurname+"gets Wifi from the Apartment");
    }
    
}
