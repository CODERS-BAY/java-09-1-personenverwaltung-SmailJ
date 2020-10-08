package com.codersbay;

import java.time.LocalDate;
import java.util.ArrayList;

public class PersonalManagment {

    public ArrayList<Person> persons = new ArrayList<Person>();

    public void addPerson(String firstName, String lastName, LocalDate birthday, Gender gender, Address address) {
        persons.add(new Person(
                firstName,
                lastName,
                birthday,
                gender,
                address
        ));
    }
    public void delPerson(String firstName, String lastName, LocalDate birthday, Gender gender, Address address) {
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).firstName.equals(firstName) && persons.get(i).lastName.equals(lastName) && persons.get(i).birthday.equals(birthday) && persons.get(i).gender.equals(gender) && persons.get(i).address.equals(address)) {
                persons.remove(persons.get(i));
            }
        }
    }
}
