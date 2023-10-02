package automationexercise.page;

import automationexercise.util.DataFakerGeneretor;
import org.openqa.selenium.By;

public class OuvidoriaPage extends BasePage {

    DataFakerGeneretor dataFaker = new DataFakerGeneretor();

    private static final By btnMenu =
            By.cssSelector("button.svg-menu");

    private static final By btnPermitirCookies =
            By.cssSelector("#banner-container > section > div > button._147910d4-c76a-4ad4-b0ea-ed7000017088.all-cookies-button._af28ad55-d990-436b-8ae3-d12f81ecf9fd._7f41a536-3a66-4c10-85b0-82d6391b3b5c > span");

    private static final By btnFaleComAGente =
            By.cssSelector(" #div-accordion > button:nth-child(12) > img.icone-mais");

    private static final By btnOvidoria =
            By.cssSelector("#div-accordion > div:nth-child(13) > a:nth-child(5)");

    private static final By campoProtocolo =
            By.cssSelector("#inputProtocolo");

    private static final By btnEuPreciso =
            By.cssSelector("#momentos > div.card.col-md-8 > table > tbody > tr > td:nth-child(2) > div > div > span");

    private static final By btnParaEmpresas =
            By.cssSelector("#header-novo-container > div > div.header-aba > div > div > div:nth-child(2) > span > a");

    private static final By btnParaAgronegocio =
            By.cssSelector("#header-novo-container > div > div.header-aba > div > div > div:nth-child(3) > span > a");
    private static final By btnApoioColheita =
            By.cssSelector("#momentos > div.card.col-md-8 > table > tbody > tr > td:nth-child(2) > div > div > div > ul > li:nth-child(2)");

    private static final By btnBuscarSolucao =
            By.cssSelector("#plugin-card-banner-principal-imagem-video-c3c > div.c3c-card-estrutura.banner-principal-video-estrutura.carrossel-canais > div > div.modelo-4.card-right > a > button");



    public void clicarBtnMenu(){
        clicar(btnMenu);
    }
    public void clicarBtnPermitirCookies(){
        clicar(btnPermitirCookies);
    }
    public void clicarBtnFaleComAGente(){
        clicar(btnFaleComAGente);
    }
    public void clicarBtnOuvidoria(){
        encontrarEClicarElemento(btnOvidoria);
    }
    public void preencherCampoProtocolo(){
        preencherInput(campoProtocolo, dataFaker.ano());
    }
    public void clicarBtnParaEmpresas(){
        clicar(btnParaEmpresas);
    }
    public void clicarBtnParaAgronegocio(){
        clicar(btnParaAgronegocio);
    }
    public void clicarBtnBuscarSolucao(){        encontrarElemento(btnBuscarSolucao);    }
    public void clicarBtnApoioColheita(){
        encontrarEClicarElemento(btnApoioColheita);
    }
    public void clicarBtnEuPreciso(){ clicar(btnEuPreciso); }


}
