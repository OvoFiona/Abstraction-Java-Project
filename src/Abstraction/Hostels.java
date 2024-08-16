
package Abstraction;

 public abstract class Hostels {
    //attributes
    public int hostelsId;
    public String hostelsName;
    protected String ownerName;
      
    //Parameterized constructor
    public Hostels(int hId, String hName, String oName){
        hostelsId = hId;
        hostelsName = hName;
        ownerName = oName;
       
    }
    
    public String getownerName(){
        return this.ownerName;  
    } 
    
     public void housepeople(){
        System.out.println("This "+ hostelsName + " Hostel with hostel ID " +hostelsId + " belongs to "+ownerName+ " houses Students");
    }
     
     //abstract methods
     public abstract void giveBreakfast(); 
     public abstract void doLaundry(); 
     public abstract void giveWifi(); 
    
}
