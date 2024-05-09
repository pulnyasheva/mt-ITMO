package generator;

import java.util.List;
import java.util.Map;

public record Rule(Map<String, String> args, String returnType, List<Variant> variants) {
}
