package transportpackage;
/**
 * Super(Parent) Class for the program
 * 
 * @author( Aakash Acharya)
 * @version( 1.0 )
 * @date of creation( 05/10/2022 )
 */
public class Vehicle{
    
    //declaration of instance variables of super class Vehicle
    private int vehicleId;
    private String vehicleName, vehicleWeight, vehicleColor, vehicleSpeed;
    
    /*
     * Vehicle method is a constructor method that initializes the value of private variables vehicleId, vehicleName, vehicleColor, and vehicleWeight
     * by using "this." keyword.
     */
    public Vehicle(int vehicleId, String vehicleName, String vehicleColor, String vehicleWeight){
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.vehicleColor = vehicleColor;
        this.vehicleWeight = vehicleWeight;
    }
    
    //Accessor methods for private variables
    public int getVehicleId(){
        return vehicleId;
    }
    
    public String getVehicleName(){
        return vehicleName;
    }
    
    public String getVehicleColor(){
        return vehicleColor;
    }
    
    public String getVehicleWeight(){
        return vehicleWeight;
    }
    
    public String getVehicleSpeed(){
        return vehicleSpeed;
    }
    
    //Setter methods for private variables
    public void setVehicleSpeed(String vehicleSpeed){
        this.vehicleSpeed = vehicleSpeed;
    }
    
    public void setVehicleColor(String vehicleColor){
        this.vehicleColor = vehicleColor;
    }
    
    /*
     *Display method is called when the details of the vehicle needs to be shown. If the vehicle weight is not set the ".isBlank()" instance method returns boolean value false allowing the 
     *else block of code to run. Similarly, if the vehicle weight is set the if block of code will run.
     */
    
    public void display(){
        System.out.println("The vehicle identity number is: " + vehicleId);
        System.out.println("The vehicle name is: " + vehicleName);
        if(vehicleWeight.isBlank()){
            System.out.println("The vehicle weight is unknown.");
        }else{
            System.out.println("The vehicle weight is: " + vehicleWeight);
        }
        System.out.println("The vehicle color is: " + vehicleColor);
        System.out.println("The vehicle speed is: " + vehicleSpeed);
    }
}