package com.cristina.homework;

public class TestConfigRunner {

    public static void main(String[] args) {

        // Constructor cu 3 parametri
        BrowserConfig config1 = new BrowserConfig(BrowserType.CHROME, "120", true);

        // Constructor cu 2 parametri
        BrowserConfig config2 = new BrowserConfig(BrowserType.FIREFOX, "115");

        // Constructor cu 1 parametru
        BrowserConfig config3 = new BrowserConfig(BrowserType.EDGE);

        // Factory method
        BrowserConfig config4 = BrowserConfig.createDefaultChromeConfig();

        // Afișare
        config1.afiseazaConfig();
        config2.afiseazaConfig();
        config3.afiseazaConfig();
        config4.afiseazaConfig();
    }
}