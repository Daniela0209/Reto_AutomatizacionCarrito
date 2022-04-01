package com.co.daniela.webproject.test.stepdefinition;

import co.com.sofka.test.automationtools.selenium.Browser;
import org.openqa.selenium.chrome.ChromeOptions;
import com.co.daniela.webproject.test.data.objects.TestInfo;

public class Setup {
    protected TestInfo testInfo;

    public Browser browser(){



        Browser browserConfiguration = new Browser();
        browserConfiguration.setBrowser(Browser.Browsers.CHROME);
        browserConfiguration.setIncognito(true);
        browserConfiguration.setAutoDriverDownload(true);
       // browserConfiguration.setDriverVersion("Va la version del chrome");
        browserConfiguration.setChromeOptions(chromeOptions());

        return browserConfiguration;

    }
    private ChromeOptions chromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("star-maximized");
        return options;
    }

}
