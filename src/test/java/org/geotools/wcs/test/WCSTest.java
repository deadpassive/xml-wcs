package org.geotools.wcs.test;

import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.ParserConfigurationException;
import junit.framework.TestCase;
import org.geotools.wcs.WCSConfiguration;
import org.geotools.xml.Configuration;
import org.geotools.xml.Parser;
import org.xml.sax.SAXException;

public class WCSTest extends TestCase {

    public void testWCS() throws IOException, SAXException, ParserConfigurationException {
        InputStream input = getClass().getResourceAsStream("exampleCoverageDescription2.xml");
        Configuration configuration = new WCSConfiguration();

        Parser parser = new Parser(configuration);
        Object result = (Object) parser.parse(input);

        assertNotNull(result);
    }
}
