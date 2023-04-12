package com.example.composepaging3withcache.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Created by Jaehyeon on 2023/04/12.
 */
@Database(
    entities = [BeerEntity::class],
    version = 1
)
abstract class BeerDatabase: RoomDatabase() {

    abstract val dao: BeerDao

}