package br.com.rafaeldias.blocodenotas.service

import br.com.rafaeldias.blocodenotas.model.Nota
import br.com.rafaeldias.blocodenotas.repository.NotaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class NotaService {
    @Autowired
    lateinit var notaRepository: NotaRepository //injeta o repositorio na variavel

    fun salvar(nota: Nota): Nota {
        return notaRepository.save(nota) //save faz insert e update
    }

    fun buscarTodos() : List<Nota> {
        return notaRepository.findAll() //select * from...
    }

    fun apagar(id: String) {
        notaRepository.deleteById(id)
    }

    fun buscarPor(id: String): Nota {
        return notaRepository.findById(id).get()
    }

    fun buscarPorTitulo(titulo: String): List<Nota> {
        return notaRepository.findByTituloContainingIgnoreCase(titulo)
    }
}