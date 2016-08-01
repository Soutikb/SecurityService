package com.service.generic.GlobalStructure;

import java.io.File;
import java.io.IOException;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import org.w3c.dom.*; 
import javax.xml.parsers.*; 
import javax.xml.transform.*; 
import javax.xml.transform.dom.*; 
import javax.xml.transform.stream.*; 

public class GenericMethodology {
	
	public static String role1 = null;
	public static String role2 = null;
	public static String role3 = null;
	public static String role4 = null;
	public static ArrayList<String> rolev;

	public GenericMethodology() {
		// TODO Auto-generated constructor stub
	}
    private String StringCorrection(String paramval)
    {
    	String sb = paramval.replace("\\", "");
    	String strret = sb.replace("/","");
    	return strret;
    }

    public String Findandreplacescript(String paraminput)
    {
    	
    	String sb = StringCorrection(paraminput);
    	StringBuilder s = new StringBuilder(sb.length());

    	CharacterIterator it = new StringCharacterIterator(sb);
    	for (char ch = it.first(); ch != CharacterIterator.DONE; ch = it.next()) {
    	    switch (ch) {
    	        case '&':
    	            s.append("&amp;");
    	            break;
    	        case '<':
    	            s.append("&lt;");
    	            break;
    	        case '>':
    	            s.append("&gt;");
    	            break;
    	        case '\n': 
    	        	s.append("<br/>"); 
    	        	break; //newline 
    	        case '/' :
    	        	s.append("&sl");
    	        	break;
    	        case '\r': 
    	        	s.append(" ");
    	        	 break; 
    	        default:
    	            s.append(ch);
    	            break;
    	    }
    	}

    	String rtStr= s.toString();
    	return rtStr;
    }
    public String FindandreplaceSpecialCase(String paraminput)
    {
    	StringBuilder sb = new StringBuilder(paraminput.length());

    	CharacterIterator it = new StringCharacterIterator(paraminput);
    	for (char ch = it.first(); ch != CharacterIterator.DONE; ch = it.next()) {
    	    switch (ch) {
	        case 38:sb.append("&amp;"); break; //& 
	        case 198:sb.append("&AElig;"); break; //� 
	        case 193:sb.append("&Aacute;"); break; //� 
	        case 194:sb.append("&Acirc;"); break; //� 
	        case 192:sb.append("&Agrave;"); break; //� 
	        case 197:sb.append("&Aring;"); break; //� 
	        case 195:sb.append("&Atilde;"); break; //� 
	        case 196:sb.append("&Auml;"); break; //� 
	        case 199:sb.append("&Ccedil;"); break; //� 
	        case 208:sb.append("&ETH;"); break; //� 
	        case 201:sb.append("&Eacute;"); break; //� 
	        case 202:sb.append("&Ecirc;"); break; //� 
	        case 200:sb.append("&Egrave;"); break; //� 
	        case 203:sb.append("&Euml;"); break; //� 
	        case 205:sb.append("&Iacute;"); break; //� 
	        case 206:sb.append("&Icirc;"); break; //� 
	        case 204:sb.append("&Igrave;"); break; //� 
	        case 207:sb.append("&Iuml;"); break; //� 
	        case 209:sb.append("&Ntilde;"); break; //� 
	        case 211:sb.append("&Oacute;"); break; //� 
	        case 212:sb.append("&Ocirc;"); break; //� 
	        case 210:sb.append("&Ograve;"); break; //� 
	        case 216:sb.append("&Oslash;"); break; //� 
	        case 213:sb.append("&Otilde;"); break; //� 
	        case 214:sb.append("&Ouml;"); break; //� 
	        case 222:sb.append("&THORN;"); break; //� 
	        case 218:sb.append("&Uacute;"); break; //� 
	        case 219:sb.append("&Ucirc;"); break; //� 
	        case 217:sb.append("&Ugrave;"); break; //� 
	        case 220:sb.append("&Uuml;"); break; //� 
	        case 221:sb.append("&Yacute;"); break; //� 
	        case 225:sb.append("&aacute;"); break; //� 
	        case 226:sb.append("&acirc;"); break; //� 
	        case 230:sb.append("&aelig;"); break; //� 
	        case 224:sb.append("&agrave;"); break; //� 
	        case 229:sb.append("&aring;"); break; //� 
	        case 227:sb.append("&atilde;"); break; //� 
	        case 228:sb.append("&auml;"); break; //� 
	        case 231:sb.append("&ccedil;"); break; //� 
	        case 233:sb.append("&eacute;"); break; //� 
	        case 234:sb.append("&ecirc;"); break; //� 
	        case 232:sb.append("&egrave;"); break; //� 
	        case 240:sb.append("&eth;"); break; //� 
	        case 235:sb.append("&euml;"); break; //� 
	        case 237:sb.append("&iacute;"); break; //� 
	        case 238:sb.append("&icirc;"); break; //� 
	        case 236:sb.append("&igrave;"); break; //� 
	        case 239:sb.append("&iuml;"); break; //� 
	        case 241:sb.append("&ntilde;"); break; //� 
	        case 243:sb.append("&oacute;"); break; //� 
	        case 244:sb.append("&ocirc;"); break; //� 
	        case 242:sb.append("&ograve;"); break; //� 
	        case 248:sb.append("&oslash;"); break; //� 
	        case 245:sb.append("&otilde;"); break; //� 
	        case 246:sb.append("&ouml;"); break; //� 
	        case 223:sb.append("&szlig;"); break; //� 
	        case 254:sb.append("&thorn;"); break; //� 
	        case 250:sb.append("&uacute;"); break; //� 
	        case 251:sb.append("&ucirc;"); break; //� 
	        case 249:sb.append("&ugrave;"); break; //� 
	        case 252:sb.append("&uuml;"); break; //� 
	        case 253:sb.append("&yacute;"); break; //� 
	        case 255:sb.append("&yuml;"); break; //� 
	        case 162:sb.append("&cent;"); break; //� 
	        default:  sb.append(ch); break;
    	    }
    	}
    	String rtStr= sb.toString();
    	return rtStr;
    }
	public boolean XmlSettingRead(String xml)
	{
		
		rolev = new ArrayList<String>();
        Document dom;
        // Make an  instance of the DocumentBuilderFactory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            // use the factory to take an instance of the document builder
            DocumentBuilder db = dbf.newDocumentBuilder();
            // parse using the builder to get the DOM mapping of the    
            // XML file
            dom = db.parse(xml);

            Element doc = dom.getDocumentElement();

            role1 = getTextValue(role1, doc, "role1");
            if (role1 != null) {
                if (!role1.isEmpty())
                    rolev.add(role1);
            }
            System.out.println("Role 1 is :"+role1);
            role2 = getTextValue(role2, doc, "role2");
            if (role2 != null) {
                if (!role2.isEmpty())
                    rolev.add(role2);
            }
            System.out.println("Role 1 is :"+role2);
            role3 = getTextValue(role3, doc, "role3");
            if (role3 != null) {
                if (!role3.isEmpty())
                    rolev.add(role3);
            }
            role4 = getTextValue(role4, doc, "role4");
            if ( role4 != null) {
                if (!role4.isEmpty())
                    rolev.add(role4);
            }
            return true;

        } catch (ParserConfigurationException pce) {
            System.out.println(pce.getMessage());
        } catch (SAXException se) {
            System.out.println(se.getMessage());
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }

