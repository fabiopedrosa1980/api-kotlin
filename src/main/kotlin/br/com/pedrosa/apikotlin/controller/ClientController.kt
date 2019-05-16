package br.com.pedrosa.apikotlin.controller

import br.com.pedrosa.apikotlin.repository.ClientRepository
import br.com.pedrosa.apikotlin.domain.Client

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.beans.factory.annotation.Autowired
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


@RestController
@RequestMapping("client")
class ClientController {

    @Autowired
    lateinit var clientRepository: ClientRepository

    @GetMapping
    fun list(): Flux<Client> {
        return this.clientRepository.findAll()
    }

    @PostMapping
    fun add(@RequestBody client: Client): Mono<Client> {
        return this.clientRepository.save(client)
    }

}