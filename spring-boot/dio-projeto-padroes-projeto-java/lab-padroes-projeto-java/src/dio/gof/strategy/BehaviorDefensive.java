package dio.gof.strategy;

public class BehaviorDefensive implements Behavior {
    @Override
    public void move() {
        System.out.println("Movendo-se defensivamente...");
    }
}
