package br.com.kafkatestes.kafka_teste

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class ExampleProducer(
    private val kafkaTemplate: KafkaTemplate<String, String>
) {
    fun sendMessages() {
        for (i in 1..50) {
            kafkaTemplate.send("topic-a", "Mensagem para o tópico A $i")
        }

        for (i in 1..50) {
            kafkaTemplate.send("topic-b", "Mensagem para o tópico B $i")
        }
    }
}