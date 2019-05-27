package br.com.pedrosa.apikotlin.domain


import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Client(@Id var id: String?, var name: String, var age: Int){
}