package automationexercise.tests;

import automationexercise.factory.seleniumfactory.SeleniumFactory;
import automationexercise.page.OuvidoriaPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.Test;

@Epic("Site Sicredi")
@Feature("Ouvidoria")
public class OuvidoriaTest extends BaseTest {


    @Description("Validar abrir o menu")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void abrirMenuComSucesso(){

        OuvidoriaPage ouvidoriaPage = new OuvidoriaPage();

        ouvidoriaPage.clicarBtnPermitirCookies();
        ouvidoriaPage.clicarBtnParaEmpresas();
        ouvidoriaPage.clicarBtnParaAgronegocio();
        ouvidoriaPage.clicarBtnEuPreciso();
        ouvidoriaPage.clicarBtnApoioColheita();
        ouvidoriaPage.clicarBtnBuscarSolucao();
        ouvidoriaPage.clicarBtnMenu();
        ouvidoriaPage.clicarBtnFaleComAGente();
        ouvidoriaPage.clicarBtnOuvidoria();
        ouvidoriaPage.preencherCampoProtocolo();

    }
}
