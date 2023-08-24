public class CelestialObject{
    public double x;
    public double y;
    public double z;
    public String name;
    public static final double KM_IN_ONE_AU = 150_000_000.0;
    private int mass;

    public CelestialObject(){
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.name = "Soleil";
        this.mass = 0;
    }
    public CelestialObject(String name, double x, double y, double z, int mass){
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        this.mass = mass;
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

    public int getMass (){
        return this.mass;
    }

    public void setMass(int mass){
        this.mass = mass;
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

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof CelestialObject)) {
            return false;
        }

        CelestialObject other = (CelestialObject) object;

        if (this.x == other.x &&
                this.y == other.y &&
                this.z == other.z &&
                this.name.equals(other.name) &&
                this.mass == other.mass) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        //The use of prime numbers (17 and 31) helps in distributing the hash codes better
        // and reducing collisions, ensuring that different objects have different hash codes
        // with a relatively low chance of overlap.

        int result = 17; // Initialize with a prime number. common practice.
        result = 31 * result + Double.hashCode(x);
        result = 31 * result + Double.hashCode(y);
        result = 31 * result + Double.hashCode(z);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + mass;
        return result;
    }
    public String toString(){
        String xFormatted = String.format("%.3f", this.x);
        String yFormatted = String.format("%.3f", this.y);
        String zFormatted = String.format("%.3f", this.z);

        return this.name + " is positioned at (" + xFormatted + ", " + yFormatted + ", " + zFormatted + ")";
    }




}