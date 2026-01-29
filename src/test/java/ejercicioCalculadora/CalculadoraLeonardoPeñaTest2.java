package ejercicioCalculadora;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraNombreApellidoTest2 {
    private CalculadoraLeonardoPeña calc;
    @BeforeEach
    void setUp() {
        calc = new CalculadoraLeonardoPeña (20, 10);
        System.out.println("Iniciando prueba...");
    }
    @AfterEach
    void tearDown() {
        System.out.println("Prueba finalizada.");
    }
    @Test
    @DisplayName("Comprobación básica del método suma()")
    void testSumaBasica() {
        assertEquals(30, calc.suma(), "La suma debería devolver 30");
    }
    @Test
    @Disabled("Pendiente de implementación del método resta()")
    void testResta() {
        fail("Este test está deshabilitado temporalmente");
    }
    @RepeatedTest(3)
    @DisplayName("Prueba repetida de multiplicación")
    void testMultiplicacionRepetida() {
        assertEquals(200, calc.multiplica());
    }
    @ParameterizedTest
    @ValueSource(ints = {1, 5, 10, 20})
    @DisplayName("Prueba parametrizada con un solo parámetro: suma positiva")
    void testSumaConParametros(int valor) {
        CalculadoraLeonardoPeña calc = new CalculadoraLeonardoPeña (valor, 10);
        assertTrue(calc.suma() > 0, "La suma debe ser positiva");
    }

    @Test
    @DisplayName("Comprobación de que el objeto Calculadora no es nulo")
    void testObjetoNoNulo() {
        assertNotNull(calc, "El objeto calculadora debería haberse inicializado en setUp().");
    }
    @Test
    @DisplayName("Verificación del resultado de la división")
    void testDivisionCorrecta() {
        assertEquals(2, calc.divide());
        assertTrue(calc.divide() > 0, "El resultado debe ser mayor que 0");
    }
}