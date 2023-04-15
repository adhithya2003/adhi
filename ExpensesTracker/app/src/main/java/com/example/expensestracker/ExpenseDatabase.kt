package com.example.expensestracker

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Items::class], version = 1)
abstract class ExpenseDatabase : RoomDatabase() {

    companion object
}