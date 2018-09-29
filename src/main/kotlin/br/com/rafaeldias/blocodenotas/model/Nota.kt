package br.com.rafaeldias.blocodenotas.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Nota (
    @Id var id: String?, //?significa que pode ser nulo
    var titulo: String,
    var descricao: String
)