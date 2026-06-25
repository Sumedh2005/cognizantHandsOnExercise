// Service class that DEPENDS on ExternalApi
public class MyService {

    private ExternalApi externalApi;

    // Constructor injection
    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        return externalApi.getData();
    }
}