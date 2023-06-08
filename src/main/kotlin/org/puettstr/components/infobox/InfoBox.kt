package org.puettstr.components.infobox

import com.vaadin.flow.component.Component
import com.vaadin.flow.component.html.Div
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import org.puettstr.components.ShoutBox

class InfoBox : Div {

    constructor(shoutBox: ShoutBox, infoBoxElements: Component) {
        style["background-color"] = "#09162a"
        style["color"] = "#fff"
        val layout = VerticalLayout(shoutBox, infoBoxElements)
        add(layout)
    }
}