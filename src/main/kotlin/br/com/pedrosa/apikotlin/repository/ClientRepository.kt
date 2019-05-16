package br.com.pedrosa.apikotlin.repository

import br.com.pedrosa.apikotlin.domain.Client
import org.springframework.data.repository.reactive.ReactiveSortingRepository

interface ClientRepository: ReactiveSortingRepository<Client,String> {
}