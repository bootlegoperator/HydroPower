/**
* Calculates power output from a hydroelectric generator
*/
public class HydroPower {
    /**
    * Entrypoint of the program
    * @param args arguments for starting the program
    */


    // DENSITY = mass/volume


    public static final float PI = 3.14159265359f;
    public static final float GRAVITY = 9.81f;


    public static double WaterFlow(double tubeDiameter, double waterVelocity)
    {
        return PI*tubeDiameter*tubeDiameter*velocity/4.0;
    }

    public static double PowerOutput(double density, double waterFlow, double fallingHeight)
    {
        return density*waterFlow*fallingHeight*9.81;
    }

    public static void main(String[] args) {

    }
}