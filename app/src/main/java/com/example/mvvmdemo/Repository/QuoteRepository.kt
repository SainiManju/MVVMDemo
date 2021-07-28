package com.example.mvvmdemo.Repository
import androidx.lifecycle.LiveData
import com.example.mvvmdemo.View.Quote
import com.example.mvvmdemo.View.QuoteDao


class QuoteRepository(private val quoteDao: QuoteDao) {

    fun getQuotes(): LiveData<List<Quote>>{
        return quoteDao.getQuotes()
    }

    suspend fun insertQuote(quote: Quote){
        quoteDao.insertQuote(quote)
    }
}