package org.puettstr.components

import com.vaadin.flow.component.html.H2

class ShoutBox(text: String) : H2(text) {

    init {
        width = "50%"
        maxWidth = "550px"
        style["background-color"] = "#f29760"
        style["text-align"] = "center"
        style["margin"] = "0 auto"
        style["padding"] = "20px"
        style["overflow"] = "hidden"
        style["word-break"] = "break-word"
        style["font-size"] = "1.5em"
        style["font-weight"] = "bold"
    }
}
