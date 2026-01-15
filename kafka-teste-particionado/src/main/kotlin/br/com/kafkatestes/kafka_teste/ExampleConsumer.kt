package br.com.kafkatestes.kafka_teste

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class ExampleConsumer {

    @KafkaListener(topics = ["topic-c"])
    fun consumeTopicC(message: String) {
        println("Recebido do topic-c: $message")
    }

    @KafkaListener(topics = ["topic-d"])
    fun consumeTopicD(message: String) {
        println("Recebido do topic-d: $message")
    }

}
