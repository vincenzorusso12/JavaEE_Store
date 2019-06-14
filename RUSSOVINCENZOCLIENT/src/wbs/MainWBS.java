/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wbs;


public class MainWBS {//Cambiato nome classe
    
    //Aggiunto try catch
    
    //Tipo di ritorno cambiato da List<Negozio> a String
    
    //rimosso il for
    
   public static void main(String[] args){
    try{
        String s=stampaTutti();
        System.out.println(s);
    }catch (Exception ex)
        {
        System.out.println("Exception: " + ex);
    }
        
        
    }

    private static String stampaTutti() {
        wbs.NegozioWBS_Service service = new wbs.NegozioWBS_Service();
        wbs.NegozioWBS port = service.getNegozioWBSPort();
        return port.stampaTutti();
    }

   
    

 

    
    
    
    
    
}
