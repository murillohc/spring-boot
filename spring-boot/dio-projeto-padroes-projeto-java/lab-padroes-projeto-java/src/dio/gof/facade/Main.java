package dio.gof.facade;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrateCient("Fulano", "88000-000");
    }
}
