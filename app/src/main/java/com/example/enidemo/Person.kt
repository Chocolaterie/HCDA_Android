package com.example.enidemo

class Person(var firstName: String) {

    override fun equals(other: Any?): Boolean {
        return firstName == (other as Person).firstName;
    }

    operator fun inc(): Person {
        return Person("Lucas")
    }

    operator fun plusAssign(person : Any?) : Unit {
        this.firstName = this.firstName + (person as Person).firstName;

    }

    operator fun minusAssign(personB: Person) {

    }
}
