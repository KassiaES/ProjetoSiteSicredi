package automationexercise.util;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataFakerGeneretor {

    private static final Faker faker = new Faker(new Locale("PT-BR"));
    private static final Faker fakerEn = new Faker(new Locale("EN-US"));

    public String emailFaker(){
        return faker.internet().emailAddress();
    }
    public String senhaFaker(){
        return faker.internet().password();
    }
    public String cepFaker(){
        return String.valueOf(99999999);
    }
    public String ano(){
        return String.valueOf(Math.random() * 2024);
    }
}
