package SAX;

import javax.xml.transform.sax.TransformerHandler;

import org.xml.sax.SAXException;

public class FilterCharacter implements Filter {
	
	private TransformerHandler transformerHandle;
	private char[] ch;
	private int start;
	private int length;
	
	public FilterCharacter(TransformerHandler transformerHandle, char[] ch, int start, int length) {
		this.transformerHandle = transformerHandle;
		this.ch = ch;
		this.start = start;
		this.length = length;
	}
	@Override
	public void add() throws SAXException {
		transformerHandle.characters(ch, start, length);
	}

}
