package org.puettstr.util

import com.vaadin.flow.component.Component

object VaadinExtensions {

    var Component.backgroundColor: String
        get() = style["background-color"]
        set(value) {
            style["background-color"] = value
        }
}