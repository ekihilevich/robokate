package pageobject.service;

import pageobject.component.Header;
import pageobject.page.CatalogPage;
import pageobject.page.LoginPage;

public class NavigateToService {
    public CatalogPage toCatalogPage() {
        Header header = new Header();
        header.clickWomen();
        return new CatalogPage();
    }
    public LoginPage toLoginPage() {
        Header header = new Header();
        header.goToLoginPage();
        return new LoginPage();
    }
}
