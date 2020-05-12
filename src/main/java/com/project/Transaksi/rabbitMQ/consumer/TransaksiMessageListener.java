package com.project.Transaksi.rabbitMQ.consumer;

import com.project.Transaksi.model.Order;
import com.project.Transaksi.model.Transaksi;
import com.project.Transaksi.rabbitMQ.config.RabbitConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TransaksiMessageListener {
    static final Logger logger = LoggerFactory.getLogger(TransaksiMessageListener.class);
    private Transaksi transaksi;

    @RabbitListener(queues = RabbitConfig.QUEUE_ORDERS)
    public void processOrder(Transaksi transaksi) {
        logger.info("Transaksi Received: "+transaksi);
        this.transaksi = transaksi;
    }


    public Transaksi getTransaksi() {
        return transaksi;
    }


}
