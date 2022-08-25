package com.example.task_5_pemrog_mobile.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.task_5_pemrog_mobile.models.Article

@Dao
interface ArticleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: Article): Long

    @Query("SELECT * FROM articles")
    fun getAllArticles(): LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)
}