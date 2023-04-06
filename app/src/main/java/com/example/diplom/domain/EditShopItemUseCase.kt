package com.example.diplom.domain

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun editShopItem(taskItem: TaskItem) {
        shopListRepository.editShopItem(taskItem)
    }
}
