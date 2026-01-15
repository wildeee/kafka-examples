package br.com.kafkatestes.kafka_teste

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ProducerEndpoint(
    private val producer: ExampleProducer,
) {

    @PostMapping("/produce")
    fun produce() {
        producer.sendMessages()
    }

}