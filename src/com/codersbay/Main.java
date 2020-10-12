package com.codersbay;


import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        PersonalManagment personalManagment = new PersonalManagment();
        Address address1;
        Scanner sc = new Scanner(System.in);
        String fname;
        String lname;
        String fullname;
        int bday1;
        int bday2;
        int bday3;
        String gender;
        String street;
        int streetNumber;
        int zip;
        String city;
        String user;

        do {
            System.out.println("What you want to do ?");
            System.out.println("1 - add full | 2 - remove full | 3 - add half | 4 - remove half | 5 - list | q - quit");
            user = sc.nextLine();
            if (user.equals("1")) {
                System.out.println("Enter the firstname:");
                fname = sc.nextLine();
                System.out.println("Enter the lastname:");
                lname = sc.nextLine();
                System.out.println("Enter the birthday: YYYY");
                bday1 = sc.nextInt();
                System.out.println("Enter the birthday: MM");
                bday2 = sc.nextInt();
                System.out.println("Enter the birthday: DD");
                bday3 = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the Gender: FEMALE, MALE, OTHER");
                gender = sc.nextLine();
                System.out.println("Enter the street:");
                street = sc.nextLine();
                System.out.println("Enter the streetnumber:");
                streetNumber = sc.nextInt();
                System.out.println("Enter the zip code:");
                zip = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the city:");
                city = sc.nextLine();

                address1 = new Address(street.toUpperCase(), streetNumber, zip, city.toUpperCase());
                personalManagment.addPerson(fname.toUpperCase(), lname.toUpperCase(), LocalDate.of(bday1, bday2, bday3), Gender.valueOf(gender.toUpperCase()), address1);
                System.out.println("You added successfully a new person.");
            }
            if (user.equals("2")) {
                System.out.println("Enter the firstname:");
                fname = sc.nextLine();
                System.out.println("Enter the lastname:");
                lname = sc.nextLine();
                System.out.println("Enter the birthday: YYYY");
                bday1 = sc.nextInt();
                System.out.println("Enter the birthday: MM");
                bday2 = sc.nextInt();
                System.out.println("Enter the birthday: DD");
                bday3 = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the Gender: FEMALE, MALE, OTHER");
                gender = sc.nextLine();
                System.out.println("Enter the street:");
                street = sc.nextLine();
                System.out.println("Enter the streetnumber:");
                streetNumber = sc.nextInt();
                System.out.println("Enter the zip code:");
                zip = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the city:");
                city = sc.nextLine();

                address1 = new Address(street.toUpperCase(), streetNumber, zip, city.toUpperCase());
                personalManagment.delPerson(fname.toUpperCase(), lname.toUpperCase(), LocalDate.of(bday1, bday2, bday3), Gender.valueOf(gender.toUpperCase()), address1);
                System.out.println("Successfully removed.");
            }
            if (user.equals("3")) {
                System.out.println("Enter the first name");
                fname = sc.nextLine();
                System.out.println("Enter the last name");
                lname = sc.nextLine();

                personalManagment.addPerson(fname.toUpperCase(), lname.toUpperCase(), null, null, null);
                System.out.println("Successfully added");
            }
            if (user.equals("4")) {
                System.out.println("Enter the first name");
                fname = sc.nextLine();
                System.out.println("Enter the last name");
                lname = sc.nextLine();

                personalManagment.delPerson(fname.toUpperCase(), lname.toUpperCase(), null, null, null);
            }
            if (user.equals("5")) {
                for (int i = 0; i < personalManagment.persons.size(); i++) {
                    System.out.println(personalManagment.persons.get(i));
                }
            }
        } while (!user.equals("q"));

    }
}
