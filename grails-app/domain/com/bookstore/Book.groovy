package com.bookstore

class Book {

    String isbn
    String title
    String description
    String author
    String publisher
    Double price
    Date publishDate
    Date createDate = new Date()

    static constraints = {
    }
}
