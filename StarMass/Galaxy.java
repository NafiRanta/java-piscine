import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;
public class Galaxy{
    private List<CelestialObject> celestialObjects;

    public Galaxy(){
        this.celestialObjects = new ArrayList<>();
    }

    public List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }

    public void addCelestialObject(CelestialObject celestialObject){
        celestialObjects.add(celestialObject);
    }

    public Map<String, Integer> computeMassRepartition() {
        Map<String, Integer> massRepartition = new HashMap<>();

        // Initialize the map with all possible types and zero mass
        massRepartition.put("Star", 0); // put(key, value)
        massRepartition.put("Planet", 0);
        massRepartition.put("Other", 0);

        for (CelestialObject celestialObject : celestialObjects) {
            String objectType = determineObjectType(celestialObject);
            massRepartition.put(objectType, massRepartition.getOrDefault(objectType, 0) + celestialObject.getMass()); // getOfDefault retrieve value with objectType as key, if key is not found, it returns 0
        }

        return massRepartition;
    }


    private String determineObjectType(CelestialObject celestialObject) {
        if (celestialObject instanceof Star) {
            return "Star";
        } else if (celestialObject instanceof Planet) {
            return "Planet";
        } else {
            return "Other";
        }
    }
}