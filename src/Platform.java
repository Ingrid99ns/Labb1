

public class Platform {

    protected double anglePlatform;

    public double getAnglePlatform(){ return anglePlatform; }

    /**
     * Sets the given angle of the platform to always lie in the interval [0,70].
     * @param anglePlatform that the platform has.
     */

    public double platformAngleInterval(double anglePlatform){
        if(anglePlatform <= 0){
            anglePlatform = 0;
        }else if(anglePlatform >= 70){
            anglePlatform = 70;
        }
    return  anglePlatform;}

    /**
     * Controls whether the platform is raised or not.
     * @param anglePlatform of the platform.
     * @return true or false depending on the platforms position.
     */

    public boolean checkPlatformAngle(double anglePlatform){
        if(anglePlatform == 0){
            return true;
        }
        return false;
    }


    public void startTruck(double anglePlatform){
     if (getAnglePlatform() == 0){

     }

    }



    /*public void startTruck(double anglePlatform){
        if(checkPlatformAngle(anglePlatform)) {
            startEngine();
        }else{
            stopEngine();
        }
    }*/


}



