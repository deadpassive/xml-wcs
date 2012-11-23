package org.geotools.wcs;

import java.util.Map;
import javax.xml.namespace.QName;
import net.opengis.ows11.Ows11Factory;
import net.opengis.ows11.WGS84BoundingBoxType;
import net.opengis.wcs11.CapabilitiesType;
import net.opengis.wcs11.ContentsType;
import net.opengis.wcs11.CoverageSummaryType;
import net.opengis.wcs11.Wcs111Factory;
import org.eclipse.emf.ecore.EFactory;
import org.geotools.gml3.GMLConfiguration;
import org.geotools.ows.bindings.BoundingBoxTypeBinding;
import org.geotools.ows.bindings.WGS84BoundingBoxTypeBinding;
import org.geotools.ows.v1_1.OWS;
import org.geotools.ows.v1_1.OWSConfiguration;
import org.geotools.wcs.bindings._ContentsBinding;
import org.geotools.xml.ComplexEMFBinding;
import org.geotools.xml.Configuration;
import org.picocontainer.MutablePicoContainer;

/**
 * Parser configuration for the http://www.opengis.net/wcs/1.1.1 schema.
 *
 * @generated
 */
public class WCSConfiguration extends Configuration {

    /**
     * Creates a new configuration.
     *
     * @generated
     */
    public WCSConfiguration() {
        super(WCS.getInstance());

        addDependency(new GMLConfiguration());
        addDependency(new OWSConfiguration());
    }

    @Override
    protected void configureContext(MutablePicoContainer context) {
        context.registerComponentInstance(Wcs111Factory.eINSTANCE);
    }

    @Override
    protected void registerBindings(Map bindings) {
        super.registerBindings(bindings);

        final Wcs111Factory wcsFactory = Wcs111Factory.eINSTANCE;
        register(bindings, wcsFactory, WCS._Capabilities, CapabilitiesType.class);
        bindings.put(WCS._Contents, new _ContentsBinding(wcsFactory));
        register(bindings, wcsFactory, WCS.CoverageSummaryType);
    }

    private void register(Map bindings, EFactory factory, QName qname) {
        bindings.put(qname, new ComplexEMFBinding(factory, qname));
    }
    
    private void register(Map bindings, EFactory factory, QName qname, Class clazz) {
        bindings.put(qname, new ComplexEMFBinding(factory, qname, clazz));
    }
}