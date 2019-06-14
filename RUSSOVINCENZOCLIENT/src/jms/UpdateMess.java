/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jms;

import java.io.Serializable;


public class UpdateMess implements Serializable{
    
    public static final long serialVersionUID = 1L;

    private int vendite;
    private int id;
    
    public  UpdateMess(){}

    public UpdateMess(int vendite, int id) {
        this.vendite = vendite;
        this.id = id;
    }

    public int getVendite() {
        return vendite;
    }

    public int getId() {
        return id;
    }

    public void setVendite(int vendite) {
        this.vendite = vendite;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
