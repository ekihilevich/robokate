package pageobject.service;

import pageobject.component.Header;
import pageobject.page.CatalogPage;

public class NavigateToService {
    public CatalogPage toCatalogPage() {
        Header header = new Header();
        header.clickWomen();
        return new CatalogPage();
    }
}
