package service

import model.Person
import repository.PersonRepository
import java.util.UUID

class PersonService(private val personRepository: PersonRepository) {
    fun get(id: String): Person {
        if (id.isBlank()) {
            throw IllegalArgumentException("Peson is not valid")
        }

        val person = personRepository.selecById(id)
        if (person != null) {
            return person
        } else {
            throw Exception("Person not found")
        }
    }

    fun register(name: String): Person {
        if (name.isBlank()) {
            throw IllegalArgumentException("Person name is blank")
        }
        val id = UUID.randomUUID().toString()
        val person = Person(id, name)

        personRepository.insert(person)

        return person
    }
}