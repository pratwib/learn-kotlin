import kotlinx.coroutines.*
import org.junit.jupiter.api.Test

class JobTest {
    @Test
    fun testJob() {
        runBlocking {
            GlobalScope.launch {
                delay(2000)
                println("Coroutine Done ${Thread.currentThread().name}")
            }
        }
    }

    @Test
    fun testJobLazy() {
        runBlocking {
            val job = GlobalScope.launch {
                delay(2000)
                println("Coroutine Done ${Thread.currentThread().name}")
            }

            job.cancel()
            delay(3000)
        }
    }
}