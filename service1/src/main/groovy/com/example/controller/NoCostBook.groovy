package com.example.controller


import com.example.Service2Client
import com.example.domain.Book
import io.micronaut.retry.annotation.Fallback
import io.reactivex.Flowable

@Fallback
class NoCostBook implements Service2Client{


    @Override
    Flowable<ArrayList<Book>> findBooks() {
        println ("Callback.....")
        Flowable.just([new Book(title: "NaN", author: "NaN", isbn: "NaN")])
    }
}


