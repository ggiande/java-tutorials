package ggiande.tutorial.singletonexample;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.Test;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
class SingletonTest {

    @Test
    void getInstance() {
        assertNotNull(Singleton.getInstance("Hello"));
    }
}
