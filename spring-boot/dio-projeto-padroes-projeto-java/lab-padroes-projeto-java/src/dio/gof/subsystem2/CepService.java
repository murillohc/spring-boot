package dio.gof.subsystem2;

public class CepService {
    private static CepService instance = new CepService();

    private CepService() {

    }

    public static CepService getInstance() {
        return instance;
    }

    public String findCityBy(String cep) {
        return "Florianópolis";
    }

    public String findStateBy(String cep) {
        return "SC";
    }
}
