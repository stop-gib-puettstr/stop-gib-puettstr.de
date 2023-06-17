package org.puettstr.components

import com.vaadin.flow.component.html.H2
import org.puettstr.util.VaadinExtensions.backgroundColor
import org.puettstr.util.VaadinExtensions.fontSize
import org.puettstr.util.VaadinExtensions.fontWeight
import org.puettstr.util.VaadinExtensions.margin
import org.puettstr.util.VaadinExtensions.overflow
import org.puettstr.util.VaadinExtensions.padding
import org.puettstr.util.VaadinExtensions.textAlign
import org.puettstr.util.VaadinExtensions.wordBreak

class ShoutBox(text: String) : H2(text) {

    init {
        width = "50%"
        maxWidth = "550px"
        backgroundColor = "#f29760"
        textAlign = "center"
        margin = "0 auto"
        padding = "20px"
        overflow = "hidden"
        wordBreak = "break-word"
        fontSize = "1.5em"
        fontWeight = "bold"
    }
}
