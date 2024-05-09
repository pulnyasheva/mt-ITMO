package generator;

import java.util.List;

public record Term(String name, List<String> args, String defArgs) {
}
