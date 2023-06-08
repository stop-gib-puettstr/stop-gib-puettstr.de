package org.puettstr.components

import com.flowingcode.vaadin.addons.ics.ImageComparisonSlider
import com.vaadin.flow.component.Html
import com.vaadin.flow.component.dependency.CssImport
import com.vaadin.flow.component.dependency.JsModule
import com.vaadin.flow.component.html.Div
import com.vaadin.flow.component.html.Image

@JsModule("./js/jquery-3.7.0.min.js")
@JsModule("./js/jquery.event.move.min.js")
@JsModule("./js/jquery.twentytwenty.min.js")
@CssImport("./css/twentytwenty.min.css")
class ImageCompare(imageBefore: Image, imageAfter: Image) : Div() {
    init {
        imageBefore.setWidthFull()
        imageAfter.setWidthFull()
        val compare = ImageComparisonSlider(imageBefore, imageAfter)
        compare.value = 50
        compare.setSizeFull()
        compare.isSlideOnHover = true
        add(compare)
    }
}