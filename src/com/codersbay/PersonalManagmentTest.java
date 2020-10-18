package com.codersbay;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonalManagmentTest {

    @Test
    public void addTest() {
        PersonalManagment myPersonal = new PersonalManagment();
        myPersonal.addPerson("test","test", null, null, null);
        myPersonal.addPerson("test","test", null, null, null);
        myPersonal.addPerson("test","test", null, null, null);
        System.out.println(myPersonal.persons.get(0));
        int temp = myPersonal.persons.size();
        System.out.println(temp);
        myPersonal.addPerson("test","test", LocalDate.of(1997,9,5), Gender.MALE, null);
        assertEquals(myPersonal.persons.size(), 4);
    }

    @Test
    public void delTest() {
        PersonalManagment myPersonal = new PersonalManagment();
        myPersonal.addPerson("test","test", LocalDate.of(1997,9,5), Gender.MALE, null);
        assertEquals(myPersonal.persons.size(), 1);
        myPersonal.delPerson("test", "test", LocalDate.of(1997, 9, 5), Gender.MALE, null);
        myPersonal.addPerson("test", "test", null, null, null);
        assertEquals(myPersonal.persons.size(), 1);
        myPersonal.delPerson("test", "test", null, null, null);
    }

}
