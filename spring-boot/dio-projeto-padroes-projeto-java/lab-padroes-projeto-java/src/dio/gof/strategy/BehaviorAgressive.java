package dio.gof.strategy;

public class BehaviorAgressive implements Behavior {
    @Override
    public void move() {
        System.out.println("Movendo-se agressivamente...");
    }
}
