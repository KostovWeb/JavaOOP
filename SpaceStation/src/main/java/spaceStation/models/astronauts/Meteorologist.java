package spaceStation.models.astronauts;

public class Meteorologist extends BaseAstronaut{
    private static final double PERSONAL_OXYGEN_METEROLOGIST = 90;

    public Meteorologist(String name) {
        super(name, PERSONAL_OXYGEN_METEROLOGIST);
    }
}
