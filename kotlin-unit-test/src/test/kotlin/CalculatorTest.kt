import generator.SimpleDislpayNameGenerator
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Assumptions.*
import org.junit.jupiter.api.*
import org.opentest4j.TestAbortedException
import java.lang.IllegalArgumentException

@DisplayNameGeneration(SimpleDislpayNameGenerator::class)
//@DisplayName("Test for Calculator CLass")
class CalculatorTest {

    companion object {
        @BeforeAll
        @JvmStatic
        fun beforeAll() {
            println("Sebelum Semua Unit Test")
        }

        @AfterAll
        @JvmStatic
        fun afterAll() {
            println("Setelah Semua Unit Test")
        }
    }

    val calculator = Calculator()

    @BeforeEach
    fun beforeEach() {
        println("Sebelum Unit Test")
    }

    @AfterEach
    fun afterEach() {
        println("Setelah Unit Test")
    }

    @Test
//    @DisplayName("Test for function Calculator.add(10,10)")
    fun testAddSuccess() {
        println("Unit Test testAddSuccess")
        val result = calculator.add(10,10)
        assertEquals(20, result, "Hasil harusnya 20")
    }

    @Test
    fun testAddSuccess2() {
        println("Unit Test testAddSuccess2")
        val result = calculator.add(10,20)
        assertEquals(30, result, "Hasil harusnya 40")
    }

    @Test
    fun testDivideSuccess() {
        val result = calculator.divide(100, 10)
        assertEquals(10, result)
    }

    @Test
    fun testDivideFailed() {
        assertThrows<IllegalArgumentException> {
            calculator.divide(100, 0)
        }
    }

    @Test
    @Disabled("Sedang Diperbaiki")
    fun testComingSoon() {
//        belum selesai
    }

    @Test
    fun testAborted() {
        val profile = System.getenv()["PROFILE"]
        if ("DEV" != profile) {
            throw TestAbortedException()
        }

        println("Test Not Aborted because Dev Profile")
    }

    @Test
    fun testAssumptions() {
        assumeTrue("DEV" == System.getenv()["PROFILE"])

        println("Test Not Aborted because Dev Profile")
    }
}