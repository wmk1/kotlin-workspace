package com.example.demo.controller

import org.springframework.http.ResponseEntity
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.kafka.support.SendResult
import org.springframework.util.concurrent.ListenableFuture
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

class RepositoryController {

    var kafkaTemplate: KafkaTemplate<String, String>? = null;

    val topic:String = "test_topic"

    @GetMapping("/send")
    fun sendMessage(@RequestParam("message") message : String) : ResponseEntity<String> {
        var listenableFuture : ListenableFuture<SendResult<String, String>> = kafkaTemplate?.send(topic, message)!!
        var sendResult: SendResult<String, String> = listenableFuture.get()
        return ResponseEntity.ok(sendResult.producerRecord.value() + " sent to topic")
    }
}