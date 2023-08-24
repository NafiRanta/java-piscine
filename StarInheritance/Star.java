public class Star extends CelestialObject{
    private double magnitude;

    public Star(){
        super();
        this.magnitude = 0.0;
    }

    public Star(String name, double x, double y, double z, double magnitude) {
        super(name, x, y, z); // Call the parameterized constructor of the parent class (CelestialObject)
        this.magnitude = magnitude; // Initialize magnitude
    }

    public double getMagnitude(){
        return this.magnitude;
    }

    public void setMagnitude(double magnitude){
        this.magnitude = magnitude;
    }
}