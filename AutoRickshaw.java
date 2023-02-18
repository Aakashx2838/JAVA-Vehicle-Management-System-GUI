package transportpackage;
/**
 * Sub(Child) Class of the program
 * 
 * @author( Aakash Acharya )
 * @verison( 1.0 )
 * @date of creation ( 05/10/2022 )
 */
public class AutoRickshaw extends Vehicle{
    
    //declaration of instance variables of sub class AutoRickshaw
    private int engineDisplacement, numberOfSeats, fuelTankCapacity, chargeAmount;
    private String torque, groundClearance, bookedDate;
    private boolean isBooked;
    
    public AutoRickshaw(int vehicleId, String vehicleName, String vehicleWeight, String vehicleColor, String vehicleSpeed, int engineDisplacement, String torque, int fuelTankCapacity, String groundClearance){
        //calling super class vehicle
        super(vehicleId, vehicleName, vehicleColor, vehicleWeight);
        super.setVehicleSpeed(vehicleSpeed);
        super.setVehicleColor(vehicleColor);
        
        //assigning values to instance variables
        this.engineDisplacement = engineDisplacement;
        this.torque = torque;
        this.fuelTankCapacity = fuelTankCapacity;
        this.groundClearance = groundClearance;
        isBooked = false;
    }
    
    //Accessor method for private variables
    public int getEngineDisplacement(){
        return engineDisplacement;
    }
    
    public String getTorque(){
        return torque;
    }
    
    public int getNumberOfSeats(){
        return numberOfSeats;
    }
    
    public int getFuelTankCapacity(){
        return fuelTankCapacity;
    }
    
    public String getGroundClearance(){
        return groundClearance;
    }
    
    public int getChargeAmount(){
        return chargeAmount;
    }
    
    public String getBookedDate(){
        return bookedDate;
    }
    
    public boolean getIsBooked(){
        return isBooked;
    }
    
    //Setter method for private variables
    public void setChargeAmount(int chargeAmount){
        this.chargeAmount = chargeAmount;
    }
    
    public void setNumberOfSeats(int numberOfSeats){
        this.numberOfSeats = numberOfSeats;
    }
    
    /*
     * bookRickshaw method is used while making a booking for a rickshaw
     * the method checks if the vehicle is already booked or not if yes the program terminates
     * without letting the user input the booking date and returns already booked message.
     * If the vehicle isn't yet booked the bookedDate is initialized. Also, setter method is called to
     * set charge amount and number of seats. The status of isBooked is set to true and a
     * print message is displayed that the vehicle is booked
     */
    
    public void bookRickshaw(String bookedDate, int chargeAmount, int numberOfSeats){
        if(isBooked){
            System.out.println("The auto rickshaw with vehicle id " + getVehicleId() + "is already booked.");
        }else{
            this.bookedDate = bookedDate;
            setChargeAmount(chargeAmount);
            setNumberOfSeats(numberOfSeats);
            isBooked = true;
            System.out.println("Vehicle with the vehicle identity number " + getVehicleId() + " is now booked.");
        }
    }
    
    /*
     * display method of AutoRickshaw class calls the display method of parent class Vehicle
     * and compares if the charge amount and number of seats are valid and return specific message
     * for specific case. Finally more information upon the auto rickshaw is displayed if the value of
     * isBooked is set to true.
     */
    
    public void display(){
        super.display();
        if(chargeAmount <= 0){
                System.out.println("The charge amount of the auto rickshaw is unknown.");
        }else{
                System.out.println("The charge amount of the auto rickshaw is: " + chargeAmount);
        }
            
        if(numberOfSeats <= 0){
            System.out.println("The number of seats of the auto rickshaw is unknown.");
        }else{
            System.out.println("The number of seats of the auto rickshaw is: " + numberOfSeats);
        }
        
        if(isBooked){
            System.out.println("The engine displacement of auto rickshaw is: " + engineDisplacement);
            System.out.println("The torque of auto rickshaw is: " + torque);
            System.out.println("The fuel tank capacity of auto rickshaw is: " + fuelTankCapacity);
            System.out.println("The ground clearance of auto rickshaw is: " + groundClearance);
            System.out.println("The auto rickshaw is booked for: " + bookedDate);
        }
    }
}