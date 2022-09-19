package Pack;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(10, 23);
        System.out.println(ball.toString());
        ball.setXY(2, 11);
        System.out.println(ball.toString());
        ball.move(12, 3);
        System.out.println(ball.toString());
    }
}
