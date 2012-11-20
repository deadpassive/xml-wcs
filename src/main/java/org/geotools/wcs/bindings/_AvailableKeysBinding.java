package org.geotools.wcs.bindings;


import org.geotools.wcs.WCS;
import org.geotools.xml.*;

import net.opengis.wcs11.Wcs111Factory;		

import javax.xml.namespace.QName;

/**
 * Binding object for the type http://www.opengis.net/wcs/1.1.1:_AvailableKeys.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;complexType name="_AvailableKeys"&gt;
 *      &lt;sequence&gt;
 *          &lt;element maxOccurs="unbounded" name="Key" type="wcs:IdentifierType"&gt;
 *              &lt;annotation&gt;
 *                  &lt;documentation&gt;Valid key value for this axis. There will normally be more than one key value for an axis, but one is allowed for special circumstances. &lt;/documentation&gt;
 *              &lt;/annotation&gt;
 *          &lt;/element&gt;
 *      &lt;/sequence&gt;
 *  &lt;/complexType&gt; 
 *		
 *	  </code>
 *	 </pre>
 * </p>
 *
 * @generated
 */
public class _AvailableKeysBinding extends AbstractComplexBinding {

	Wcs111Factory factory;		
	public _AvailableKeysBinding( Wcs111Factory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return WCS._AvailableKeys;
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