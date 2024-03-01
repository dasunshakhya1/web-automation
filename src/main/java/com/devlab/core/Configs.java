package com.devlab.core;

public class Configs {
    public static final String BROWSER = System.getenv("BROWSER")!=null?System.getenv("BROWSER"):"CHROME";
    public static final String URL = System.getenv("URL")!=null?System.getenv("URL"):"https://www.saucedemo.com/v1/index.html";
}
