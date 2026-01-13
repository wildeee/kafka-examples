package br.com.kafkatestes.kafka_teste

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class ExampleConsumer {

    @KafkaListener(topics = ["topic-a"])
    fun consumeTopicA(message: String) {
        println("Recebido do topic-a: $message")
    }

    @KafkaListener(topics = ["topic-b"])
    fun consumeTopicB(message: String) {
        println("Recebido do topic-b: $message")
    }

}
