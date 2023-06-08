package org.puettstr.components.infobox

import com.vaadin.flow.component.html.Div
import com.vaadin.flow.component.html.H3
import com.vaadin.flow.component.html.Paragraph
import com.vaadin.flow.component.icon.Icon
import com.vaadin.flow.component.orderedlayout.HorizontalLayout
import com.vaadin.flow.component.orderedlayout.VerticalLayout

class InfoBoxElement : Div {

    constructor(icon: Icon, headline: H3, text: Paragraph) {
        headline.style["color"] = "#fff"
        val headlineLayout = HorizontalLayout()
        headlineLayout.add(icon, headline)
        val layout = VerticalLayout()
        layout.add(headlineLayout, text)
        add(layout)
    }

    constructor(headline: H3, text: Paragraph) {
        val headlineLayout = HorizontalLayout()
        headlineLayout.add(headline)
        val layout = VerticalLayout()
        layout.add(headlineLayout, text)
        add(layout)
    }

    constructor(h3: H3) {
        add(h3)
    }
}
