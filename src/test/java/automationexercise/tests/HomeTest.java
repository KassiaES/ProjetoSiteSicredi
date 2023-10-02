package automationexercise.tests;

import automationexercise.page.HomePage;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("Site Sicredi")
@Feature("Localizar Agência")
public class HomeTest extends BaseTest {

    @Description("Validar navegar até a página de pesquisa de Agência")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void navegarAtePaginaLocalizarAgenciaComSucesso(){

        HomePage homePage = new HomePage();

        homePage.clicarBtnPermitirCookies();
        homePage.clicarFrameLocalizarAgencia();
    }

    @Description("Validar navegar pesquisar agência por cidade válida")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void localizarAgenciaPorCidadeComSucesso(){

        HomePage homePage = new HomePage();

        homePage.clicarBtnPermitirCookies();
        homePage.clicarFrameLocalizarAgencia();
        homePage.preencherInputCidadeValida();
        homePage.clicarBtnBuscaLocalidade();

        String msgm = homePage.lerTituloBuscaPorCep();
        Assert.assertTrue(msgm.contains("Navegantes"));

    }

    @Description("Validar navegar pesquisar agência por geolocalização")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void localizarAgenciaPorGeolocalizacaoComSucesso(){

        HomePage homePage = new HomePage();

        homePage.clicarBtnPermitirCookies();
        homePage.clicarFrameLocalizarAgencia();
        homePage.clicarBtnGeo();

        String msgm = homePage.lerTituloPorGeolocalizacao();
        Assert.assertNotNull(msgm);

    }

    @Description("Validar navegar pesquisar agência por CEP válido")
    @Severity(SeverityLevel.MINOR)
    @Test
    public void localizarAgenciaPorCepComSucesso(){

        HomePage homePage = new HomePage();

        homePage.clicarBtnPermitirCookies();
        homePage.clicarFrameLocalizarAgencia();
        homePage.preencherInputCepValido();
        homePage.clicarBtnCat();

        String msgm = homePage.lerTituloBuscaPorCep();
        Assert.assertTrue(msgm.contains("Navegantes"));

    }

    @Description("Validar navegar pesquisar agência por Cep inválido")
    @Severity(SeverityLevel.MINOR)
    @Test
    public void localizarAgenciaPorCepInvalidoSemSucesso(){

        HomePage homePage = new HomePage();

        homePage.clicarBtnPermitirCookies();
        homePage.clicarFrameLocalizarAgencia();
        homePage.preencherInputCepInvalido();
        homePage.clicarBtnBuscaLocalidade();

        String message = homePage.lerTituloBuscaPorCepInvalido();
        Assert.assertNotNull(message);


    }


}
