package com.Producer;
import java.util.*;
import org.apache.kafka.clients.producer.*;

/**
 * The type Producer.
 */
public class Producer {

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){

        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092,localhost:9093");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "com.knoldus.Serialisation.PSerializer");
        KafkaProducer<String, String> kafkaProducer = new KafkaProducer<>(props);
        kafkaProducer.send(new ProducerRecord<String,String>("MyTopic", "Message", "Message sent successfully"));
        System.out.println("Producer Completed.");
        kafkaProducer.close();



    }
}