/*
 *  This file is part of the docx4j-ImportXHTML library.
 *
 *  Copyright 2011-2013, Plutext Pty Ltd, and contributors.
 *  Portions contributed before 15 July 2013 formed part of docx4j 
 *  and were contributed under ASL v2 (a copy of which is incorporated
 *  herein by reference and applies to those portions). 
 *   
 *  This library as a whole is licensed under the GNU Lesser General 
 *  Public License as published by the Free Software Foundation; 
    version 2.1.
    
    This library is free software; you can redistribute it and/or
    modify it under the terms of the GNU Lesser General Public
    License as published by the Free Software Foundation; either
    version 2.1 of the License, or (at your option) any later version.

    This library is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public
    License along with this library (see legals/LICENSE); if not, 
    see http://www.gnu.org/licenses/lgpl-2.1.html
    
 */
package org.pptx4j.convert.in.xhtml;

import java.util.Map;

import org.pptx4j.pml.Shape;
import org.w3c.dom.css.CSSValue;

public class TraversalSettings implements Cloneable {
    
    private Map<String, CSSValue> cssMap;
    
    private String hyperlink;

    private boolean inTableCell;
    
    private Shape paragraphShape;

    public Shape getParagraphShape() {
		return paragraphShape;
	}

    public void setParagraphShape(Shape paragraphShape) {
		this.paragraphShape = paragraphShape;
	}

	public Map<String, CSSValue> getCssMap() {
        return cssMap;
    }

    public void setCssMap(Map<String, CSSValue> cssMap) {
        this.cssMap = cssMap;
    }

    public String getHyperlink() {
        return hyperlink;
    }

    public void setHyperlink(String hyperlink) {
        this.hyperlink = hyperlink;
    }

    public boolean isHyperlinkTraversal() {
        return hyperlink != null;
    }

    public boolean isInTableCell() {
        return inTableCell;
    }

    public void setInTableCell(boolean inTableCell) {
        this.inTableCell = inTableCell;
    }

    public TraversalSettings clone(){
        try {
            return (TraversalSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

}
