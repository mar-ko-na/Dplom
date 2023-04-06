package com.example.diplom.data

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.diplom.domain.TaskItem
import com.example.diplom.domain.ShopListRepository

class ShopListRepositoryImpl(
    application: Application
) : ShopListRepository {

    private val shopListDao = AppDatabase.getInstance(application).shopListDao()
    private val mapper = ShopListMapper()

    override fun addShopItem(taskItem: TaskItem) {
        shopListDao.addShopItem(mapper.mapEntityToDbModel(taskItem))
    }

    override fun deleteShopItem(taskItem: TaskItem) {
        shopListDao.deleteShopItem(taskItem.id)
    }

    override fun editShopItem(taskItem: TaskItem) {
        shopListDao.addShopItem(mapper.mapEntityToDbModel(taskItem))
    }

    override fun getShopItem(shopItemId: Int): TaskItem {
        val dbModel = shopListDao.getShopItem(shopItemId)
        return mapper.mapDbModelToEntity(dbModel)
    }

    override fun getShopList(): LiveData<List<TaskItem>> = Transformations.map(
        shopListDao.getShopList()
    ) {
        mapper.mapListDbModelToListEntity(it)
    }
}
