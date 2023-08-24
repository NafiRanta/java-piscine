public class Planet extends CelestialObject{
        private Star centerStar;

        public Planet(){
            super();
            this.centerStar = new Star();
        }

        public Planet(String name, double x, double y, double z, Star centerStar, int mass){
            super(name, x, y, z, mass);
            this.centerStar = centerStar;
        }

        public Star getCenterStar(){
            return this.centerStar;
        }

        public void setCenterStar(Star centerStar){
            this.centerStar = centerStar;
        }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Planet)) {
            return false;
        }

        Planet other = (Planet) object;

        // Include magnitude comparison along with other properties
        return super.equals(object) && this.centerStar == other.centerStar;
    }

    @Override // Override the hashCode method for the Star class
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + centerStar.hashCode();
        return result;
    }

    public String toString(){
        double distance = CelestialObject.getDistanceBetween(this, this.centerStar);
        String distanceFormatted = String.format("%.3f", distance);

        return this.name + " circles around " + this.centerStar.getName() + " at the " + distanceFormatted + " AU";
    }
}