import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;


public class ATest {

    //@InjectMocks
    //private A classAObj;

    @Test
    public void testProcessRequest() {
        var spy = mock(A.class, withSettings()
                .useConstructor().defaultAnswer(CALLS_REAL_METHODS));
        doReturn(new Token()).when(spy).getToken();
        spy.processRequest();
    }

    @Test
    public void testProcessRequest_chandni() {
        A myInstance = new A();
        A mySpy = Mockito.spy(myInstance);
        Mockito.doReturn(new Token()).when(mySpy).getToken();
        mySpy.processRequest();
        mySpy.someRealMethod();
    }
}
