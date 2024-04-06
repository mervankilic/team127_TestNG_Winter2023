package tests.day17_crosBrowserCalisacakTestler;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.TestBaseCross;

public class C01 extends TestBaseCross {

    @Test
    public void aramaTesti(){

        driver.get(ConfigReader.getProperty("toUrl"));
    }
}
