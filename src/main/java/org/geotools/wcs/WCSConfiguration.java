package org.geotools.wcs;

import java.util.Map;

import javax.xml.namespace.QName;

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
	
	@Override
	protected void registerBindings(Map bindings) {
		super.registerBindings(bindings);
		
		final EFactory wcsFactory = Wcs111Factory.eINSTANCE;
		register(bindings, wcsFactory, WCS._Capabilities);
	}
	
	private void register(Map bindings, EFactory factory, QName qname) {
        bindings.put(qname, new ComplexEMFBinding(factory, qname));
    }

//	/**
//	 * Registers the bindings for the configuration.
//	 * 
//	 * @generated
//	 */
//	protected final void registerBindings(MutablePicoContainer container) {
//		
//		
		
		// Types
//		container.registerComponentImplementation(WCS.AxisType,
//				AxisTypeBinding.class);
//		container.registerComponentImplementation(WCS.CoverageDescriptionType,
//				CoverageDescriptionTypeBinding.class);
//		container.registerComponentImplementation(WCS.CoverageDomainType,
//				CoverageDomainTypeBinding.class);
//		container.registerComponentImplementation(WCS.CoveragesType,
//				CoveragesTypeBinding.class);
//		container.registerComponentImplementation(WCS.CoverageSummaryType,
//				CoverageSummaryTypeBinding.class);
//		container.registerComponentImplementation(WCS.DomainSubsetType,
//				DomainSubsetTypeBinding.class);
//		container.registerComponentImplementation(WCS.FieldType,
//				FieldTypeBinding.class);
//		container.registerComponentImplementation(WCS.GridCrsType,
//				GridCrsTypeBinding.class);
//		container.registerComponentImplementation(WCS.IdentifierType,
//				IdentifierTypeBinding.class);
//		container.registerComponentImplementation(WCS.ImageCRSRefType,
//				ImageCRSRefTypeBinding.class);
//		container.registerComponentImplementation(
//				WCS.InterpolationMethodBaseType,
//				InterpolationMethodBaseTypeBinding.class);
//		container.registerComponentImplementation(WCS.InterpolationMethodType,
//				InterpolationMethodTypeBinding.class);
//		container.registerComponentImplementation(WCS.OutputType,
//				OutputTypeBinding.class);
//		container.registerComponentImplementation(WCS.RangeSubsetType,
//				RangeSubsetTypeBinding.class);
//		container.registerComponentImplementation(WCS.RangeType,
//				RangeTypeBinding.class);
//		container.registerComponentImplementation(WCS.RequestBaseType,
//				RequestBaseTypeBinding.class);
//		container.registerComponentImplementation(WCS.SpatialDomainType,
//				SpatialDomainTypeBinding.class);
//		container.registerComponentImplementation(WCS.TimeDurationType,
//				TimeDurationTypeBinding.class);
//		container.registerComponentImplementation(WCS.TimePeriodType,
//				TimePeriodTypeBinding.class);
//		container.registerComponentImplementation(WCS.TimeSequenceType,
//				TimeSequenceTypeBinding.class);
//		container.registerComponentImplementation(WCS._AvailableKeys,
//				_AvailableKeysBinding.class);
//		container.registerComponentImplementation(WCS._AxisSubset,
//				_AxisSubsetBinding.class);
//		container.registerComponentImplementation(WCS._Capabilities,
//				_CapabilitiesBinding.class);
//		container.registerComponentImplementation(WCS._Contents,
//				_ContentsBinding.class);
//		container.registerComponentImplementation(WCS._CoverageDescriptions,
//				_CoverageDescriptionsBinding.class);
//		container.registerComponentImplementation(WCS._DescribeCoverage,
//				_DescribeCoverageBinding.class);
//		container.registerComponentImplementation(WCS._GetCapabilities,
//				_GetCapabilitiesBinding.class);
//		container.registerComponentImplementation(WCS._GetCoverage,
//				_GetCoverageBinding.class);
//		container.registerComponentImplementation(WCS._InterpolationMethods,
//				_InterpolationMethodsBinding.class);
//		container.registerComponentImplementation(
//				WCS.RangeSubsetType_FieldSubset,
//				RangeSubsetType_FieldSubsetBinding.class);

//	}
}