package SAX;

import javax.xml.transform.sax.TransformerHandler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public class FilterStartElement implements Filter {
	
	private TransformerHandler transformerHandle;
	private String uri;
	private String localName;
	private String qName;
	private Attributes atts;
	
	public FilterStartElement(TransformerHandler transformerHandle, String uri, String localName, String qName, Attributes attributes) {
		this.transformerHandle = transformerHandle;
		this.uri = uri;
		this.localName = localName;
		this.qName = qName;
		this.atts = attributes;
	}

	@Override
	public void add() throws SAXException {
		transformerHandle.startElement(uri, localName, qName, atts);
	}
}
