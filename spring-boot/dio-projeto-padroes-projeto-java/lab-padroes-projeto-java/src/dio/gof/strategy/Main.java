package dio.gof.strategy;

public class Main {
    public static void main(String[] args) {
        Behavior defensive = new BehaviorDefensive();
        Behavior normal = new BehaviorNormal();
        Behavior agressive = new BehaviorAgressive();

        Robot robot = new Robot();
        robot.setBehavior(normal);
        robot.move();
        robot.move();
        robot.setBehavior(defensive);
        robot.move();
        robot.move();
        robot.setBehavior(agressive);
        robot.move();
        robot.move();
    }
}
