
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }

    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.fetchData();

        verify(mockApi).getData();
    }

    @Test
    public void testArgumentMatching() {
        Messenger mockMessenger = Mockito.mock(Messenger.class);
        NotificationService service = new NotificationService(mockMessenger);

        service.notifyUser("Mowa");

        verify(mockMessenger).send(eq("Mowa"), contains("Hello"));
    }

    @Test
    public void testVoidMethod() {
        Logger mockLogger = Mockito.mock(Logger.class);
        doNothing().when(mockLogger).log(anyString());

        mockLogger.log("Mowa is testing");
        verify(mockLogger).log("Mowa is testing");
    }

    @Test
    public void testMultipleReturns() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("First Call", "Second Call");

        MyService service = new MyService(mockApi);

        assertEquals("First Call", service.fetchData());
        assertEquals("Second Call", service.fetchData());
    }

    @Test
    public void testInteractionOrder() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        mockApi.getData();
        mockApi.getData();

        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi, times(2)).getData();
    }

    @Test
    public void testVoidMethodWithException() {
        Logger mockLogger = Mockito.mock(Logger.class);
        doThrow(new RuntimeException("Logging failed")).when(mockLogger).log(anyString());

        assertThrows(RuntimeException.class, () -> mockLogger.log("fail case"));
        verify(mockLogger).log("fail case");
    }
}
