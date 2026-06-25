import static org.mockito.Mockito.*;
import org.junit.Test;
import org.mockito.Mockito;

public class VerifyInteractionTest {

    @Test
    public void testVerifyInteraction() {

        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        when(mockApi.getData()).thenReturn("Some Data");

        MyService service = new MyService(mockApi);

        service.fetchData();

        verify(mockApi).getData();
        System.out.println("Verified: getData() was called on the mock.");
    }

    @Test
    public void testVerifyCalledTwice() {

        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Data");
        MyService service = new MyService(mockApi);

        service.fetchData();
        service.fetchData();

        verify(mockApi, times(2)).getData();
        System.out.println("Verified: getData() was called exactly 2 times.");
    }

    @Test
    public void testVerifyNeverCalled() {

        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        verify(mockApi, never()).getData();
        System.out.println("Verified: getData() was never called.");
    }
}