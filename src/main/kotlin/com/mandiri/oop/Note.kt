package com.mandiri.oop

class Note(title: String) {
    var title: String = title
        get() {
            println("Call getter function")
            return field
        }

        set(value) {
            println("Call setter function")
            if (value.isNotBlank()) {
                field = value
            }
        }
}

class BigNote(val title: String){
    val bigTitle: String
        get() = title.toUpperCase()



}