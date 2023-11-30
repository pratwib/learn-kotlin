import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.RepetitionInfo
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInfo
import java.util.Random
import kotlin.test.assertEquals

class RandomCalculatorTest : ParentCalculatorTest() {
    @Test
    fun testRandom(random: Random, testInfo: TestInfo) {
        val first = random.nextInt(1000)
        println(first)
        val second = random.nextInt(1000)
        println(second)

        val result = calculator.add(first, second)

        assertEquals(first + second, result)
    }

    @DisplayName("Test Calculator Random")
    @RepeatedTest(
        value = 10,
        name = "{displayName} ke {currentRepetition} dari {totalRepetition}"
    )
    fun testRandomRepeated(random: Random, repetitionInfo: RepetitionInfo,testInfo: TestInfo) {
        println("${testInfo.displayName} ke ${repetitionInfo.currentRepetition} dari ${repetitionInfo.totalRepetitions}")

        val first = random.nextInt(1000)
        println(first)
        val second = random.nextInt(1000)
        println(second)

        val result = calculator.add(first, second)

        assertEquals(first + second, result)
    }
}