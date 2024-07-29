package dio.gof.subsystem1;

public class CrmService {
    private CrmService() {
    }

    public static void saveClient(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente salvo no sistema de CRM");
    }
}
