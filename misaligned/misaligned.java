import java.util.ArrayList;
import java.util.List;

public class Misaligned {
    static String[] majorColors = {"White", "Red", "Black", "Yellow", "Violet"};
    static String[] minorColors = {"Blue", "Orange", "Green", "Brown", "Slate"};

    static List<String> getColorMapLines() {
        List<String> output = new ArrayList<>();
        for (int i = 0; i < majorColors.length; i++) {
            for (int j = 0; j < minorColors.length; j++) {
                String line = String.format("%d | %s | %s", i * 5 + j, majorColors[i], minorColors[i]);
                output.add(line);
            }
        }
        return output;
    }

    static int printColorMap() {
        List<String> lines = getColorMapLines();
        for (String line : lines) {
            System.out.println(line);
        }
        return lines.size();
    }

    public static void main(String[] args) {
        int result = printColorMap();
        assert(result == 25);
        System.out.println("All is well (maybe!)");
    }
}
