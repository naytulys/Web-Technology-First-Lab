package starter;

import entity.Ball;
import entity.BallsColors;
import entity.BasketOfBalls;

public class Main {
    public static void main(String[] args) {
        BasketOfBalls basketOfBalls = new BasketOfBalls();
        basketOfBalls.addBallInBasket(new Ball(3.5, BallsColors.BLUE));
        basketOfBalls.addBallInBasket(new Ball(1.1, BallsColors.RED));
        basketOfBalls.addBallInBasket(new Ball(2.2, BallsColors.BLUE));
        basketOfBalls.addBallInBasket(new Ball(9.4, BallsColors.BROWN));
        basketOfBalls.addBallInBasket(new Ball(7.2, BallsColors.WHITE));
        basketOfBalls.addBallInBasket(new Ball(0.5, BallsColors.GREEN));
        basketOfBalls.addBallInBasket(new Ball(5.0, BallsColors.BLUE));
        basketOfBalls.addBallInBasket(new Ball(5.5, BallsColors.BLACK));
        System.out.println(basketOfBalls.basketWeight());
        System.out.println(basketOfBalls.blueBallsInBasketAmount());
    }
}
