package com.example.diplom.domain

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopItem(taskItem: TaskItem) {
        shopListRepository.addShopItem(taskItem)
    }
}
