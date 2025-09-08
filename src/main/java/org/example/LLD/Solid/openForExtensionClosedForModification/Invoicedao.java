package org.example.LLD.Solid.openForExtensionClosedForModification;
import org.example.LLD.Solid.singleResponsibilityPrincipal.Invoice;

public class Invoicedao {
// here we can see that below method can be modified which should not be available for modification but it should be open for extention
// so if a class has a possiblity of modification its important to make a interface first
    public void saveToDb(Invoice invoice){
        return;
    }
}
