package com.mandiri.oop

class Company(val name: String) {
    override fun equals(other: Any?): Boolean {
        return when (other){
            is Company -> name == this.name
            else -> false
        }
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}