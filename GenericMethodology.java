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
	        case 198:sb.append("&AElig;"); break; //Æ 
	        case 193:sb.append("&Aacute;"); break; //Á 
	        case 194:sb.append("&Acirc;"); break; //Â 
	        case 192:sb.append("&Agrave;"); break; //À 
	        case 197:sb.append("&Aring;"); break; //Å 
	        case 195:sb.append("&Atilde;"); break; //Ã 
	        case 196:sb.append("&Auml;"); break; //Ä 
	        case 199:sb.append("&Ccedil;"); break; //Ç 
	        case 208:sb.append("&ETH;"); break; //Ð 
	        case 201:sb.append("&Eacute;"); break; //É 
	        case 202:sb.append("&Ecirc;"); break; //Ê 
	        case 200:sb.append("&Egrave;"); break; //È 
	        case 203:sb.append("&Euml;"); break; //Ë 
	        case 205:sb.append("&Iacute;"); break; //Í 
	        case 206:sb.append("&Icirc;"); break; //Î 
	        case 204:sb.append("&Igrave;"); break; //Ì 
	        case 207:sb.append("&Iuml;"); break; //Ï 
	        case 209:sb.append("&Ntilde;"); break; //Ñ 
	        case 211:sb.append("&Oacute;"); break; //Ó 
	        case 212:sb.append("&Ocirc;"); break; //Ô 
	        case 210:sb.append("&Ograve;"); break; //Ò 
	        case 216:sb.append("&Oslash;"); break; //Ø 
	        case 213:sb.append("&Otilde;"); break; //Õ 
	        case 214:sb.append("&Ouml;"); break; //Ö 
	        case 222:sb.append("&THORN;"); break; //Þ 
	        case 218:sb.append("&Uacute;"); break; //Ú 
	        case 219:sb.append("&Ucirc;"); break; //Û 
	        case 217:sb.append("&Ugrave;"); break; //Ù 
	        case 220:sb.append("&Uuml;"); break; //Ü 
	        case 221:sb.append("&Yacute;"); break; //Ý 
	        case 225:sb.append("&aacute;"); break; //á 
	        case 226:sb.append("&acirc;"); break; //â 
	        case 230:sb.append("&aelig;"); break; //æ 
	        case 224:sb.append("&agrave;"); break; //à 
	        case 229:sb.append("&aring;"); break; //å 
	        case 227:sb.append("&atilde;"); break; //ã 
	        case 228:sb.append("&auml;"); break; //ä 
	        case 231:sb.append("&ccedil;"); break; //ç 
	        case 233:sb.append("&eacute;"); break; //é 
	        case 234:sb.append("&ecirc;"); break; //ê 
	        case 232:sb.append("&egrave;"); break; //è 
	        case 240:sb.append("&eth;"); break; //ð 
	        case 235:sb.append("&euml;"); break; //ë 
	        case 237:sb.append("&iacute;"); break; //í 
	        case 238:sb.append("&icirc;"); break; //î 
	        case 236:sb.append("&igrave;"); break; //ì 
	        case 239:sb.append("&iuml;"); break; //ï 
	        case 241:sb.append("&ntilde;"); break; //ñ 
	        case 243:sb.append("&oacute;"); break; //ó 
	        case 244:sb.append("&ocirc;"); break; //ô 
	        case 242:sb.append("&ograve;"); break; //ò 
	        case 248:sb.append("&oslash;"); break; //ø 
	        case 245:sb.append("&otilde;"); break; //õ 
	        case 246:sb.append("&ouml;"); break; //ö 
	        case 223:sb.append("&szlig;"); break; //ß 
	        case 254:sb.append("&thorn;"); break; //þ 
	        case 250:sb.append("&uacute;"); break; //ú 
	        case 251:sb.append("&ucirc;"); break; //û 
	        case 249:sb.append("&ugrave;"); break; //ù 
	        case 252:sb.append("&uuml;"); break; //ü 
	        case 253:sb.append("&yacute;"); break; //ý 
	        case 255:sb.append("&yuml;"); break; //ÿ 
	        case 162:sb.append("&cent;"); break; //¢ 
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