package com.kodilla.kodillahibernate.invoice.dao;

import com.kodilla.kodillahibernate.invoice.Invoice;
import com.kodilla.kodillahibernate.invoice.Item;
import com.kodilla.kodillahibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product humer = new Product("humer");
        Product monitor = new Product("monitor");
        Product sope = new Product("sope");
        Item firstPosition = new Item(humer,BigDecimal.valueOf(10),1,BigDecimal.valueOf(10));
        Item secondPosition = new Item(monitor,BigDecimal.valueOf(1500),2,BigDecimal.valueOf(3000));
        Item lastPosition = new Item(sope,BigDecimal.valueOf(150),10,BigDecimal.valueOf(1500));
        Invoice invoice = new Invoice("00001");
        humer.getItems().add(firstPosition);
        monitor.getItems().add(secondPosition);
        sope.getItems().add(lastPosition);
        invoice.getItems().add(firstPosition);
        invoice.getItems().add(secondPosition);
        invoice.getItems().add(lastPosition);

        //When
        invoiceDao.save(invoice);
        int invoiceID = invoice.getID();
        itemDao.save(firstPosition);
        int fpID = firstPosition.getID();
        itemDao.save(secondPosition);
        int spID = secondPosition.getID();
        itemDao.save(lastPosition);
        int lpID = lastPosition.getID();
        productDao.save(humer);
        int humerID = humer.getID();
        productDao.save(monitor);
        int monitorID = monitor.getID();
        productDao.save(sope);
        int sopeID = sope.getID();

        //Then
        assertNotEquals(0,invoiceID);
        assertNotEquals(0,fpID);
        assertNotEquals(0,spID);
        assertNotEquals(0,lpID);
        assertNotEquals(0,humerID);
        assertNotEquals(0,monitorID);
        assertNotEquals(0,sopeID);

        //Clean Up
        itemDao.deleteAll();
        invoiceDao.deleteAll();
        productDao.deleteAll();
    }
}
