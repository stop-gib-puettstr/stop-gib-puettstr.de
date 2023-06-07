package org.puettstr.views

import com.vaadin.flow.component.Key
import com.vaadin.flow.component.button.Button
import com.vaadin.flow.component.html.Div
import com.vaadin.flow.component.html.Image
import com.vaadin.flow.component.html.Paragraph
import com.vaadin.flow.component.notification.Notification
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.HorizontalLayout
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.component.textfield.TextField
import com.vaadin.flow.dom.ElementFactory
import com.vaadin.flow.router.PageTitle
import com.vaadin.flow.router.Route
import com.vaadin.flow.router.RouteAlias
import org.puettstr.components.ContentLayout
import org.puettstr.components.PageLayout
import org.puettstr.components.ShoutBox
import org.puettstr.components.TwentyTwenty

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

        descriptionImageLayout.add(textLayout, TwentyTwenty(Image("images/ausbaubild/Ausbaubild-1.jpg", "Derzeitiger Stand"), Image("images/ausbaubild/Ausbaubild-2.jpg", "Geplanter Stand")))
        layout.add(descriptionImageLayout)
        add(layout)
    }
}