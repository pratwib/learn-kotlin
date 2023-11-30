import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Tags
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInfo

@DisplayName("Test with TestInfo")
class InformationTest {
    @Test
    @Tags(value = [
        Tag("contoh1"),
        Tag("contoh2")
    ])
    @DisplayName("sample test")
    fun sampeTest(testInfo: TestInfo) {
        println(testInfo.displayName)
        println(testInfo.tags)
        println(testInfo.testClass)
        println(testInfo.testMethod)
    }
}