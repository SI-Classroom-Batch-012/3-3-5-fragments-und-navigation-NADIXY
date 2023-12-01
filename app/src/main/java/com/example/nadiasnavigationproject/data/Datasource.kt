package com.example.nadiasnavigationproject.data

import com.example.nadiasnavigationproject.data.model.Contact

class Datasource {

    fun generateData(): List<Contact> {
        return listOf(
            Contact("Vanessa", "+491517878787", "vanessa@gmail.com"),
            Contact("Max", "+49123456789", "max@gmail.com"),
            Contact("Anna", "+49123456788", "anna@gmail.com"),
            Contact("Tim", "+49123456787", "tim@gmail.com"),
            Contact("Sophie", "+49123456786", "sophie@gmail.com"),
            Contact("Felix", "+49123456785", "felix@gmail.com"),
            Contact("Laura", "+49123456784", "laura@gmail.com"),
            Contact("Paul", "+49123456783", "paul@gmail.com"),
            Contact("Emily", "+49123456782", "emily@gmail.com"),
            Contact("David", "+49123456781", "david@gmail.com"),
            Contact("Lena", "+49123456780", "lena@gmail.com"),
            Contact("Simon", "+49123456779", "simon@gmail.com"),
            Contact("Hannah", "+49123456778", "hannah@gmail.com"),
            Contact("Noah", "+49123456777", "noah@gmail.com"),
            Contact("Mia", "+49123456776", "mia@gmail.com")
        )
    }

}