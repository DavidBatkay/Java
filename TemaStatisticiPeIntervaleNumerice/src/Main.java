import java.io.*;
import java.util.*;

class Interval {
    private double lowerBound;
    private double upperBound;
    private int totalNumbersTested;
    private int numbersContained;

    public Interval(double lowerBound, double upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.totalNumbersTested = 0;
        this.numbersContained = 0;
    }

    public void testNumber(Double number) {
        if (number >= lowerBound && number <= upperBound) {
            numbersContained++;
        }
        totalNumbersTested++;
    }

    public double getPercentage() {
        if (totalNumbersTested == 0) {
            return 0.0;
        }
        return (double) numbersContained / totalNumbersTested * 100;
    }

    public void writeStatisticsToFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println("Interval [" + lowerBound + ", " + upperBound + "]: " + getPercentage() + "%");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String intervalsFileName = "intervale.dat";
        String numbersFileName = "numere.dat";
        String statisticsFileName = "statistica.dat";

        try (Scanner intervalsScanner = new Scanner(new File(intervalsFileName));
             Scanner numbersScanner = new Scanner(new File(numbersFileName))) {

            List<Interval> intervalList = new ArrayList<>();
            while (intervalsScanner.hasNextLine()) {
                String line = intervalsScanner.nextLine();
                String[] bounds = line.substring(1, line.length() - 1).split(",");
                double lowerBound = Double.parseDouble(bounds[0]);
                double upperBound = Double.parseDouble(bounds[1]);
                intervalList.add(new Interval(lowerBound, upperBound));
            }

            while (numbersScanner.hasNext()) {
                Double number = Double.parseDouble(numbersScanner.next());
                for (Interval interval : intervalList) {
                    interval.testNumber(number);
                }
            }

            for (Interval interval : intervalList) {
                interval.writeStatisticsToFile(statisticsFileName);
            }

            System.out.println("Statistics written to " + statisticsFileName);

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}