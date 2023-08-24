public class CelestialObject{
    public double x;
    public double y;
    public double z;
    public String name;
    public static final double KM_IN_ONE_AU = 150_000_000.0;

    public CelestialObject(){
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.name = "Soleil";
    }
    public CelestialObject(String name, double x, double y, double z){
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String getName(){
        return this.name;
    }

    public void setName (String name){
        this.name = name;
    }

    public double getX(){
        return this.x;
    }

    public void setX (double num){
        this.x = num;
    }

    public double getY(){
        return this.y;
    }

    public void setY (double num){
        this.y = num;
    }

    public double getZ(){
        return this.z;
    }

    public void setZ (double num){
        this.z = num;
    }

    public static double getDistanceBetween(CelestialObject planet1, CelestialObject planet2) {
        double deltaX = planet1.x - planet2.x;
        double deltaY = planet1.y - planet2.y;
        double deltaZ = planet1.z - planet2.z;

        return Math.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ);
    }

    public static double getDistanceBetweenInKm(CelestialObject planet1, CelestialObject planet2) {
        return getDistanceBetween(planet1, planet2) * KM_IN_ONE_AU;
    }

}