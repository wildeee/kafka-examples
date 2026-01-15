package br.com.kafkatestes.kafka_teste

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class ExampleProducer(
    private val kafkaTemplate: KafkaTemplate<String, String>
) {
    fun sendMessages() {
        for (i in 1..10) {
            kafkaTemplate.send("topic-c", (i % 3), (i % 3).toString(), "Mensagem para o tópico C $i")
        }

        for (i in 1..10) {
            kafkaTemplate.send("topic-d", (i % 3), (i % 3).toString(), "Mensagem para o tópico D $i")
        }
    }
}