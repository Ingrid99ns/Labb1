import java.awt.*;

/**
 * This class specified the vehicle Saab95.
 *
 *   @author André Kejovaara
 *   @author Ingrid Nistal Sköldberg
 *   @author Shada Al-Wakkal
 *
 *   @version 1.0
 */
public class Saab95 extends Vehicle implements ITurbo {



    /**
     * Sets value for the vehicle Volvo240.
     */
    public Saab95(){
        super(2, 125, Color.red, "Saab95",0, 0);
        parent.hasTurbo = false;
        stopEngine();
    }

    /**
     * Increases the speed of the Saab95.
     * @param amount Amount to increase.
     */
    public void incrementSpeed(double amount){
        if((getCurrentSpeed() + speedFactor() * amount) >= enginePower){
            currentSpeed = enginePower;
        }else{
            currentSpeed = getCurrentSpeed() + speedFactor() * amount;
        }
    }

    /**
     * Decreases the speed of the Saab95.
     * @param amount Amount to increase.
     */
    public void decrementSpeed(double amount){
        if(currentSpeed*amount <= 0){
            currentSpeed = 0;
        }else {
            currentSpeed = getCurrentSpeed() - speedFactor() * amount;
        }
    }

    Turbo parent = new Turbo();
    public double speedFactor(){
        double turbo = 1;
        if(parent.hasTurbo) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

    @Override
    public void setTurboOn() {
    parent.setTurboOn();
    }

    @Override
    public void setTurboOff() {
    parent.setTurboOff();
    }


}
