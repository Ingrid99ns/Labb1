import java.awt.*;

/**
 * This class specified for the vehicle Scania640.
 *
 *   @author André Kejovaara
 *   @author Ingrid Nistal Sköldberg
 *   @author Shada Al-Wakkal
 *
 *   @version 1.0
 */


public class Scania640 extends Vehicle implements IPlatform {

    /**
     * Sets value for the vehicle Scania640.
     */

   Platform parent = new Platform();

   public Scania640() {

        super(2, 100, Color.cyan, "Scania640", 0, 0);
        stopEngine();
        parent.anglePlatform = 0;
    }

    /**
     * Increases the speed of the Scania640.
     *
     * @param amount Amount to increase.
     */


    public void incrementSpeed(double amount) {
        if (currentSpeed >= enginePower) {
            currentSpeed = enginePower;
        } else {
            currentSpeed = 1;
        }
    }

    /**
     * Decreases the speed of the Scania640.
     *
     * @param amount Amount to decrease.
     */

    public void decrementSpeed(double amount) {
        if (currentSpeed >= enginePower) {
            currentSpeed = enginePower;
        } else {
            currentSpeed = 0;
        }
    }


    @Override
    public double getAnglePlatform() {
        return parent.getAnglePlatform();
    }

    @Override
    public double platformAngleInterval(double d) {
        return parent.platformAngleInterval(d);
    }

    @Override
    public void startTruck(double anglePlatform) {
        parent.startTruck(anglePlatform);
    }

    @Override
    public boolean checkPlatformAngle(double anglePlatform) {
       return parent.checkPlatformAngle(anglePlatform);
    }
}





