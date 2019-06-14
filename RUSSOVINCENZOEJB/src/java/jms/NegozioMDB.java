/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jms;

import archivio.Negozio;
import archivio.NegozioEJB;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;


@MessageDriven(
        activationConfig = {//Rimosso name= 
        @ActivationConfigProperty(propertyName = "clientId", propertyValue = "jms/javaee7/Topic")
    ,
        @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/javaee7/Topic")
    ,                                           /*ex destinationName*/
        @ActivationConfigProperty(propertyName = "subscriptionDurability", propertyValue = "Durable")
    ,                                                                                       /*ex true*/
        @ActivationConfigProperty(propertyName = "subscriptionName", propertyValue = "jms/javaee7/Topic")
    ,
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic")
})
public class NegozioMDB implements MessageListener {
    
     @EJB
    private NegozioEJB ejb;
    
    public NegozioMDB() {//Aggiunto costruttore
    }
    
    @Override
    public void onMessage(Message message) {
            
         try{
            
            UpdateMess mess = message.getBody(UpdateMess.class);
            Negozio n = ejb.findById(mess.getId());
            int tot= n.getVenditeCurr()+mess.getVendite();
            n.setVenditeCurr(tot);
            ejb.updateNegozio(n);
            System.out.println("valore aggiornato :)  "+ tot);
        }
        
        catch(JMSException e){ //Aggiunto catch
            e.printStackTrace(); 

        }
            
    }
    
}
