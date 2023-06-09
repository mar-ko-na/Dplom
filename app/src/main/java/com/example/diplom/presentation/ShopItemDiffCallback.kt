package com.example.diplom.presentation

import androidx.recyclerview.widget.DiffUtil
import com.example.diplom.domain.TaskItem

class ShopItemDiffCallback: DiffUtil.ItemCallback<TaskItem>() {

    override fun areItemsTheSame(oldItem: TaskItem, newItem: TaskItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: TaskItem, newItem: TaskItem): Boolean {
        return oldItem == newItem
    }
}
