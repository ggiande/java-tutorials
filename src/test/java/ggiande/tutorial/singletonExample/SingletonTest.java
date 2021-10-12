package ggiande.tutorial.singletonExample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
class SingletonTest {

    @Mock
    Singleton singleton;

    @Test
    void getInstance() {
        assertNotNull(singleton);
        when(singleton.getInstance("Hello")).thenReturn(singleton);
        assertTrue((BooleanSupplier) Singleton.getInstance("Hello"));
    }
}