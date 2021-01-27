package com.github.dnovaes.chowa.model

data class FoodItem(
    val id: Int,
    val content: String
) {
    companion object {
        val mockedItems = listOf(
            FoodItem(1, "Empadão"),
            FoodItem(2, "Frango Assado"),
            FoodItem(3, "Frango Cozido"),
            FoodItem(4, "Figado Acebolado"),
            FoodItem(5, "Tilápia Frita Acebolada")
        )
    }
}
