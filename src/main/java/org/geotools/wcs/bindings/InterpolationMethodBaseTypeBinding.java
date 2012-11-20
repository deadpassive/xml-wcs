package org.geotools.wcs.bindings;


import org.geotools.xml.*;
import org.geotools.xml.AbstractComplexBinding;

import net.opengis.wcs11.Wcs111Factory;		

import javax.xml.namespace.QName;

/**
 * Binding object for the type http://www.opengis.net/wcs/1.1.1:InterpolationMethodBaseType.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;complexType name="InterpolationMethodBaseType"&gt;
 *      &lt;annotation&gt;
 *          &lt;documentation&gt;Identifier of an interpolation method applicable to continuous grid coverages. The string in this type shall be one interpolation type identifier string, selected from the referenced dictionary. &lt;/documentation&gt;
 *          &lt;documentation&gt;Adapts gml:CodeWithAuthorityType from GML 3.2 for this WCS purpose, allowing the codeSpace to be omitted but providing a default value for the standard interpolation methods defined in Annex C of ISO 19123: Geographic information - Schema for coverage geometry and functions. &lt;/documentation&gt;
 *      &lt;/annotation&gt;
 *      &lt;simpleContent&gt;
 *          &lt;restriction base="ows:CodeType"&gt;
 *              &lt;attribute
 *                  default="http://schemas.opengis.net/wcs/1.1.0/interpolationMethods.xml"
 *                  name="codeSpace" type="anyURI" use="optional"&gt;
 *                  &lt;annotation&gt;
 *                      &lt;documentation&gt;Reference to a dictionary that specifies allowed values for interpolation method identifier strings and nullResistance identifier strings. This reference defaults to the standard interpolation methods dictionary specified in WCS 1.1.0. &lt;/documentation&gt;
 *                  &lt;/annotation&gt;
 *              &lt;/attribute&gt;
 *          &lt;/restriction&gt;
 *      &lt;/simpleContent&gt;
 *  &lt;/complexType&gt; 
 *		
 *	  </code>
 *	 </pre>
 * </p>
 *
 * @generated
 */
public class InterpolationMethodBaseTypeBinding extends AbstractComplexBinding {

	Wcs111Factory factory;		
	public InterpolationMethodBaseTypeBinding( Wcs111Factory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return WCS.InterpolationMethodBaseType;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *	
	 * @generated modifiable
	 */	
	public Class getType() {
		return null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *	
	 * @generated modifiable
	 */	
	public Object parse(ElementInstance instance, Node node, Object value) 
		throws Exception {
		
		//TODO: implement and remove call to super
		return super.parse(instance,node,value);
	}

}