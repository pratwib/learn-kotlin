import org.junit.jupiter.api.Test
import java.util.concurrent.Callable
import java.util.concurrent.Executors
import kotlin.system.measureTimeMillis

class FutureTest {
    val executorService = Executors.newFixedThreadPool(10)

    fun getFoo(): Int {
        Thread.sleep(2000)
        return 10
    }

    fun getBar(): Int {
        Thread.sleep(2000)
        return 10
    }

    @Test
    fun testNonParallel() {
        val time = measureTimeMillis {
            val foo = getFoo()
            val bar = getBar()
            val result = foo + bar
            println("Total : $result")
        }
        println("Total time : $time")
    }

    @Test
    fun testFuture() {
        val time = measureTimeMillis {
            val foo = executorService.submit(Callable { getFoo() })
            val bar = executorService.submit(Callable { getBar() })

            val result = foo.get() + bar.get()
            println("Total : $result")
        }
        println("Total time : $time")
    }
}