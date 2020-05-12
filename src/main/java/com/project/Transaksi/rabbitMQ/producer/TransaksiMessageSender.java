package com.project.Transaksi.rabbitMQ.producer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.Transaksi.model.Order;
import com.project.Transaksi.model.Transaksi;
import com.project.Transaksi.rabbitMQ.config.RabbitConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransaksiMessageSender {
    private final RabbitTemplate rabbitTemplate;
    private final ObjectMapper objectMapper;

    @Autowired
    public TransaksiMessageSender(RabbitTemplate rabbitTemplate, ObjectMapper objectMapper) {
        this.rabbitTemplate = rabbitTemplate;
        this.objectMapper = objectMapper;
    }

    public void sendOrder(Transaksi transaksi) {
        this.rabbitTemplate.convertAndSend(RabbitConfig.QUEUE_ORDERS, transaksi);
    }
}
