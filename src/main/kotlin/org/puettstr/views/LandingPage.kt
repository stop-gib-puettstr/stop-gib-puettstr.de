package org.puettstr.views

import com.vaadin.flow.component.Component
import com.vaadin.flow.component.html.H3
import com.vaadin.flow.component.html.Image
import com.vaadin.flow.component.html.Paragraph
import com.vaadin.flow.component.icon.VaadinIcon
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.HorizontalLayout
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.PageTitle
import com.vaadin.flow.router.Route
import com.vaadin.flow.router.RouteAlias
import org.puettstr.components.ContentLayout
import org.puettstr.components.PageLayout
import org.puettstr.components.ShoutBox
import org.puettstr.components.ImageCompare
import org.puettstr.components.infobox.InfoBox
import org.puettstr.components.infobox.InfoBoxElement

@PageTitle("stop-gib-puettstr")
@Route(value = "", layout = MainLayout::class)
@RouteAlias(value = "", layout = MainLayout::class)
class LandingPage : PageLayout() {

    private val image = Image("/images/header/header.jpg", "Header")
    private val shoutBox = ShoutBox(
        """Die Bürgerinitiative
            |
        |»Stop-Gewerbe-und-Industriegebiet Püttstrasse« informiert
    """.trimMargin().uppercase()
    )

    init {
        val layout = ContentLayout()
        image.width = "100%"
        setHorizontalComponentAlignment(FlexComponent.Alignment.CENTER, layout)
        layout.add(image, shoutBox)

        val descriptionImageLayout = HorizontalLayout()

        val paragraph1 =
            Paragraph("Die Stadt Geilenkirchen plant die Erweiterung des Gewerbegebietes Niederheid. Die Erweiterung soll an der Püttstrasse erfolgen, also auf der gegenüberliegenden Seite der B221. Es soll kein reines Gewerbegebiet entstehen, sondern ein sogenannter  „Gewerbe- und Industrieansiedlungsbereich“ (GIB). ")
        val paragraph2 =
            Paragraph("Der geplante Ausbau ist nur ein erster Schritt. Eine erhebliche Erweiterung des geplanten Gebietes ist vorgesehen und die dafür notwendigen baulichen Vorkehrungen im Bebauungsplan enthalten.")
        val paragraph3 =
            Paragraph("Wenn die Stadt Geilenkirchen ihre Planung umsetzt, sieht unsere Heimat bald so aus; Fahren Sie einfach mal mit der Maus über das Bild und sehen Sie sich die schwerwiegenden Folgen für Mensch und Natur in Ruhe an!")

        val textLayout = VerticalLayout()
        textLayout.add(paragraph1, paragraph2, paragraph3)
        textLayout.width = "45%"

        val twentyTwenty = ImageCompare(
            Image("images/ausbaubild/Ausbaubild-1.jpg", "Derzeitiger Stand"),
            Image("images/ausbaubild/Ausbaubild-2.jpg", "Geplanter Stand")
        )
        twentyTwenty.width = "45%"

        descriptionImageLayout.add(textLayout, twentyTwenty)
        layout.add(descriptionImageLayout)

        val shoutBox = createShoutBox()
        val infoboxElements = createInfoBoxElements()
        val infoBox = InfoBox(shoutBox, infoboxElements)
        layout.add(infoBox)
        add(layout)
    }

    private fun createInfoBoxElements(): Component {
        val layout = VerticalLayout()

        val lauter = InfoBoxElement(
            VaadinIcon.VOLUME_UP.create(),
            H3("Lauter"),
            Paragraph("In Industriegebieten dürfen die Betriebe deutlich mehr Lärm machen - tag und nacht 70 dB(A)")
        )
        lauter.width = "50%"
        val schaedlicher = InfoBoxElement(
            VaadinIcon.FIRE.create(),
            H3("Schädlicher"),
            Paragraph("In Industriegebieten wird produziert, verpackt, gelagert und Güter mit LKW’s hin- und herbewegt. Die Folgen: Gestank, Abgase und Dauerlärm.")
        )
        schaedlicher.width = "50%"

        val horizontal1 = HorizontalLayout(lauter, schaedlicher)
        layout.add(horizontal1)

        val gefaehrlicher = InfoBoxElement(
            H3("Gefährlicher"),
            Paragraph("In Industriegebieten wird häufig mit großen Mengen gefährlicher, z.B. giftiger oder explosiver Stoffe hantiert.")
        )
        gefaehrlicher.width = "50%"

        val tagUndNacht = InfoBoxElement(H3("Tag und Nacht"))
        tagUndNacht.width = "50%"

        val horizontal2 = HorizontalLayout(gefaehrlicher, tagUndNacht)
        layout.add((horizontal2))
        return layout
    }

    private fun createShoutBox() = ShoutBox("UND DAS SIND DIE FOLGEN")
}