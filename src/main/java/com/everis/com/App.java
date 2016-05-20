package com.everis.com;

import org.apache.oozie.client.OozieClient;
import org.apache.oozie.client.OozieClientException;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws OozieClientException {

        OozieClient wc = new OozieClient("http://localhost:8080/oozie");
        System.out.println(wc.getJobInfo("0000054-160517162121491-oozie-oozi-W").toString());
    }
}
