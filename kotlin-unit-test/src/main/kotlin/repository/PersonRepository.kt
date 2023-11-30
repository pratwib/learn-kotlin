package repository

import model.Person

interface PersonRepository {
    fun selecById(id: String): Person?

    fun insert(person: Person)
}