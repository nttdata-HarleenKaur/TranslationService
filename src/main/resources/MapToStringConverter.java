import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import software.amazon.awssdk.enhanced.dynamodb.AttributeConverter;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

import java.util.Map;

public class MapToStringConverter implements AttributeConverter<Map<String, String>> {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    @Override
    public AttributeValue transformFrom(Map<String, String> input) {
        try {
            return AttributeValue.builder().s(MAPPER.writeValueAsString(input)).build();
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to convert map to string", e);
        }
    }

    @Override
    public Map<String, String> transformTo(AttributeValue input) {
        try {
            return MAPPER.readValue(input.s(), Map.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to convert string to map", e);
        }
    }

    @Override
    public EnhancedType<Map<String, String>> type() {
        return EnhancedType.mapOf(String.class, String.class);
    }
}
