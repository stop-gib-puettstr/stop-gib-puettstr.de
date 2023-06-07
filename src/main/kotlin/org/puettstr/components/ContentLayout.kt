package org.puettstr.components

import com.vaadin.flow.component.orderedlayout.VerticalLayout

open class ContentLayout : VerticalLayout() {

    init {
        style["background-color"] = "#fff"
        width = "75%"
        style["align"] ="center"
        style["border-radius"] = "5px"
        style["box-shadow"] = "3px 3px 3px rgba(0,0,0,.2),0px 0px 6px rgba(0,0,0,.2)"
    }
}