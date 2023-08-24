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
    @Override // Override the equals method for the Star class
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Star)) {
            return false;
        }

        Star other = (Star) object;

        // Include magnitude comparison along with other properties
        return super.equals(object) && this.magnitude == other.magnitude;
    }

    @Override // Override the hashCode method for the Star class
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(magnitude);
        return result;
    }
    public String toString(){
        String magnitudeFormatted = String.format("%.3f", this.magnitude);
        return this.name + " shines at the " + magnitudeFormatted + " magnitude";
    }
}