package entity;

import java.util.ArrayList;
import java.util.List;

public class BasketOfBalls {
    private static final BallsColors BLUE_COLOR = BallsColors.BLUE;
    private final List<Ball> ballsInBasket;

    public BasketOfBalls() {
        this.ballsInBasket = new ArrayList<>();
    }

    public void addBallInBasket(Ball ball) {
        this.ballsInBasket.add(ball);
    }

    public double basketWeight() {
        double basketWeight = 0.0;
        for (Ball currentBall : ballsInBasket) {
            basketWeight = basketWeight + currentBall.getWeight();
        }
        return basketWeight;
    }

    public int blueBallsInBasketAmount() {
        int blueBallsCount = 0;
        for (Ball currentBall : ballsInBasket) {
            blueBallsCount = currentBall.getColor().equals(BLUE_COLOR) ? blueBallsCount + 1 : blueBallsCount;
        }
        return blueBallsCount;
    }
}
