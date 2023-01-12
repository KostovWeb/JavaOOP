package spaceStation.models.mission;

import spaceStation.models.astronauts.Astronaut;
import spaceStation.models.planets.Planet;

import java.util.Collection;

public class MissionImpl implements Mission{



    @Override
    public void explore(Planet planet, Collection<Astronaut> astronauts) {
        Collection<String> planetItam = planet.getItems();
        for (Astronaut astronautss : astronauts){
            while (astronautss.canBreath() && planetItam.iterator().hasNext()){
                astronautss.breath();
                String currentItam = planetItam.iterator().next();
                astronautss.getBag().getItems().add(currentItam);
                planetItam.remove(currentItam);
            }

        }


    }
}
