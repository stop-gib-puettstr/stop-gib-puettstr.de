package org.puettstr.views.about

import com.vaadin.flow.component.Component
import com.vaadin.flow.component.html.H2
import com.vaadin.flow.component.html.Image
import com.vaadin.flow.component.html.Paragraph
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.PageTitle
import com.vaadin.flow.router.Route
import com.vaadin.flow.theme.lumo.LumoUtility.Margin
import org.puettstr.views.MainLayout

@PageTitle("Wer wir sind")
@Route(value = "about", layout = MainLayout::class)
class AboutUs: VerticalLayout() {

    init {
        isSpacing = false
        val img = Image("images/placeholder.png", "placeholder")
        img.width = "200px"
        add(img)

        val header = H2("This is a placeholder")
        header.addClassNames(Margin.Top.XLARGE, Margin.Bottom.MEDIUM)
        add(header)
        add(Paragraph("Lorem ipsum dolor sit amet"))
        setSizeFull()
        justifyContentMode = FlexComponent.JustifyContentMode.CENTER
        defaultHorizontalComponentAlignment =FlexComponent.Alignment.CENTER
        style.set("text-align", "center")
    }
}