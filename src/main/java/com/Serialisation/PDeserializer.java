package com.Serialisation;
import org.apache.kafka.common.serialization.Deserializer;
import org.codehaus.jackson.map.ObjectMapper;
import java.util.Map;

/**
 * The type P deserializer.
 */
public class PDeserializer implements Deserializer {
    @Override
    public void configure(Map configs, boolean isKey) {
        //Nothing to configure
    }

    @Override
    public Object deserialize(String topic, byte[] data) {
        ObjectMapper objectMapper = new ObjectMapper();

        return null;
    }
}
