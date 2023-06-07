package org.puettstr.components

import com.vaadin.flow.component.orderedlayout.VerticalLayout
import org.puettstr.util.VaadinExtensions.backgroundColor

open class PageLayout : VerticalLayout() {

    init {
        backgroundColor = "#f0f0f0"
        style["background-color"] = "#f0f0f0"
        minHeight = "100%"
    }
}
