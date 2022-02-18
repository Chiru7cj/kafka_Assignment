package com.Consumer;
import java.util.*;
import org.apache.kafka.clients.consumer.KafkaConsumer;


/**
 * The type Consumer.
 */
public class Consumer {
    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args) {
        ConsumerListener c = new ConsumerListener();
        Thread thread = new Thread(c);
        thread.start();
    }

    /**
     * Consumer.
     */
    public static void consumer() {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "com.knoldus.Serialisation.PDeserializer");
        props.put("group.id", "test-group");
        KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<>(props);
        kafkaConsumer.subscribe(Collections.singletonList("Mytopic"));
        System.out.println("Subscribed to topic ");
        }
    }

/**
 * The type Consumer listener.
 */
class ConsumerListener implements Runnable {
    @Override
        public void run() {
        Consumer.consumer();
    }
    }
