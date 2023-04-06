package com.example.diplom.data

import com.example.diplom.domain.TaskItem

class ShopListMapper {

    fun mapEntityToDbModel(taskItem: TaskItem) = ShopItemDbModel(
        id = taskItem.id,
        name = taskItem.name,
        count = taskItem.count,
        enabled = taskItem.enabled
    )

    fun mapDbModelToEntity(shopItemDbModel: ShopItemDbModel) = TaskItem(
        id = shopItemDbModel.id,
        name = shopItemDbModel.name,
        count = shopItemDbModel.count,
        enabled = shopItemDbModel.enabled
    )

    fun mapListDbModelToListEntity(list: List<ShopItemDbModel>) = list.map {
        mapDbModelToEntity(it)
    }
}
