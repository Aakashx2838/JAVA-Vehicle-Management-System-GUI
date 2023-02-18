package transportpackage;
/**
 * Sub(Child) Class of the program
 * 
 * @author( Aakash Acharya )
 * @verison( 1.0 )
 * @date of creation ( 05/10/2022 )
 */

public class ElectricScooter extends Vehicle{
    
    //declaration of instance variables of sub class ElectricScooter
    private int range, batteryCapacity, price;
    private String chargingTime, brandName, mileage;
    private boolean hasPurchased, hasSold;
    
    /*
        constructor for child class Electric scooter that initializes values from same class as well as call values from parent class Vehicle
        also this constructor calls setter method for VehicleSpeed with vehicleSpeed as a parameter and sets other values for other variables
    */
    public ElectricScooter(int vehicleId, String vehicleName, String vehicleWeight, String vehicleSpeed, String vehicleColor, int batteryCapacity){
        //calling super constructor
        super(vehicleId, vehicleName, vehicleColor, vehicleWeight);
        
        //calling setter methods from super class Vehicle
        super.setVehicleSpeed(vehicleSpeed);
        super.setVehicleColor(vehicleColor);
        
        //assigning values to instance variable
        this.batteryCapacity = batteryCapacity;
        
        range = price = 0;  //alternative for range = 0; price = 0;
        brandName = mileage = chargingTime = "";
        hasPurchased = hasSold = false;
    }
    
    //Accessor method for private variables
    public int getRange(){
        return range;
    }
    
    public int getBatteryCapacity(){
        return batteryCapacity;
    }
    
    public int getPrice(){
        return price;
    }
    
    public String getChargingTime(){
        return chargingTime;
    }
    
    public String getBrandName(){
        return brandName;
    }
    
    public String getMileage(){
        return mileage;
    }
    
    public boolean getHasPurchased(){
        return hasPurchased;
    }
    
    public boolean getHasSold(){
        return hasSold;
    }
    
    /*
        setBrandName() is a setter method that sets a value for variable brandName
        if the truth value of boolean variable hasPurchased is false.
    */
    public void setBrandName(String brandName){
        if(hasPurchased){
            System.out.println("Sorry, the electric scooter is already purchased and cannot change the brand.");
        }else{
            this.brandName = brandName;
        }
    }
    
    /*
        purchaseScooter() is a method that takes 4 variables .i.e., String brandName, int price, String chargingTime, int mileage, int range 
        and sets the value of brandName by using setter method setbrandName() and reverses the value of hasPurchased
    */
    public void purchaseScooter(String brandName, int price, String chargingTime, String mileage, int range){
        if(!hasPurchased){
            setBrandName(brandName);
            this.price = price;
            this.chargingTime = chargingTime;
            this.mileage = mileage;
            this.range = range;
            hasPurchased = true;
        }
    }
    
    /*
     * sellScooter method is called when a scooter needs to be sold. The method first checks if the 
     * value of hasSold. If the value of hasSold is true the method will not allow to set the price.
     * Whereas if the value of hasSold is false the method will allow the user to initialize the
     * price of the scooter and revoke the value of other variables such as range, mileage, etc.
     * Also the value of hasSold will be set to true and the value of hasPurchased is set to false
     */
    public void sellScooter(int price){
        if(hasSold){
            System.out.println("Sorry, the electric scooter is already sold.");
        }else{
            this.price = price;
            range = 0;      
            chargingTime = "";                                          
            mileage = "";                                                         
            batteryCapacity = 0;                                                            
            hasSold = true;
            hasPurchased = false;
        }
    }
    
    /*
     * display method of ElectricScooter class firstly calls the display method from super class
     * vehicle and secondly compares the value of hasPurchase and if the value of hasPuchase is 
     * true the method will display additional information of the electric scooter
     */
    public void display(){
        super.display();    //Calls display() method from parent class Vehicle
        if(hasPurchased){   //Executes this block only if the truth value for hasPurchased is true
            System.out.println("Brand of the electric scooter is: " + brandName);
            System.out.println("Battery capacity of the electric scooter is: " + batteryCapacity);
            System.out.println("Mileage of the electric scooter is: " + mileage);
            System.out.println("Range of the electric scooter is: " + range);
            System.out.println("Recharge time of the electric scooter is: " + chargingTime );
        }
    }
}