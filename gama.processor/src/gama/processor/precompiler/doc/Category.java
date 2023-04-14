/*******************************************************************************************************
 *
 * Category.java, in msi.gama.processor, is part of the source code of the
 * GAMA modeling and simulation platform (v.1.9.0).
 *
 * (c) 2007-2022 UMI 209 UMMISCO IRD/SU & Partners (IRIT, MIAT, TLU, CTU)
 *
 * Visit https://github.com/gama-platform/gama for license information and contacts.
 * 
 ********************************************************************************************************/
package gama.processor.precompiler.doc;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import gama.annotations.precompiler.doc.utils.XMLElements;

/**
 * The Class Category.
 */
public class Category implements IElement {

	/** The doc. */
	Document doc;
	
	/** The id category. */
	String idCategory;
	
	/**
	 * Instantiates a new category.
	 *
	 * @param _doc the doc
	 * @param id the id
	 */
	public Category(Document _doc, String id){
		doc = _doc;
		idCategory = id;
	}
	
	@Override
	public Element getElementDOM() {
		Element eltCat = doc.createElement(XMLElements.CATEGORY);
		eltCat.setAttribute("id", idCategory);
		return eltCat;
	}

}
