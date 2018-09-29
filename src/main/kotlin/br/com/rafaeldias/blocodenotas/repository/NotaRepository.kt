package br.com.rafaeldias.blocodenotas.repository

import br.com.rafaeldias.blocodenotas.model.Nota
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface NotaRepository : MongoRepository<Nota, String> {
    //fun findByTitulo(titulo: String): Nota //busca exata
    //fun findByTituloContaining(titulo: String): Nota //busca aproximada
    fun findByTituloContainingIgnoreCase(titulo: String): List<Nota> //busca aproximada sem case sensitive

}