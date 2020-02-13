package pageobject.service;

import pageobject.page.CatalogPage;

public class MaxCompareService {

    public void addToCompareMax(int i) {
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.listView();
        catalogPage.waitListView();
        for (int x = 1; x <= i; x++) {
            catalogPage.addToCompare();
            catalogPage.waitAddToCompare(x);
        }
    }

    public String addToCompareMaxError() {
        CatalogPage catalogPage = new CatalogPage();
        addToCompareMax(3);
        catalogPage.addToCompare();
        catalogPage.waitAlertText();
        return catalogPage.getAlertText();
    }
}

