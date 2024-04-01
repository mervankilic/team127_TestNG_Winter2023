package tests.day15_configuration_driver_Kullanimi;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C02_configurationPropertiesKullanimi {

    @Test
    public void aramaTesti(){

        // test otomasyonu anasayfaya gidin

        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        // configuration.properties'de belirlenmis olan aranacak urunu aratin

        // arama sonucunda urun bulunabildigini test edin

        // ilk urune tiklayin

        // acilan sayfada urun isminin case sensitive olmadan
        // configuration.properties'de belirlenmis olan aranacak kelimeyi icerdigini test edin

        ReusableMethods.bekle(3);
        Driver.closeDriver();

    }
}
