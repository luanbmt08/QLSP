/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLSP;

/**
 *
 * @author ADMIN
 */
public class Product {
    String IdPD,NamePD,Catogery,Quantity,Price;
  
    public Product(){
        
    }

    public Product(String IdPD, String NamePD, String Catogery, String Quantity, String Price) {
        this.IdPD = IdPD;
        this.NamePD = NamePD;
        this.Catogery = Catogery;
        this.Quantity = Quantity;
        this.Price = Price;
    }

    public String getIdPD() {
        return IdPD;
    }

    public void setIdPD(String IdPD) {
        this.IdPD = IdPD;
    }

    public String getNamePD() {
        return NamePD;
    }

    public void setNamePD(String NamePD) {
        this.NamePD = NamePD;
    }

    public String getCatogery() {
        return Catogery;
    }

    public void setCatogery(String Catogery) {
        this.Catogery = Catogery;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }
    
}

   