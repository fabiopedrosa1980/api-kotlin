package br.com.pedrosa.apikotlin.controller

import br.com.pedrosa.apikotlin.repository.ClientRepository
import br.com.pedrosa.apikotlin.domain.Client
import org.springframework.web.bind.annotation.*

import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


@RestController
@RequestMapping("client")
class ClientController(private val clientRepository: ClientRepository) {


    @GetMapping
    fun list(): Flux<Client> {
        return this.clientRepository.findAll()
    }

    @GetMapping("{id}")
    fun find(@PathVariable id: String): Mono<Client> {
        return this.clientRepository.findById(id)
    }

    @PostMapping
    fun add(@RequestBody client: Client): Mono<Client> {
        return this.clientRepository.save(client)
    }

    @PutMapping
    fun update(@RequestBody client: Client): Mono<Client> {
        return this.clientRepository.save(client)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: String) {
        this.clientRepository.deleteById(id)
    }

}