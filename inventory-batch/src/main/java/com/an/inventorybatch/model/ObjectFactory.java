//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.03 at 11:48:48 AM EDT 
//


package com.an.inventorybatch.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.an.inventorybatch.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Item_QNAME = new QName("", "Item");
    private final static QName _Items_QNAME = new QName("", "Items");
    private final static QName _Inventory_QNAME = new QName("", "Inventory");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.an.inventorybatch.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link Items }
     * 
     */
    public Items createItems() {
        return new Items();
    }

    /**
     * Create an instance of {@link Inventory }
     * 
     */
    public Inventory createInventory() {
        return new Inventory();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Item")
    public JAXBElement<Item> createItem(Item value) {
        return new JAXBElement<Item>(_Item_QNAME, Item.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Items }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Items")
    public JAXBElement<Items> createItems(Items value) {
        return new JAXBElement<Items>(_Items_QNAME, Items.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Inventory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Inventory")
    public JAXBElement<Inventory> createInventory(Inventory value) {
        return new JAXBElement<Inventory>(_Inventory_QNAME, Inventory.class, null, value);
    }

}