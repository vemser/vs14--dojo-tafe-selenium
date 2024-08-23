package automationexercise.util;

import com.github.javafaker.Faker;

public class DataFakerGeneretor {

    // instanciar a ferramenta Faker
    private static final Faker faker = new Faker();

    public String usernameFaker(){
        return faker.name().username();
    }

    public String senhaFaker(){
        return faker.internet().password();
    }





}
