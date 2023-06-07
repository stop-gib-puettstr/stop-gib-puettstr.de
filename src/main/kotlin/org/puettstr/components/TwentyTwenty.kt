package org.puettstr.components

import com.vaadin.flow.component.UI
import com.vaadin.flow.component.dependency.JsModule
import com.vaadin.flow.component.html.Div
import com.vaadin.flow.component.html.Image

@JsModule("./js/jquery-3.7.0.min.js")
class TwentyTwenty : Div {
    constructor(imageBefore: Image, imageAfter: Image) {

        val script = """
            jQuery(document).ready(function (${'$'}) {
                            ${'$'}(".twentytwenty-container.twenty20-2[data-orientation!='vertical']")
                                .twentytwenty({ default_offset_pct: 0.5, move_slider_on_hover: true });
                            ${'$'}(".twenty20-2 .twentytwenty-before-label").html("${imageBefore.alt}");
                            ${'$'}(".twenty20-2 .twentytwenty-after-label").html("${imageAfter.alt}");
                        });
        """.trimIndent()
        className = "twenty20"
        setId("twentytwenty")

        val div1 = Div()
        div1.className = "twentytwenty-container twenty20-2 t20-hover"
        imageBefore.className = "skip-lazy twentytwenty-before"
        imageAfter.className = "skip-lazy twentytwenty-after"
        div1.add(imageBefore, imageAfter)
        add(div1)
        UI.getCurrent().page.addJavaScript(script)
    }
}