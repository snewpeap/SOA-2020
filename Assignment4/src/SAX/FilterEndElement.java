package SAX;

import javax.xml.transform.sax.TransformerHandler;

import org.xml.sax.SAXException;

public class FilterEndElement implements Filter {
	
	private TransformerHandler transformerHandle;
	private String uri;
	private String localName;
	private String qName;
	
	public FilterEndElement(TransformerHandler transformerHandle, String uri, String localName, String qName) {
		this.transformerHandle = transformerHandle;
		this.uri = uri;
		this.localName = localName;
		this.qName = qName;
	}

	@Override
	public void add() throws SAXException {
		transformerHandle.endElement(uri, localName, qName);
	}
}
