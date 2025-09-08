package org.example.LLD.Solid.openForExtensionClosedForModification;
import org.example.LLD.Solid.singleResponsibilityPrincipal.Invoice;

public class Invoicedao3 implements Invoicedao1
{

    @Override
    public void savetoDB(Invoice invoice) {
        System.out.println("saveto mySQL");
    }
}
