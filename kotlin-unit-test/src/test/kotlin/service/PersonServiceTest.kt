package service

import model.Person
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.Extensions
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension
import repository.PersonRepository
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

@Extensions(value = [
    ExtendWith(MockitoExtension::class)
])
class PersonServiceTest {
    @Mock
    lateinit var personRepository: PersonRepository

    lateinit var personService: PersonService

    @BeforeEach
    fun beforeEach() {
        personService = PersonService(personRepository)
    }

    @Test
    fun testPersonIdIsNotValid() {
        assertThrows<IllegalArgumentException> {
            personService.get("     ")
        }
    }

    @Test
    fun testPersonNotFound() {
        assertThrows<Exception> {
            personService.get("not found")
        }
    }

    @Test
    fun testGetPersonSuccess() {
        Mockito.`when`(personRepository.selecById("moch")).thenReturn(Person("moch", "Moch Pratama"))

        val person = personService.get("moch")
        assertEquals("moch", person.id)
        assertEquals("Moch Pratama", person.name)
    }

    @Test
    fun testRegisterPersonNameIsBlank() {
        assertThrows<IllegalArgumentException> {
            personService.register("     ")
        }
    }

    @Test
    fun testRegisterSuccess() {
        val person = personService.register("Moch")

        assertEquals("Moch", person.name)
        assertNotNull(person.id)

        Mockito.verify(personRepository, Mockito.times(1)).insert(Person(person.id, "Moch"))
    }
}