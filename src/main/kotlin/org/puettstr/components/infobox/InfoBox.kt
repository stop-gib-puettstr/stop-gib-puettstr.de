package org.puettstr.components.infobox

import com.vaadin.flow.component.Component
import com.vaadin.flow.component.html.Div
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import org.puettstr.components.ShoutBox
import org.puettstr.util.VaadinExtensions.backgroundColor
import org.puettstr.util.VaadinExtensions.color

class InfoBox : Div {

    constructor(shoutBox: ShoutBox, infoBoxElements: Component) {
        backgroundColor = "#09162a"
        color = "#fff"
        val layout = VerticalLayout(shoutBox, infoBoxElements)
        add(layout)
    }
}