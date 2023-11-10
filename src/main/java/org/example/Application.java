package org.example;

import org.example.exo2.ImageProcessor;
import org.example.exo2.compression.CompressionTemplate;
import org.example.exo2.filter.FilterStrategy;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ImageProcessor imageProcessor = new ImageProcessor();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer le nom du filtre (ConcreteFilter1 or ConcreteFilter2): ");
        String filterClassName = scanner.nextLine();

        System.out.println("Entrer la compression  (ConcreteCompression1 or ConcreteCompression2): ");
        String compressionClassName = scanner.nextLine();

        // Dynamically set filter and compression classes
        try {
            FilterStrategy filterStrategy = (FilterStrategy) Class.forName(filterClassName).newInstance();
            CompressionTemplate compressionTemplate = (CompressionTemplate) Class.forName(compressionClassName).newInstance();

            imageProcessor.setFilterStrategy(filterStrategy);
            imageProcessor.setCompressionTemplate(compressionTemplate);


            int[] processedImage = imageProcessor.process();


            System.out.println("le traitement d'image est terminé avec succes");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
