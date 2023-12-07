import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:/Users/rache/Documents/fun/advent-of-code-2023/two/src/resources/input.txt");
        List<String> lines = Files.readAllLines(path);
        int sumOfIds = 0;
        for (String line : lines) {
            String[] parts = line.split(":");
            String[] games = parts[1].split(";");
            boolean blueGreaterThan14 = false;
            boolean greenGreaterThan13 = false;
            boolean redGreaterThan12 = false;
            for (String game: games){
                String[] colors = game.split(",");
                for (String color: colors){
                    if (color.contains("blue")){
                        String[] numberColor = color.split(" ");
                        if (Integer.parseInt(numberColor[1]) > 14){
                            blueGreaterThan14 = true;
                        }
                    }
                    if (color.contains("green")){
                        String[] numberColor = color.split(" ");
                        if (Integer.parseInt(numberColor[1]) > 13){
                            greenGreaterThan13 = true;
                        }

                    }
                    if (color.contains("red")){
                        String[] numberColor = color.split(" ");
                        if (Integer.parseInt(numberColor[1]) > 12){
                            redGreaterThan12 = true;
                        }

                    }
                }
            }
            if (!blueGreaterThan14 && !greenGreaterThan13 && !redGreaterThan12){
                String[] gameNumber = parts[0].split(" ");
                sumOfIds = sumOfIds + Integer.parseInt(gameNumber[1]);
            }

        }
        System.out.println(sumOfIds);
    }
}