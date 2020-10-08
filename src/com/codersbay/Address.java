package com.codersbay;

import java.util.Objects;

public class Address {
    public String street;
    public int streetNumber;
    public int zip;
    public String city;

    public Address(String street, int streetNumber, int zip, String city) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.zip = zip;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", streetNumber=" + streetNumber +
                ", zip=" + zip +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return streetNumber == address.streetNumber &&
                zip == address.zip &&
                Objects.equals(street, address.street) &&
                Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, streetNumber, zip, city);
    }
}
