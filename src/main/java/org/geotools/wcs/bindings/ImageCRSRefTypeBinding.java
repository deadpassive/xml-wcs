package org.geotools.wcs.bindings;


import org.geotools.wcs.WCS;
import org.geotools.xml.*;

import net.opengis.wcs11.Wcs111Factory;		

import javax.xml.namespace.QName;

/**
 * Binding object for the type http://www.opengis.net/wcs/1.1.1:ImageCRSRefType.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;complexType name="ImageCRSRefType"&gt;
 *      &lt;annotation&gt;
 *          &lt;documentation&gt;Association to an image coordinate reference system, either referencing or containing the definition of that reference system. &lt;/documentation&gt;
 *      &lt;/annotation&gt;
 *      &lt;sequence&gt;
 *          &lt;element minOccurs="0" ref="gml:ImageCRS"/&gt;
 *      &lt;/sequence&gt;
 *      &lt;attributeGroup ref="gml:AssociationAttributeGroup"/&gt;
 *  &lt;/complexType&gt; 
 *		
 *	  </code>
 *	 </pre>
 * </p>
 *
 * @generated
 */
public class ImageCRSRefTypeBinding extends AbstractComplexBinding {

	Wcs111Factory factory;		
	public ImageCRSRefTypeBinding( Wcs111Factory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return WCS.ImageCRSRefType;
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