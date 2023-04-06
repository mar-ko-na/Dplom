package com.example.diplom.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.diplom.data.ShopListRepositoryImpl
import com.example.diplom.domain.DeleteShopItemUseCase
import com.example.diplom.domain.EditShopItemUseCase
import com.example.diplom.domain.GetShopListUseCase
import com.example.diplom.domain.TaskItem

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = ShopListRepositoryImpl(application)

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(taskItem: TaskItem) {
        deleteShopItemUseCase.deleteShopItem(taskItem)
    }

    fun changeEnableState(taskItem: TaskItem) {
        val newItem = taskItem.copy(enabled = !taskItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}
