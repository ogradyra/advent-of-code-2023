import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:/Users/rache/Documents/fun/advent-of-code-2023/one/src/resources/input.txt");
        List<String> lines = Files.readAllLines(path);
        int calibrationTotal = 0;
        for (String line : lines){
            StringBuilder calibrationString = new StringBuilder();
            partOne(calibrationString, line);
            //partTwo(calibrationString, line);
            calibrationTotal = calibrationTotal + Integer.parseInt(String.valueOf(calibrationString));
        }
        System.out.println(calibrationTotal);
    }

    private static void partOne(StringBuilder calibrationString, String line) {
        getDigit(calibrationString, line);
        StringBuilder reverse = reverseLine(line);
        getDigit(calibrationString, reverse.toString());
    }

    private static void partTwo(StringBuilder calibrationString, String line) {
        getWordDigit(calibrationString, line);
        StringBuilder reverse = reverseLine(line);
        getReverseWordDigit(calibrationString, reverse.toString());
    }

    private static void getDigit(StringBuilder calibrationString, String line) {
        for (char c : line.toCharArray()) {
            if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4'
                    || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
                calibrationString.append(c);
                break;
            }
        }
    }

    private static void getWordDigit(StringBuilder calibrationString, String line) {
        StringBuilder wordNumber = new StringBuilder();
        for (char c : line.toCharArray()) {
            if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4'
                    || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
                calibrationString.append(c);
                break;
            }
            else {
                wordNumber.append(c);
                if (wordNumber.toString().contains("zero")){
                    calibrationString.append("0");
                    break;
                }
                if (wordNumber.toString().contains("one")){
                    calibrationString.append("1");
                    break;
                }
                if (wordNumber.toString().contains("two")){
                    calibrationString.append("2");
                    break;
                }
                if (wordNumber.toString().contains("three")){
                    calibrationString.append("3");
                    break;
                }
                if (wordNumber.toString().contains("four")){
                    calibrationString.append("4");
                    break;
                }
                if (wordNumber.toString().contains("five")){
                    calibrationString.append("5");
                    break;
                }
                if (wordNumber.toString().contains("six")){
                    calibrationString.append("6");
                    break;
                }
                if (wordNumber.toString().contains("seven")){
                    calibrationString.append("7");
                    break;
                }
                if (wordNumber.toString().contains("eight")){
                    calibrationString.append("8");
                    break;
                }
                if (wordNumber.toString().contains("nine")){
                    calibrationString.append("9");
                    break;
                }

            }
        }
    }

    private static void getReverseWordDigit(StringBuilder calibrationString, String line) {
        StringBuilder wordNumber = new StringBuilder();
        for (char c : line.toCharArray()) {
            if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4'
                    || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
                calibrationString.append(c);
                break;
            }
            else {
                wordNumber.append(c);
                if (wordNumber.toString().contains("orez")){
                    calibrationString.append("0");
                    break;
                }
                if (wordNumber.toString().contains("eno")){
                    calibrationString.append("1");
                    break;
                }
                if (wordNumber.toString().contains("owt")){
                    calibrationString.append("2");
                    break;
                }
                if (wordNumber.toString().contains("eerht")){
                    calibrationString.append("3");
                    break;
                }
                if (wordNumber.toString().contains("ruof")){
                    calibrationString.append("4");
                    break;
                }
                if (wordNumber.toString().contains("evif")){
                    calibrationString.append("5");
                    break;
                }
                if (wordNumber.toString().contains("xis")){
                    calibrationString.append("6");
                    break;
                }
                if (wordNumber.toString().contains("neves")){
                    calibrationString.append("7");
                    break;
                }
                if (wordNumber.toString().contains("thgie")){
                    calibrationString.append("8");
                    break;
                }
                if (wordNumber.toString().contains("enin")){
                    calibrationString.append("9");
                    break;
                }

            }
        }
    }

    private static StringBuilder reverseLine(String line) {
        StringBuilder lineBuilder = new StringBuilder();
        lineBuilder.append(line);
        return lineBuilder.reverse();
    }
}