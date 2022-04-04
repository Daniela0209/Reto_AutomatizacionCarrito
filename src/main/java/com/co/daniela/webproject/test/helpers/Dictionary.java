package com.co.daniela.webproject.test.helpers;


import org.apache.bcel.generic.PUSH;

public class Dictionary {
    public static final String STATE_BY_DEFAULT_FLORIDA = "Florida";

    public static final String EMPTY_STRING = " ";
    public static final String SPACE_STRING = " ";


    public static final String SPANISH_CODE_LANGUAGE = "en";
    public static final String COUNTRY_CODE = "US";


    public static final String EMAIL_DOMAIN = "@sofmail.com";

    public static final String FILE_EVIDENCE_PROPERTY = "files.evidence";
    public static final String APP_URL_PROPERTY = "app.url";


    private static final String PROPERTIES_FILE_BASE_PATH = "src/main/resources/properties/";

    public static final String CONFIGURATION_PROPERTIES_FILE = System.getProperty("user.dir") +
            "/" +
            PROPERTIES_FILE_BASE_PATH + "configuration.properties";

    public static final String MAIL_PROPERTIES_FILE = System.getProperty("user.dir") +
            "/" +
            PROPERTIES_FILE_BASE_PATH + "mail.properties";

    public static  final int TIME = 60;

    public static final Boolean EVIDENCE = true;

    public static final String MESSAGE_VIEW = "Your message has been successfully sent to our team.";
    public static final String MESSAGE_USER = "Mensaje de prueba";
    public static final String REFERENCE = "SE5678";
    public static final String MESSAGE_ADDCAR_COMPLETE ="Your order on My Store is complete.";
}
