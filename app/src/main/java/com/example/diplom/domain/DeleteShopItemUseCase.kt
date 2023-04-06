package com.example.diplom.domain

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteShopItem(taskItem: TaskItem) {
        shopListRepository.deleteShopItem(taskItem)
    }
}
