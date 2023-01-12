package spaceStation.repositories;

import spaceStation.models.planets.Planet;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class PlanetRepository implements Repository<Planet>{
    private Map<String,Planet> planetsMap;

    public PlanetRepository() {
        this.planetsMap = new LinkedHashMap<>();
    }

    @Override
    public Collection<Planet> getModels() {
        return Collections.unmodifiableCollection(this.planetsMap.values());
    }

    @Override
    public void add(Planet model) {
        this.planetsMap.put(model.getName(),model);
    }

    @Override
    public boolean remove(Planet model) {
        return this.planetsMap.remove(model.getName()) != null;
    }

    @Override
    public Planet findByName(String name) {
        return planetsMap.get(name);
    }
}
