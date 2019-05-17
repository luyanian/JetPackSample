package com.ryon.jetpacksample.user.pagingroom

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import com.ryon.jetpacksample.R
import com.ryon.jetpacksample.user.UserViewHodler
import com.ryon.jetpacksample.user.UserViewModel
import com.ryon.repositories.room.entity.User

class UserPageAdapter(val context: Context, val model: UserViewModel) : PagedListAdapter<User, UserViewHodler>(
    diffCallBack
) {

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

    override fun onBindViewHolder(holder: UserViewHodler, position: Int) {
        getItem(position)?.let { holder.bind(it, model) }
    }

    companion object {
        private val diffCallBack = object : DiffUtil.ItemCallback<User>() {

            override fun areItemsTheSame(oldItem: User, newItem: User): Boolean {
                return oldItem.id == newItem.id
            }

            @SuppressLint("DiffUtilEquals")
            override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
                return oldItem == newItem
            }

            override fun getChangePayload(oldItem: User, newItem: User): Any? {
                return null
            }
        }
    }
}