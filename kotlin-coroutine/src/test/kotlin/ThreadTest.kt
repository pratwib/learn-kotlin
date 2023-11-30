import org.junit.jupiter.api.Test
import java.util.Date
import kotlin.concurrent.thread

class ThreadTest {
    @Test
    fun testThreadName() {
        val threadName = Thread.currentThread().name
        println("Running in thread $threadName")
    }

    @Test
    fun testNewThread() {
//        val runnable = Runnable {
//            println(Date())
//            Thread.sleep(2_000)
//            println("Finish : ${Date()}")
//        }
//
//        val thread = Thread(runnable)
//        thread.start()

        thread(start = true) {
            println(Date())
            Thread.sleep(2_000)
            println("Finish : ${Date()}")
        }

        println("MENUNGGU")
        Thread.sleep(3_000)
        println("SELESAI")
    }

    @Test
    fun testMultipleThread() {
        val thread1 = thread(start = true) {
            println(Date())
            Thread.sleep(5_000)
            println("Finish Thread 1 : ${Thread.currentThread().name} : ${Date()}")
        }
        val thread2 = thread(start = true) {
            println(Date())
            Thread.sleep(10_000)
            println("Finish Thread 2 : ${Thread.currentThread().name} : ${Date()}")
        }

        println("MENUNGGU")
        Thread.sleep(15_000)
        println("SELESAI")
    }
}