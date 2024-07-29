package dio.gof.strategy;

public class BehaviorNormal implements Behavior {
    @Override
    public void move() {
        System.out.println("Movendo-se normalmente...");
    }
}
