
public class XMLProcessor {

	private IXMLSource xml;

	public XMLProcessor(IXMLSource xml) {
		this.xml = xml;
	}
	
	public void Process() {
		String data = this.xml.read();
		// Compute XML
	}
}
