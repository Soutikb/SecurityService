package com.service.generic.distrib;


import javax.persistence.EntityNotFoundException;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.xml.sax.*;
import org.w3c.dom.*;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;

import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.ws.http.HTTPException;

import com.service.generic.GlobalStructure.*;

@SuppressWarnings("unused")
@Path("/cfs")
public class CFOCSSServices {
	
	private static char[] hex={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
	
	

	@GET
	@Path("XmlConfig")
	@Produces("application/xml")
	public static String XmlConfiguration() throws IOException, ParserConfigurationException, TransformerException, SAXException
	{
		GenericMethodology objMethod = new GenericMethodology();
		objMethod.XmlSettingRead("D:\\Security_Services\\Modules\\SecurityServices\\Settings.xml");
		String strReturn = objMethod.AppendtoXml("A","B","C","D");
		return "<return>"+"Added"+"</return>" ;
	}
	@GET
	@Path("Pass1/{strTxtString}")
	@Produces(MediaType.TEXT_PLAIN)
	public static String PassString_1(@PathParam("strTxtString") String strTxtString)
	{
		GenericMethodology objMethod = new GenericMethodology();
		String StrReturn   = objMethod.Findandreplacescript(strTxtString);
		System.out.println(StrReturn);
		return StrReturn;
	}
	  @GET
	  @Path("Pass2/{strvalue}")
	  @Produces(MediaType.TEXT_PLAIN)
	  public static String PassString_2(@PathParam("strvalue") String strvalue)
	  {
			GenericMethodology objMethod = new GenericMethodology();
			String StrReturn   = objMethod.FindandreplaceSpecialCase(strvalue);
			return StrReturn;
	  }
}
