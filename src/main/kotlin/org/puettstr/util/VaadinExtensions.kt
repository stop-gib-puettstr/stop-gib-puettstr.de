package org.puettstr.util

import com.vaadin.flow.component.Component

object VaadinExtensions {

    var Component.backgroundColor: String
        get() = style["background-color"]
        set(value) {
            style["background-color"] = value
        }
    var Component.align: String
        get() = style["algin"]
        set(value){
            style["align"] = value
        }
    var Component.borderRadius: String
        get() = style["border-radius"]
        set(value) {
            style["boder-radius"]
        }
    var Component.boxShadow: String
        get() = style["box-shadow"]
        set(value) {
            style["box-shadow"]
        }
    var Component.color: String
        get() = style["color"]
        set(value) {
            style["color"]
        }
    var Component.textAlign
        get() = style["text-align"]
        set(value) {
            style["text-align"]
        }
    var Component.margin
        get() = style["margin"]
        set(value) {
            style["margin"]
        }
    var Component.padding
        get() = style["padding"]
        set(value) {
            style["padding"]
        }
    var Component.overflow
        get() = style["overflow"]
        set(value) {
            style["overflow"]
        }
    var Component.wordBreak
        get() = style["word-break"]
        set(value) {
            style["word-break"]
        }
    var Component.fontSize
        get() = style["font-size"]
        set(value) {
            style["font-size"]
        }
    var Component.fontWeight
        get() = style["font-weight"]
        set(value) {
            style["font-weight"]
        }
}