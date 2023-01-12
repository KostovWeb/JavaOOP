package spaceStation.models.astronauts;

public class Biologist extends BaseAstronaut{
    private static final double PERSONAL_OXYGEN_BIOLOGIST = 70;


    public Biologist(String name) {
        super(name, PERSONAL_OXYGEN_BIOLOGIST);
    }
    @Override
    public void breath() {
        this.setOxygen(Math.max(0, this.getOxygen() - 5));
    }
}
