package spaceStation.repositories;

import spaceStation.models.astronauts.Astronaut;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class AstronautRepository implements Repository<Astronaut> {
    private Map<String, Astronaut> astronautMap;

    public AstronautRepository() {
        this.astronautMap = new LinkedHashMap<>();
    }

    @Override
    public Collection<Astronaut> getModels() {
        return Collections.unmodifiableCollection(this.astronautMap.values());
    }

    @Override
    public void add(Astronaut model) {
        astronautMap.put(model.getName(),model);

    }

    @Override
    public boolean remove(Astronaut model) {
        return astronautMap.remove(model.getName()) != null;
    }

    @Override
    public Astronaut findByName(String name) {
        return astronautMap.get(name);
    }
}
