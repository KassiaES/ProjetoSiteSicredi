package automationexercise.page;

import automationexercise.util.DataFakerGeneretor;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    DataFakerGeneretor dataFaker = new DataFakerGeneretor();

    private static final By frameLocalizarAgencia =
            By.cssSelector("#cards-links-rapidos > div.carrossel-container.owl-carousel.owl-theme.owl-loaded.owl-drag > div > div > div:nth-child(1) > div > a > div > p");

    private static final By btnPermitrCookies =
            By.cssSelector("#banner-container > section > div > button._147910d4-c76a-4ad4-b0ea-ed7000017088.all-cookies-button._af28ad55-d990-436b-8ae3-d12f81ecf9fd._7f41a536-3a66-4c10-85b0-82d6391b3b5c > span");

    private static final By tituloBuscaPorCep =
            By.cssSelector("#rowCards > div > div.topoCard > div > p.titulo-tamanho-5.nomeCard");

    private static final By tituloBuscaPorGeolocalizacao =
            By.cssSelector("#rowCards > div:nth-child(2) > div.topoCard > div > p.paragrafo.tituloCard");

    private static final By tituloBuscaPorCepInvalido =
            By.cssSelector("#naoEncontra");


    private static final By inputLocalidade =
            By.cssSelector("#filtroop");

    private static final By btnCat =
            By.cssSelector("#sendCat");

    private static final By btnBuscaLocalidade =
            By.cssSelector("#botaoBusca");

    private static final By btnGeo =
            By.cssSelector("#usergeo");



    public void clicarFrameLocalizarAgencia(){
        clicar(frameLocalizarAgencia);
    }
    public void clicarBtnPermitirCookies(){
        clicar(btnPermitrCookies);
    }
    public void preencherInputCidadeValida(){ preencherInput(inputLocalidade, "Navegantes-SC"); }
    public void preencherInputCepInvalido(){
        preencherInput(inputLocalidade, dataFaker.cepFaker());
    }
    public void clicarBtnGeo(){
        clicar(btnGeo);
    }
    public void clicarBtnCat(){
        clicar(btnCat);
    }
    public void clicarBtnBuscaLocalidade(){
        clicar(btnBuscaLocalidade);
    }
    public void preencherInputCepValido(){ preencherInput(inputLocalidade, "88370-546"); }

    public String lerTituloBuscaPorCep(){
        return lerTexto(tituloBuscaPorCep);
    }

    public String lerTituloBuscaPorCepInvalido(){
        return lerTexto(tituloBuscaPorCepInvalido);
    }

    public String lerTituloPorGeolocalizacao(){
        return lerTexto(tituloBuscaPorGeolocalizacao);
    }

}
