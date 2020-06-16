package client.handler;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Set;

public class AddMessageIdHandler implements SOAPHandler<SOAPMessageContext> {
    public static final QName MSGID_HEADER = new QName("http://www.nju.edu.cn/soap", "msgid");
    public static final String MSGID_PROP = "persistence.msgid";
    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        String msgId = (String) context.get(MSGID_PROP);
        System.out.println("Entered AddMessageIdHandler.handleMessage. msgId = " +
                msgId);
        //  return if inbound message
        if ( !(Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY)) { return true; }
        if ( msgId == null ) {
            System.out.println("Message ID context property is null.");
            return false;
        }
        SOAPMessage msg = context.getMessage();
        SOAPHeader hdr;
        try {
            hdr = msg.getSOAPHeader();
            if ( hdr == null ) {
                hdr = msg.getSOAPPart().getEnvelope().addHeader();
            }
            SOAPHeaderElement msgIdElement = hdr.addHeaderElement(MSGID_HEADER);
            msgIdElement.setAttribute("id", msgId);
        } catch (SOAPException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return false;
    }

    @Override
    public void close(MessageContext context) {

    }
}
