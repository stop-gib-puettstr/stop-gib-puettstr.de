package org.puettstr.components

import com.vaadin.flow.component.Html
import com.vaadin.flow.component.UI
import com.vaadin.flow.component.dependency.CssImport
import com.vaadin.flow.component.dependency.JavaScript
import com.vaadin.flow.component.dependency.JsModule
import com.vaadin.flow.component.html.Div
import com.vaadin.flow.component.html.Image
import com.vaadin.flow.dom.ElementFactory

@JsModule("./js/jquery-3.7.0.min.js")
@JsModule("./js/jquery.event.move.min.js")
@JsModule("./js/jquery.twentytwenty.min.js")
@CssImport("./css/twentytwenty.min.css")
class TwentyTwenty(imageBefore: Image, imageAfter: Image) : Div() {
    init {
        val script1 = """
            <script>jQuery(document).ready(function (${'$'}) {
                            ${'$'}(".twentytwenty-container.twenty20-2[data-orientation!='vertical']")
                                .twentytwenty({ default_offset_pct: 0.5, move_slider_on_hover: true });
                            ${'$'}(".twenty20-2 .twentytwenty-before-label").html("Derzeitiger Stand");
                            ${'$'}(".twenty20-2 .twentytwenty-after-label").html("Geplanter Stand");
                        });
                    </script>
        """.trimIndent()

        className = "twenty20"
        setId("twentytwenty")
        val div1 = Div()
        div1.className = "twentytwenty-container twenty20-2 t20-hover"
        imageBefore.className = "skip-lazy twentytwenty-before"
        imageAfter.className = "skip-lazy twentytwenty-after"
        div1.add(imageBefore, imageAfter)
        val html = Html(script1)
        div1.add(html)
        add(div1)
    }
}