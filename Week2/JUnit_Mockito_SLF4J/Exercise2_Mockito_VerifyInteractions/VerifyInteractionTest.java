import static org.mockito.Mockito.*;
import org.junit.Test;
import org.mockito.Mockito;

public class VerifyInteractionTest {

    @Test
    public void testVerifyInteraction() {

        // ARRANGE - create mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Stub it so fetchData() doesn't get a null
        when(mockApi.getData()).thenReturn("Some Data");

        MyService service = new MyService(mockApi);

        // ACT - call the method
        service.fetchData();

        // ASSERT - verify that getData() was actually called exactly once
        verify(mockApi).getData();
        System.out.println("Verified: getData() was called on the mock.");
    }

    @Test
    public void testVerifyCalledTwice() {

        // ARRANGE
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Data");
        MyService service = new MyService(mockApi);

        // ACT - call twice
        service.fetchData();
        service.fetchData();

        // ASSERT - verify it was called exactly 2 times
        verify(mockApi, times(2)).getData();
        System.out.println("Verified: getData() was called exactly 2 times.");
    }

    @Test
    public void testVerifyNeverCalled() {

        // ARRANGE
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // ACT - don't call anything

        // ASSERT - verify getData() was NEVER called
        verify(mockApi, never()).getData();
        System.out.println("Verified: getData() was never called.");
    }
}