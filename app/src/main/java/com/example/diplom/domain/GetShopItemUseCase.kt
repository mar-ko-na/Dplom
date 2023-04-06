package com.example.diplom.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItem(shopItemId: Int): TaskItem {
        return shopListRepository.getShopItem(shopItemId)
    }
}
