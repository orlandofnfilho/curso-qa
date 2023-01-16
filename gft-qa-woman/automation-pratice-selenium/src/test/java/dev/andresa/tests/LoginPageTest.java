package dev.andresa.tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.andresa.pages.LoginPage;

public class LoginPageTest {
    private LoginPage loginPage;
    private final String URL="https://www.saucedemo.com/";

    @BeforeEach
    void setUp() throws Exception{
        loginPage = new LoginPage();
        loginPage.visit(this.URL);     
    }

    @AfterEach
    void tearDown() throws Exception{
        loginPage.quitWebDriver();
    }

    @Test
    void testName() throws Exception {
        //When
        this.loginPage.signin();
    
        /*//Then
        assertTrue(this.loginPage.getInventoryMessenge().equals("PRODUCTS"));
        assertFalse(this.loginPage.getCurrentURL(equals("https://www.saucedemo.com/inventory/")));*/
    }
    
}
