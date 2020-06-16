package tester;

import client.InvalidDataFault;

import javax.xml.soap.SOAPFault;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.soap.SOAPFaultException;

public class FaultUtil {
    public static void handleSOAPFault(SOAPFaultException soapFaultException) {
        System.out.println("Unmapped Exception (SOAPFaultException)");
        SOAPFault sf = soapFaultException.getFault();
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.transform(new DOMSource(sf), new StreamResult(System.out));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    public static void handleInvalidDataFault(InvalidDataFault invalidDataFault) {
        System.out.println("Mapped Exception (InvalidDataFault)");
        System.out.println("InputFault.getMessage() =");
        System.out.println(invalidDataFault.getMessage());
        System.out.println("InputFault.getFaultInfo() =");
        System.out.println(invalidDataFault.getFaultInfo());
        System.out.println();
    }
}
