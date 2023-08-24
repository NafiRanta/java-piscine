public class CelestialObject{
    public double x;
    public double y;
    public double z;
    public String name;

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


}