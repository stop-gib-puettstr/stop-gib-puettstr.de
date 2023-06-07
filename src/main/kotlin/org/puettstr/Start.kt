package org.puettstr

import com.vaadin.flow.component.page.AppShellConfigurator
import com.vaadin.flow.theme.Theme
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.SpringApplication.run
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
@Theme(value = "app")
open class Start : AppShellConfigurator {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            run(Start::class.java, *args)
        }
    }
}