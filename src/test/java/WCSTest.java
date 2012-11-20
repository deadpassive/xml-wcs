import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;

import javax.xml.parsers.ParserConfigurationException;

import org.geotools.wcs.WCSConfiguration;
import org.geotools.xml.Parser;
import org.xml.sax.SAXException;

import junit.framework.TestCase;

public class WCSTest extends TestCase {

	public void testWCS() throws IOException, SAXException, ParserConfigurationException {
		String request = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + //
                "<wcs:DescribeCoverage service=\"WCS\" " + //
                "xmlns:ows=\"http://www.opengis.net/ows/1.1\"\r\n" + //
                "  xmlns:wcs=\"http://www.opengis.net/wcs/1.1.1\"\r\n" + //
                "  xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" \r\n" + //
                "  xsi:schemaLocation=\"http://www.opengis.net/wcs/1.1.1 " + //
                "schemas/wcs/1.1.1/wcsAll.xsd\"\r\n" + //
                "  version=\"1.1.1\" >\r\n" + //
                "  <wcs:Identifier>wcs:BlueMarble</wcs:Identifier>\r\n" + //
                "</wcs:DescribeCoverage>";
		StringReader reader = new StringReader(request);
//		InputStream input = getClass().getResourceAsStream("capabilities.xml");
		InputStream input = getClass().getResourceAsStream("capabilities.xml");
		WCSConfiguration configuration = new WCSConfiguration();

		Parser parser = new Parser(configuration);
		parser.setValidating(true);
        parser.setFailOnValidationError(true);
        parser.setStrict(false);
        
		Object result = (Object) parser.parse(reader);

		assertNotNull(result);
	}
}
