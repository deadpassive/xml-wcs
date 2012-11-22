package org.geotools.wcs;

import java.util.Map;

import javax.xml.namespace.QName;
import net.opengis.wcs11.CapabilitiesType;
import net.opengis.wcs11.ContentsType;
import net.opengis.wcs11.CoverageSummaryType;

import net.opengis.wcs11.Wcs111Factory;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.xsd.util.XSDSchemaLocationResolver;
import org.geotools.gml3.GMLConfiguration;
import org.geotools.ows.v1_1.OWSConfiguration;
import org.geotools.wcs.bindings.AxisTypeBinding;
import org.geotools.wcs.bindings.CoverageDescriptionTypeBinding;
import org.geotools.wcs.bindings.CoverageDomainTypeBinding;
import org.geotools.wcs.bindings.CoverageSummaryTypeBinding;
import org.geotools.wcs.bindings.CoveragesTypeBinding;
import org.geotools.wcs.bindings.DomainSubsetTypeBinding;
import org.geotools.wcs.bindings.FieldTypeBinding;
import org.geotools.wcs.bindings.GridCrsTypeBinding;
import org.geotools.wcs.bindings.IdentifierTypeBinding;
import org.geotools.wcs.bindings.ImageCRSRefTypeBinding;
import org.geotools.wcs.bindings.InterpolationMethodBaseTypeBinding;
import org.geotools.wcs.bindings.InterpolationMethodTypeBinding;
import org.geotools.wcs.bindings.OutputTypeBinding;
import org.geotools.wcs.bindings.RangeSubsetTypeBinding;
import org.geotools.wcs.bindings.RangeSubsetType_FieldSubsetBinding;
import org.geotools.wcs.bindings.RangeTypeBinding;
import org.geotools.wcs.bindings.RequestBaseTypeBinding;
import org.geotools.wcs.bindings.SpatialDomainTypeBinding;
import org.geotools.wcs.bindings.TimeDurationTypeBinding;
import org.geotools.wcs.bindings.TimePeriodTypeBinding;
import org.geotools.wcs.bindings.TimeSequenceTypeBinding;
import org.geotools.wcs.bindings._AvailableKeysBinding;
import org.geotools.wcs.bindings._AxisSubsetBinding;
import org.geotools.wcs.bindings._CapabilitiesBinding;
import org.geotools.wcs.bindings._ContentsBinding;
import org.geotools.wcs.bindings._CoverageDescriptionsBinding;
import org.geotools.wcs.bindings._DescribeCoverageBinding;
import org.geotools.wcs.bindings._GetCapabilitiesBinding;
import org.geotools.wcs.bindings._GetCoverageBinding;
import org.geotools.wcs.bindings._InterpolationMethodsBinding;
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

    protected void configureContext(MutablePicoContainer context) {
        context.registerComponentInstance(Wcs111Factory.eINSTANCE);
    }

    protected void registerBindings(Map bindings) {
        super.registerBindings(bindings);

        final Wcs111Factory wcsFactory = Wcs111Factory.eINSTANCE;
        register(bindings, wcsFactory, WCS.Capabilities, CapabilitiesType.class);
        bindings.put(WCS.Contents, new _ContentsBinding(wcsFactory));
//        register(bindings, wcsFactory, WCS.Contents, ContentsType.class);
        register(bindings, wcsFactory, WCS.CoverageSummaryType);
        
    }

    private void register(Map bindings, EFactory factory, QName qname) {
        bindings.put(qname, new ComplexEMFBinding(factory, qname));
    }
    
    private void register(Map bindings, EFactory factory, QName qname, Class clazz) {
        bindings.put(qname, new ComplexEMFBinding(factory, qname, clazz));
    }
}