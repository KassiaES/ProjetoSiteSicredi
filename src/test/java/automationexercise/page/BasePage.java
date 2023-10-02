package automationexercise.page;

import automationexercise.factory.seleniumfactory.Elements;
import org.openqa.selenium.By;

public class BasePage extends Elements {
    static void preencherInput(By by, String text) {
        esperarElemento(by);
        element(by).sendKeys(text);
    }

    static void preencherDia(By by, String text) {
        esperarElemento(by);
        element(by).sendKeys(text);
    }

    static void preencherMes(By by, String text) {
        esperarElemento(by);
        element(by).sendKeys(text);
    }

    static void preencherAno(By by, String text) {
        esperarElemento(by);
        element(by).sendKeys(text);
    }

    static void clicar(By by) {
        esperarElemento(by);
        element(by).click();
    }

    protected static String lerTexto(By by) {
        esperarElemento(by);
        return element(by).getText();
    }

    protected static void selecinoTab(By by){
        esperarElemento(by);
        element(by).sendKeys("\t");
    }

    protected static boolean exibe(By by) {
        esperarElemento(by);
        return element(by).isDisplayed();
    }

    protected static void selecionarTab(By by){
        esperarElemento(by);
        element(by).sendKeys("\t");
    }

    protected static Boolean verificarEmailEmFormatoValido(By by){
        esperarElemento(by);
        try {
            String value = element(by).getAttribute("value");
            Integer id = value.indexOf("@");
            if (value != null){
                if (value.isEmpty()){
                    if (id > 0 && id < value.length()){
                        return true;
                    }
                }
            }
        } catch (Exception e){
            return false;
        }
        return false;
    }

    protected static Boolean verificarCampoContatoVazio(By by) {
        esperarElemento(by);
        try {
            String value = element(by).getAttribute("value");
            if (value != null) {
                if (value.isEmpty()) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    protected static int lerTamanhoLista(By by) {
        esperarElemento(by);
        return elements(by).size();
    }

    protected static Boolean verificarCampoPreenchido(By by) {
        esperarElemento(by);
        try{
            String value = element(by).getAttribute("value");
            if(value != null) {
                if(value.isEmpty()){
                    return false;
                }
            }
        } catch (Exception e) {
            return true;
        }
        return true;
    }

}
