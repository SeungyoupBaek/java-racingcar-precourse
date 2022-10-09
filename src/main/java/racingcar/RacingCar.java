package racingcar;

public class RacingCar {
    private final String name;
    private Integer position;

    private RacingCar(String name, Integer position) {
        this.name = name;
        this.position = position;
    }
    public static RacingCar getFromName(String name) {
        return new RacingCar(name, 0);
    }

    public void move(int i) throws IllegalArgumentException {
        if (i > 3) {
            position += 1;
        }
        if (i < 0 || i > 9) {
            throw new IllegalArgumentException();
        }
    }

    public Integer getPosition() {
        return position;
    }
}
