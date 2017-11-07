package com.giantstrideltd.coderswag.Services

import com.giantstrideltd.coderswag.Model.Category
import com.giantstrideltd.coderswag.Model.Product

/**
 * Created by Famous Oko on 11/7/2017.
 */
object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat01"),
            Product("Devslopes Hat Black", "$20", "hat02"),
            Product("Devslopes Hat White", "$18", "hat03"),
            Product("Devslopes Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie01"),
            Product("Devlopes Hoodie Red", "$32", "hoodie02"),
            Product("Devslopes Gray Hoodie", "$28", "hoodie03"),
            Product("Devlopes Black Hoodie", "$32", "hoodie04")

    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$28", "shirt01"),
            Product("Devlopes Badge Light Gray", "$20", "shirt02"),
            Product("Devslopes Logo Shirt Red", "$22", "shirt03"),
            Product("Devlopes Hustle", "$32", "shirt04"),
            Product("Kickflip Studios", "$28", "shirt05")
    )


}