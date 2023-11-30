import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import java.util.*

class SuspendFunctionTest {
    suspend fun helloWorld() {
        println("Hello : ${Date()}")
        delay(2000)
        println("World : ${Date()}")
    }

    @Test
    fun testSuspendFunction() {
        runBlocking {
            helloWorld()
        }
    }
}