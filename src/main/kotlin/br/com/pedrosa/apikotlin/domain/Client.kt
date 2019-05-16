package br.com.pedrosa.apikotlin.domain


import org.springframework.data.mongodb.core.mapping.Document

@Document
class Client(val id: String, val name: String, val age: Int){

}