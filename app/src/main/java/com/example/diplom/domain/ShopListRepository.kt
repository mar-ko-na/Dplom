package com.example.diplom.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun addShopItem(taskItem: TaskItem)

    fun deleteShopItem(taskItem: TaskItem)

    fun editShopItem(taskItem: TaskItem)

    fun getShopItem(shopItemId: Int): TaskItem

    fun getShopList(): LiveData<List<TaskItem>>
}
