package com;

import com.config.EnvironmentProperties;
import org.aeonbits.owner.ConfigFactory;

public class BaseTest {
    protected EnvironmentProperties envProp = ConfigFactory.create(EnvironmentProperties.class);

    public void browserSetup() {
        // open chrome browser
    }

    public void getTestUrl(){
        String url = envProp.getURL();
        // get url
    }
}
