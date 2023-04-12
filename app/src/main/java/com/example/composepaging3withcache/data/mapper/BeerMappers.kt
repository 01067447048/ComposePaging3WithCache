package com.example.composepaging3withcache.data.mapper

import com.example.composepaging3withcache.data.local.BeerEntity
import com.example.composepaging3withcache.data.remote.BeerDto
import com.example.composepaging3withcache.domain.Beer

fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        imageUrl = image_url,
        firstBrewed = first_brewed
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        imageUrl = imageUrl,
        firstBrewed = firstBrewed
    )
}