        return false;
    }
	private static String getTextValue(String def, Element doc, String tag) {
	    String value = def;
	    NodeList nl;
	    nl = doc.getElementsByTagName(tag);
	    if (nl.getLength() > 0 && nl.item(0).hasChildNodes()) {
	        value = nl.item(0).getFirstChild().getNodeValue();
	    }
	    return value;
	}	
	public String AppendtoXml(String role1,String role2,String role3,String role4)throws IOException,
    	ParserConfigurationException, TransformerException, SAXException
	{
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
	            .newInstance();
	        DocumentBuilder documentBuilder = documentBuilderFactory
	            .newDocumentBuilder();
	        Document document = documentBuilder.newDocument();

	    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); 
        dbf.setValidating(false); 
        DocumentBuilder db = dbf.newDocumentBuilder(); 
        Document doc = db.parse("D:\\Security_Services\\web.xml"); 
        Element element = doc.getDocumentElement();
        
        Element root = doc.getDocumentElement();
        Element server1 = doc.createElement("server1");
        root.appendChild(server1);
        
        Element child = doc.createElement("hostdetails"); 
        root.appendChild(child); 

        Element child1 = doc.createElement("session-cofig"); 
        child.appendChild(child1); 


        Element child2 = doc.createElement("cookie-config"); 
        child.appendChild(child2); 

        Element child3 = doc.createElement("http-only"); 
        child.appendChild(child3); 

        Text text3 = doc.createTextNode("true"); 
        child3.appendChild(text3); 

/*        Element child4 = doc.createElement("hostport"); 
        child.appendChild(child4); 

        Text text4 = doc.createTextNode(hostport); 
        child4.appendChild(text4); 

        Element child5 = doc.createElement("channel"); 
        child.appendChild(child5); 

        Text text5 = doc.createTextNode(channel); 
        child4.appendChild(text5); 
*/
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult console = new StreamResult(System.out);//for Console print
        transformer.transform(source, console);
        StreamResult file = new StreamResult(new File("D:\\Security_Services\\web.xml"));
        transformer.transform(source, file);
        return "";
	}

}