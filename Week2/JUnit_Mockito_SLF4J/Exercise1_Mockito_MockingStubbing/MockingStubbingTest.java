import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Test;
import org.mockito.Mockito;

public class MockingStubbingTest {

    @Test
    public void testExternalApi() {

        // ARRANGE
        // Create a MOCK (fake) object of ExternalApi - no real network call!
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // STUB - tell the mock what to return when getData() is called
        when(mockApi.getData()).thenReturn("Mock Data");

        // Inject the mock into our service
        MyService service = new MyService(mockApi);

        // ACT
        String result = service.fetchData();

        // ASSERT
        assertEquals("Mock Data", result);
        System.out.println("Result from mock: " + result);
    }
}