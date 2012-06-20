package org.overlord.sramp.atom;

import java.net.URI;

public class Constants {

    public static final URI URN_X_S_RAMP         = URIHelper.create("urn:x-s-ramp:2010:type");
    
    public static final String XML_DOCUMENT      = "XML Document";
    
    public static final String XML_DOCUMENT_TERM = "XmlDocument";
    
    public static final String XSD = "xsd";
    public static final String XML = "xml";
    
    
    private static class URIHelper {
        static URI create(String uriStr) {
            try {
                return new URI(uriStr);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        
    }
}