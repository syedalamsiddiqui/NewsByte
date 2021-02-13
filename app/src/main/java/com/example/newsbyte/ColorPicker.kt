package com.example.newsbyte

object ColorPicker{
    val colors = arrayOf("#DFFF00","#FFBF00","#FF7F50","#DE3163","#9FE2BF","#40E0D0","#6495ED","#CCCCFF")
    var colorIndex = 1
    fun getColor(): String{
        return colors[colorIndex++ % colors.size]
    }
}