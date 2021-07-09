import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class ATest {

    @Test
    public void testProcessRequest() {
        var spy = mock(A.class, withSettings()
                .useConstructor().defaultAnswer(CALLS_REAL_METHODS));
        doReturn(new Token()).when(spy).getToken();
        spy.processRequest();
    }
}
