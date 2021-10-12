package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;

public class dashboard extends Library {


    
    @FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]/b")
    WebElement Adminbutton;

    public dashboard(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);


}

    public void click() {
//        username.sendKeys(uname);
//        pwd.sendKeys(pas);

        Adminbutton.click();

    }

}
