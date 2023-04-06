package com.example.diplom.domain

import androidx.lifecycle.LiveData

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList(): LiveData<List<TaskItem>> {
        return shopListRepository.getShopList()
    }
}
