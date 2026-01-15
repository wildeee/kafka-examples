package br.com.kafkatestes.kafka_teste

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaTesteSpring3Application

fun main(args: Array<String>) {
	runApplication<KafkaTesteSpring3Application>(*args)
}
