//package LearningJava1.OwnPractice.numbertheory;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.chart.NumberAxis;
//import javafx.scene.chart.ScatterChart;
//import javafx.scene.chart.XYChart;
//import javafx.stage.Stage;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class GoldbachCIntensity extends Application {
//
//    @Override
//    public void start(Stage stage) {
//        // Initialize PrimeIntensityMap to collect prime numbers and their intensity
//        Map<Integer, Integer> PrimeIntensityMap = new HashMap<>();
//
//        // Run the GoldbachConjecture code to generate prime numbers and their intensity
//        int n = 100; // Number of even numbers to generate and check
//        for (int i = 2; i <= n; i++) {
//            updatePrimeIntensityMap(2 * i, PrimeIntensityMap);
//        }
//
//        // Create the ScatterChart
//        NumberAxis xAxis = new NumberAxis();
//        NumberAxis yAxis = new NumberAxis();
//        ScatterChart<Number, Number> scatterChart = new ScatterChart<>(xAxis, yAxis);
//        xAxis.setLabel("Prime Number");
//        yAxis.setLabel("Intensity");
//
//        // Add data to the ScatterChart
//        XYChart.Series<Number, Number> series = new XYChart.Series<>();
//        for (Map.Entry<Integer, Integer> entry : PrimeIntensityMap.entrySet()) {
//            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
//        }
//
//        scatterChart.getData().add(series);
//
//        // Create the Scene and set it on the stage
//        Scene scene = new Scene(scatterChart, 800, 600);
//        stage.setScene(scene);
//        stage.setTitle("Prime Number Intensity Plotter");
//        stage.show();
//    }
//
//    // Update PrimeIntensityMap with prime numbers and their intensity
//    static void updatePrimeIntensityMap(int num, Map<Integer, Integer> PrimeIntensityMap) {
//        for (int i = 2; i <= num / 2; i++) {
//            if (checkPrime(i) && checkPrime(num - i)) {
//                PrimeIntensityMap.put(i, PrimeIntensityMap.getOrDefault(i, 0) + 1);
//                PrimeIntensityMap.put(num - i, PrimeIntensityMap.getOrDefault(num - i, 0) + 1);
//            }
//        }
//    }
//
//    // Check if a number is prime
//    static boolean checkPrime(int n) {
//        if (n <= 1) return false;
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) return false;
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
//
