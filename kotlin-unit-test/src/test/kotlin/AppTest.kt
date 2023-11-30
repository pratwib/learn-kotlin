import kotlin.test.Test
import kotlin.test.assertNotNull

class AppTest {
    @Test
    fun testAppHasAGreeting() {
        println("Ini Test")

        val classUnderTest = App()
        assertNotNull(classUnderTest.greeting, "app should have a greeting")
    }
}