package jms;

import java.util.Scanner;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.jms.JMSContext;

import javax.naming.NamingException;


public class MessageProducer {
    public static void main(String[] args) throws NamingException{
        Context ctx = new InitialContext();
        ConnectionFactory cf = (ConnectionFactory) ctx.lookup("jms/javaee7/ConnectionFactory");
        Destination topic = (Destination) ctx.lookup("jms/javaee7/Topic");
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci id negozio");
        int id = in.nextInt();
         System.out.println("Inserisci nuove vendite effettuate");//Aggiunto sysout
        int vend= in.nextInt();
        UpdateMess mess = new UpdateMess(vend,id);
        try(JMSContext jmsContext = cf.createContext())
        {
            jmsContext.createProducer().send(topic,mess);
        }
    }
    
}

