package org.puettstr.components

import com.vaadin.flow.component.orderedlayout.VerticalLayout
import org.puettstr.util.VaadinExtensions.align
import org.puettstr.util.VaadinExtensions.backgroundColor
import org.puettstr.util.VaadinExtensions.borderRadius
import org.puettstr.util.VaadinExtensions.boxShadow

open class ContentLayout : VerticalLayout() {

    init {
        backgroundColor = "#fff"
        width = "75%"
        align ="center"
        borderRadius = "5px"
        boxShadow = "3px 3px 3px rgba(0,0,0,.2),0px 0px 6px rgba(0,0,0,.2)"
    }
}