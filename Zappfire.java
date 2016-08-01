package com.secure.zapclient.proxysetting;
import java.io.FileOutputStream;

import java.io.IOException;

import java.io.UnsupportedEncodingException;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.zaproxy.clientapi.core.Alert;
import org.zaproxy.clientapi.core.ApiResponse;

import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApi.*;
import org.zaproxy.clientapi.core.ClientApiException;


public class Zappfire {

	public Zappfire() {
		// TODO Auto-generated constructor stub
		super();
		ClientApi zapClientAPI = new ClientApi("localhost", 8089);
	}
    private static final String API_KEY = "null";

    public String url="http://localhost:8080/SecureApplicationClient/ClientConferenceBooking.jsp";

    public HashMap spider(String m_urlAttack) throws ClientApiException, InterruptedException, IOException {
    	final ClientApi clientApi=new ClientApi("localhost",8079);
    	String apikey="test";
    	url=m_urlAttack;
    	HashMap m_Map = new HashMap();

    	  System.out.println("Accessing target: " + url);
    	  clientApi.accessUrl(url);
    	  System.out.println("-------Running Spider-----");
    	  //clientApi.ascan.scan(url, "false", "true",null,null,null,null);
    	  ApiResponse resp = clientApi.spider.scans();
    	  //ApiResponse resp2 = clientApi.spider.scan(url,"","","",null);
    	  System.out.println("Sleep for 10 sec, to  record URL to find vulnerabilities");
    	  Thread.sleep(10000);
    	  List<Alert> alert=clientApi.getAlerts("",0,100);
    	  int i=0;
    	  for (Iterator iterator=alert.iterator(); iterator.hasNext(); ) {
    		    Alert alert2 = (Alert)iterator.next();
    		    i++;
    		    m_Map.put(i,"-----Alert is-----" + alert2.getAlert());
    		    i++;
    		    m_Map.put(i,"URL is::  " + alert2.getUrl());
    		    i++;
    		    m_Map.put(i,"Risk is::  " + alert2.getRisk());
/*    		    System.out.println();
    		    System.out.println();
    		    System.out.println();
*/    		  }
    		  System.out.println("Shutdown ZAP.");
    		  //clientApi.core.shutdown("");
    		  return m_Map;
    	 }
}
