package racingcar.domain;

public class RacingCar {
    public static final int MOVE_DISTANCE = 1;
    public static final int STOP_MAX_VALUE = 3;
    private final String name;
    private Integer position;

    private RacingCar(String name, Integer position) {
        this.name = name;
        this.position = position;
    }
    public static RacingCar getFromName(String name) throws IllegalArgumentException {
        return new RacingCar(name, 0);
    }

    public void move(int i) throws IllegalArgumentException {
        if (i > STOP_MAX_VALUE) {
            position += MOVE_DISTANCE;
        }
    }

    public Integer getPosition() {
        return position;
    }
}
