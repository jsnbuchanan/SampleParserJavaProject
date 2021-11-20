package com.appdetex

import com.appdetex.sampleparserjavaproject.GooglePlayApp
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class GooglePlayAppTest : StringSpec({
    val title = "Minecraft"
    val description = """
        Explore infinite worlds and build everything from the simplest 
        of homes to the grandest of castles. Play in creative mode with 
        unlimited resources or mine deep into the world in survival mode, 
        crafting weapons and armor to fend off dangerous mobs. Create, 
        explore and survive alone or with friends on mobile devices or 
        Windows 10.
    """.replace("\n            ","").trimIndent()
    val publisher = "Mojang"
    val price = "$7.49"
    val rating = 4.6f

    val minecraft = GooglePlayApp(title, description, publisher, price, rating)

    "GooglePlayApp title field is settable" {
        minecraft.title shouldBe title
    }

    "GooglePlayApp description field is settable" {
        minecraft.description shouldBe description
    }

    "GooglePlayApp publisher field is settable" {
        minecraft.publisher shouldBe publisher
    }

    "GooglePlayApp price field is settable" {
        minecraft.price shouldBe price
    }

    "GooglePlayApp rating field is settable" {
        minecraft.rating shouldBe rating
    }
})