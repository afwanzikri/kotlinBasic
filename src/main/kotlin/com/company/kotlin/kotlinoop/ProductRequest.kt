package com.company.kotlin.kotlinoop

import com.company.kotlin.annotations.NotBlank

data class ProductRequest (
    @NotBlank val id: String,
    @NotBlank val name: String,
    @NotBlank val price: Long
)

data class CategoryRequest(
    @NotBlank val outletId: String,
    @NotBlank val outletName: String
)