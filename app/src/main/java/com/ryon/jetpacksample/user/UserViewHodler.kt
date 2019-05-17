package com.ryon.jetpacksample.user

import androidx.recyclerview.widget.RecyclerView
import com.ryon.jetpacksample.databinding.ActivityUserItemBinding
import com.ryon.repositories.room.entity.User

class UserViewHodler (private val binding: ActivityUserItemBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(user: User,model: UserViewModel){
        binding.user = user
        binding.model = model
    }
}