package com.codersbay;

import java.time.LocalDate;

public class Person {
    public String firstName;
    public String lastName;
    public LocalDate birthday;
    public Gender gender;
    public Address address;

    public Person(String firstName, String lastName, LocalDate birthday, Gender gender, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gender = gender;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "First name='" + firstName + '\'' +
                ", Last name='" + lastName + '\'' +
                (birthday == null ? "noBirthday" : (birthday.getDayOfMonth() + "." + birthday.getMonthValue() + "." + birthday.getYear())) +
                ", Gender=" + gender +
                ", Address=" + address +
                '}';
    }
}
