package entity;

public class Ball {
    private final double weight;
    private final BallsColors color;

    public Ball(double weight, BallsColors color) {
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public BallsColors getColor() {
        return color;
    }
}
