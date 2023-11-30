import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import java.util.Date
import kotlin.concurrent.thread

class CoroutineTest {
    suspend fun hello() {
        delay(1000)
        println("Hello World")
    }

    @Test
    fun testCoroutine() {
        GlobalScope.launch {
            hello()
        }

        println("MENUNGGU")
        runBlocking {
            delay(2000)
        }

        println("SELESAI")
    }

    @Test
    fun testThread() {
        repeat(10_000) {
            thread {
                Thread.sleep(1_000)
                println("Done $it : $${Date()}")
            }
        }

        println("Waiting")
        Thread.sleep(5_000)
        println("Finish")
    }

    @Test
    fun testCoroutineMany() {
        repeat(100_000) {
            GlobalScope.launch {
                delay(1_000)
                println("Done $it : $${Date()}")
            }
        }

        println("Waiting")
        runBlocking {
            delay(5_000)
        }
        println("Finish")
    }
}