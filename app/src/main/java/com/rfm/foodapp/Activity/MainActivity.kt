package com.rfm.foodapp.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rfm.foodapp.Domain.CategoryDomain
import com.rfm.foodapp.R
import com.rfm.foodapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: RecyclerView.Adapter<*>
    private lateinit var recyclerViewCategoryList: RecyclerView
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        fun recyclerViewCategory() {
            var linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
            val recyclerViewCategory = binding.rvCategories
            recyclerViewCategory.layoutManager = linearLayoutManager

            val categoryList = ArrayList< CategoryDomain >()
            categoryList.add(CategoryDomain("Pizza", "cat_1"))
            categoryList.add(CategoryDomain("Burger", "cat_2"))
            categoryList.add(CategoryDomain("Hotdog", "cat_3"))
            categoryList.add(CategoryDomain("Drink", "cat_4"))
            categoryList.add(CategoryDomain("Donut", "cat_5"))
        }
    }
}