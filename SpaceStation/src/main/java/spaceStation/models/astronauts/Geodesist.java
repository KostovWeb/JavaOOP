package spaceStation.models.astronauts;

public class Geodesist  extends BaseAstronaut{
    private static final double PERSONAL_OXYGEN_GEODESIST = 50;

    public Geodesist(String name) {
        super(name, PERSONAL_OXYGEN_GEODESIST);
    }
}
