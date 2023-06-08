package org.puettstr.views

import com.vaadin.flow.component.Component
import com.vaadin.flow.component.UI
import com.vaadin.flow.component.applayout.AppLayout
import com.vaadin.flow.component.menubar.MenuBar
import org.puettstr.views.about.AboutUs

class MainLayout : AppLayout() {

    private val menu = MenuBar()

    init {
        try {
            primarySection = Section.NAVBAR
            addHeaderContent()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun addHeaderContent() {
        menu.isOpenOnHover = true
        menu.apply {
            addItem("Startseite").addClickListener { navigateTo(LandingPage::class.java) }

            addItem("Aktuelles")

            val aboutUs = addItem("Über uns")
            aboutUs.addClickListener { navigateTo(AboutUs::class.java) }
            aboutUs.subMenu.apply {
                addItem("Die Initiatoren")
                addItem("Unsere Ziele und Forderungen")
            }

            val facts = addItem("Fakten")
            facts.subMenu.apply {
                addItem("Begründung der Stadt Geilenkirchen")
                addItem("Regionalplan f.d. Regierungsbezirk Köln")
                addItem("Umweltbericht")
            }

            val press = addItem("Presse")
            press.subMenu.apply {
                addItem("WDR-Lokalzeit in Hatterath")
                addItem("Rat bringt Erweiterungspläne")
                addItem("Pläne sind echte Klopper")
                addItem("Pläne nehmen Fahrt auf")
            }
        }

        addToNavbar(true, menu)
    }

    private fun navigateTo(targetView: Class<out Component>) {
        UI.getCurrent().navigate(targetView)
    }
}
