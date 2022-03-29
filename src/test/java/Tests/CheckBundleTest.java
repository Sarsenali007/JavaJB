package Tests;

import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import lib.CoreTestCase;
import lib.Platform;
import lib.ui.MainFirstPageObject;
import lib.ui.factories.MainFirstPageObjectFactory;
import org.junit.Test;

public class CheckBundleTest {

    @Epic("Check tarif")
    public class CollectTariffPackageTests extends CoreTestCase {
        String short_IBAN = "KZ44 •••• 6013";

        @Test
        @DisplayName("Change company")
        @Description("change company and checking update for IBAN")

        @Step("Starting test change company")
        //@Features(value = {@Feature(value = "Chose_company"), @Feature(value = "Update_Main_page"),})
        //@Severity(value = SeverityLevel.BLOCKER)

        public void testCollectTariffPackage() throws InterruptedException {
            MainFirstPageObject MainFirstPageObject = MainFirstPageObjectFactory.get(driver);

        }
    }

}

