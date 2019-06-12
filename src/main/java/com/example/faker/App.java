package com.example.faker;

import com.github.javafaker.Faker;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class App {
    private static Faker faker = new Faker();
    public static void main(String[] args) {

        System.out.println(faker.name().firstName());
        System.out.println(faker.name().lastName());
        System.out.println(faker.address().streetAddress());
        System.out.println(faker.address().city());
        System.out.println(faker.address().stateAbbr());
        System.out.println(faker.address().zipCode().split("-")[0]);

        //date of birth
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;

        LocalDateTime localDateTime = LocalDateTime.ofInstant(faker.date().birthday(19, 50).toInstant(), ZoneId.of("UTC"));
        System.out.println(formatter.format(localDateTime));

        //ssn
        System.out.println(faker.idNumber().ssnValid());

        //cell phone
        System.out.println(faker.phoneNumber().cellPhone().replaceAll("[^0-9]", ""));



    }
}
/*
|firstName	|lastName	|address				|city
|state	|zipcode	|dateOfBirth	|ssn		|homephone	|
 */
