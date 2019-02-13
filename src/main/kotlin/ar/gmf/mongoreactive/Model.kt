package ar.gmf.mongoreactive

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.Version
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Person(
        val name:String,
        val age:Int,
        @Id val id:String?=null,
        @Version val version:Long?=null)