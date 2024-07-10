package com.akirachix.myblog

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.myblog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvBogs.layoutManager = LinearLayoutManager(this)
        displayBlog()
    }

    fun displayBlog() {
        val content1 = Content("Eagle", "12/09/2024", "https://cdn.mos.cms.futurecdn.net/Y8oFodGLyPJZRtKjyFjBLN.jpg", "The majestic golden eagle, with its striking gold feathers and powerful wingspan, is a symbol of freedom and strength. Native to North America, it's a skilled hunter with exceptional eyesight and agility. Despite its beauty, the golden eagle faces threats like habitat loss and poaching, making conservation efforts crucial for its survival")
        val content2 = Content("Flowers", "12/09/2024", " https://sendflowers.pk/wp-content/uploads/2021/03/Bloomy-Flowers-Bouquet-for-Mothers-Day.jpg", "The majestic golden eagle, with its striking gold feathers and powerful wingspan, is a symbol of freedom and strength. Native to North America, it's a skilled hunter with exceptional eyesight and agility. Despite its beauty, the golden eagle faces threats like habitat loss and poaching, making conservation efforts crucial for its survival")
        val content3 = Content("Flowers", "12/09/2024", " https://theflowerrun.com.au/cdn/shop/files/Untitled_design_30_690x690_crop_center.png?v=1709789978", "The majestic golden eagle, with its striking gold feathers and powerful wingspan, is a symbol of freedom and strength. Native to North America, it's a skilled hunter with exceptional eyesight and agility. Despite its beauty, the golden eagle faces threats like habitat loss and poaching, making conservation efforts crucial for its survival")
        val content4 = Content("Flowers", "12/09/2024", "https://cdn.mos.cms.futurecdn.net/Y8oFodGLyPJZRtKjyFjBLN.jpg", "The majestic golden eagle, with its striking gold feathers and powerful wingspan, is a symbol of freedom and strength. Native to North America, it's a skilled hunter with exceptional eyesight and agility. Despite its beauty, the golden eagle faces threats like habitat loss and poaching, making conservation efforts crucial for its survival")
        val content5 = Content("Flowers", "12/09/2024", "https://cdn.mos.cms.futurecdn.net/Y8oFodGLyPJZRtKjyFjBLN.jpg", "The majestic golden eagle, with its striking gold feathers and powerful wingspan, is a symbol of freedom and strength. Native to North America, it's a skilled hunter with exceptional eyesight and agility. Despite its beauty, the golden eagle faces threats like habitat loss and poaching, making conservation efforts crucial for its survival")
        val content6 = Content("Flowers", "12/09/2024", "https://cdn.mos.cms.futurecdn.net/Y8oFodGLyPJZRtKjyFjBLN.jpg", "The majestic golden eagle, with its striking gold feathers and powerful wingspan, is a symbol of freedom and strength. Native to North America, it's a skilled hunter with exceptional eyesight and agility. Despite its beauty, the golden eagle faces threats like habitat loss and poaching, making conservation efforts crucial for its survival")
        val content7 = Content("Flowers", "12/09/2024", "https://cdn.mos.cms.futurecdn.net/Y8oFodGLyPJZRtKjyFjBLN.jpg", "The majestic golden eagle, with its striking gold feathers and powerful wingspan, is a symbol of freedom and strength. Native to North America, it's a skilled hunter with exceptional eyesight and agility. Despite its beauty, the golden eagle faces threats like habitat loss and poaching, making conservation efforts crucial for its survival")
        val content8 = Content("Flowers", "12/09/2024", "https://cdn.mos.cms.futurecdn.net/Y8oFodGLyPJZRtKjyFjBLN.jpg", "The majestic golden eagle, with its striking gold feathers and powerful wingspan, is a symbol of freedom and strength. Native to North America, it's a skilled hunter with exceptional eyesight and agility. Despite its beauty, the golden eagle faces threats like habitat loss and poaching, making conservation efforts crucial for its survival")
        val content9 = Content("Flowers", "12/09/2024", "https://cdn.mos.cms.futurecdn.net/Y8oFodGLyPJZRtKjyFjBLN.jpg", "The majestic golden eagle, with its striking gold feathers and powerful wingspan, is a symbol of freedom and strength. Native to North America, it's a skilled hunter with exceptional eyesight and agility. Despite its beauty, the golden eagle faces threats like habitat loss and poaching, making conservation efforts crucial for its survival")
        val content15 = Content("Flowers", "12/09/2024", "https://cdn.mos.cms.futurecdn.net/Y8oFodGLyPJZRtKjyFjBLN.jpg", "The majestic golden eagle, with its striking gold feathers and powerful wingspan, is a symbol of freedom and strength. Native to North America, it's a skilled hunter with exceptional eyesight and agility. Despite its beauty, the golden eagle faces threats like habitat loss and poaching, making conservation efforts crucial for its survival")
        val content16 = Content("Brown Wolf", "12/09/2024", "https://s28151.pcdn.co/wp-content/uploads/sites/2/2022/03/Coyote-animal-sentience-research.jpg", "The majestic golden eagle, with its striking gold feathers and powerful wingspan, is a symbol of freedom and strength. Native to North America, it's a skilled hunter with exceptional eyesight and agility. Despite its beauty, the golden eagle faces threats like habitat loss and poaching, making conservation efforts crucial for its survival")
        val contactList = listOf(content1, content2,content3,content4,content5,content6,content7,content8,content9,content16,content15)
        val contactsAdapter = BlogAdapter(contactList)
        binding.tvBogs.adapter = contactsAdapter

    }
}
