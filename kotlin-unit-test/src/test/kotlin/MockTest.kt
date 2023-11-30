import org.junit.jupiter.api.Test
import org.mockito.Mockito
import kotlin.test.assertEquals

class MockTest {
    @Test
    fun testMock() {
        val list = Mockito.mock(List::class.java)

        Mockito.`when`(list.get(0)).thenReturn("Moch")
        Mockito.`when`(list.get(1)).thenReturn("Pratama")

        assertEquals("Moch", list.get(0))
        assertEquals("Moch", list.get(0))
        assertEquals("Pratama", list.get(1))

        Mockito.verify(list, Mockito.times(2)).get(0)
        Mockito.verify(list).get(1)
    }
}