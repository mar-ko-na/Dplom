package com.example.diplom.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.diplom.data.ShopListRepositoryImpl
import com.example.diplom.domain.DeleteShopItemUseCase
import com.example.diplom.domain.EditShopItemUseCase
import com.example.diplom.domain.GetShopListUseCase
import com.example.diplom.domain.ShopItem

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = ShopListRepositoryImpl(application)

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}
