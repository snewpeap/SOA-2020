package client.handler;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Set;

public class PersistMessageHandler implements SOAPHandler<SOAPMessageContext> {
    public static final String PERSISTENCE_DIR_PROP = "persistence.dir";
    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        System.out.println("Entered PersistMessageHandler.handleMessage");
        //  return if inbound message
        if ( !(Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY)) { return true; }
        SOAPMessage msg = context.getMessage();
        File persistenceDir = new File((String) context.get(PERSISTENCE_DIR_PROP));
        Iterator itr;
        try {
            itr = msg.getSOAPHeader().examineAllHeaderElements();
            String msgId = null;
            while (itr.hasNext() && msgId == null) {
                SOAPHeaderElement headerElt = (SOAPHeaderElement) itr.next();
                QName headerQName = headerElt.getElementQName();
                if (headerQName.equals(AddMessageIdHandler.MSGID_HEADER)) {
                    msgId = headerElt.getAttribute("id");
                }
            }
            if ( msgId == null ) {
                System.out.println("No message ID header.");
                return false;
            }
            File msgFile = new File(persistenceDir, msgId + "-" + System.currentTimeMillis() +".xml");
            msgFile.createNewFile();
            msg.writeTo(new FileOutputStream(msgFile));
        } catch (Exception e) {
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
