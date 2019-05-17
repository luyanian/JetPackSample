package com.ryon.jetpacksample.user.room

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ryon.jetpacksample.R
import com.ryon.jetpacksample.user.UserViewHodler
import com.ryon.jetpacksample.user.UserViewModel
import com.ryon.repositories.room.entity.User

class UserAdapter(val context:Context,val model: UserViewModel): RecyclerView.Adapter<UserViewHodler>() {
    private var datas:MutableList<User> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHodler {
        return UserViewHodler(
            DataBindingUtil.inflate(
                LayoutInflater.from(context),
                R.layout.activity_user_item,
                null,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: UserViewHodler, position: Int) {
        val user = datas[position];
        holder.bind(user,model)
    }

    fun freshUserList(userList: List<User>){
        datas.clear()
        datas.addAll(userList)
        notifyDataSetChanged()
    }


}