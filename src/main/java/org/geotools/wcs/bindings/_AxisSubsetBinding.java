package org.geotools.wcs.bindings;


import org.geotools.xml.*;
import org.geotools.xml.AbstractComplexBinding;

import net.opengis.wcs11.Wcs111Factory;		

import javax.xml.namespace.QName;

/**
 * Binding object for the type http://www.opengis.net/wcs/1.1.1:_AxisSubset.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;complexType name="_AxisSubset"&gt;
 *      &lt;sequence&gt;
 *          &lt;element ref="wcs:Identifier"&gt;
 *              &lt;annotation&gt;
 *                  &lt;documentation&gt;Identifier of this Axis. This identifier must be unique for this Field. &lt;/documentation&gt;
 *              &lt;/annotation&gt;
 *          &lt;/element&gt;
 *          &lt;element maxOccurs="unbounded" name="Key" type="wcs:IdentifierType"&gt;
 *              &lt;annotation&gt;
 *                  &lt;documentation&gt;Unordered list of (at least one) Key, to be used for selecting values in a range vector field. The Keys within this list shall be unique. TBD. &lt;/documentation&gt;
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
public class _AxisSubsetBinding extends AbstractComplexBinding {

	Wcs111Factory factory;		
	public _AxisSubsetBinding( Wcs111Factory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return WCS._AxisSubset;
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