
package Abstraction;

public class Test  {

    public static void main(String[] args) {
        Apartment ap = new Apartment(402,"Qwetu","Mike","Limuru","Studio");
        Owner ow = new Owner(401,"Kafoka","Fiona","Nduu",21);
        
        ap.doLaundry();
        ow.giveBreakfast();
   }
    
}
