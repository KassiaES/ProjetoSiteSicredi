package automationexercise.tests;

import automationexercise.factory.seleniumfactory.SeleniumFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    SeleniumFactory seleniumFactory = new SeleniumFactory();

    @BeforeMethod
    public void abrirNavegador(){
        seleniumFactory.initBrowser("https://www.sicredi.com.br/home/");
    }


    @AfterMethod
    public void fecharNavegador(){
        seleniumFactory.tearDown();
    }
}
