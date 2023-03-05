package ua.lviv.iot.algo.part1.lab1;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Helicopter {
    private int id = 100;
    private String model;
    private int currentAltitude;
    private int maxAltitude;
    private int fuelCapacity;
    private int currentFuel;
  
    private static Helicopter defaultHelicopter = new Helicopter();
  
    public static Helicopter getInstance() {
        return defaultHelicopter;
    }
  
    public void takeOff() {
        this.currentAltitude += 100;
    }
  
    public void ascend(int altitude) {
        this.currentAltitude += altitude;
    }
  
    public void descend(int altitude) {
        if (altitude > this.currentAltitude) {
            this.currentAltitude = 0;
        }
        else {
            this.currentAltitude -= altitude;
        }
    }
  
    public void refuel(int fuel) {
        int fuelToMax = this.fuelCapacity - this.currentFuel;
        if (fuel > fuelToMax) {
            this.currentFuel = this.fuelCapacity;
            System.out.println("The fuel tank is full");
        }
        else {
            this.currentFuel += fuel;
        }
    }

    public static void main(String[] args) {
        Helicopter[] helicopters;
        helicopters = new Helicopter[4];

        //let`s create object by @NoArgsConstructor from lombok.
        helicopters[0] = new Helicopter();
        helicopters[0].setId(101);
        helicopters[0].setModel("Hind");
        helicopters[0].setFuelCapacity(1500);
        helicopters[0].setCurrentFuel(950);
        helicopters[0].setMaxAltitude(4500);
        helicopters[0].setCurrentAltitude(1100);

        //let`s create object by @AllArgsConstructor from lombok.
        helicopters[1] = new Helicopter(102, "Hip",
                                        700, 5000,
                                        1300, 500);

        //let`s create 2 objects by static method getInstance()
        helicopters[2] = getInstance();
        helicopters[2].setId(102);
        helicopters[2].setModel("Hind");
        helicopters[2].setFuelCapacity(1500);
        helicopters[2].setCurrentFuel(730);
        helicopters[2].setMaxAltitude(4500);
        helicopters[2].setCurrentAltitude(2670);

        helicopters[3] = getInstance();

        for (int i = 0; i < helicopters.length; i++) {
            System.out.println(helicopters[i]);
        }
    }
}
