package com.example.k0app

data  class Library(var bookname: String,
                    var isbn: String,
                    var publicationyear: Int,
                    var editorial: String,
                    var nPAGES: String,
                    var price: Int,
                    var auth: String,
                    var typebook: Boolean /* TRUE=Digital   FALSE= IMPRESO*/) {

   /* constructor(){
        bookname = "Not Registred"
        isbn = "Not Found"
        publicationyear = 0
        editorial = "Not Registred"
        nPAGES = "Not Found"
        price = 1
        auth = "Not Registred"
        typebook = true

    }
*/
/*
    fun formatedPrice(soldprice:Int){
        var bookprice= "$+$soldprice"
        return bookprice.print()
    }
    */

    fun formatedprice(): String{
        return "$ ${this.price}"   //Trabajo del metodo a partir de la instansiacion de la clase con el constructor, haciendo referencia especificamente al atributo price de la misma clase
    }

    fun printINFObook():String{
    return "Book Name: $bookname | ISBN: $isbn | Publicado:$publicationyear | Editorial:$editorial | N.Paginas:$nPAGES | Precio:$price | Autor:$auth | Disponibilidad Online:$typebook"
    }

}