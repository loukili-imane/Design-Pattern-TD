package org.example.exo2;

import org.example.exo2.compression.CompressionTemplate;
import org.example.exo2.filter.FilterStrategy;

public class ImageProcessor {
    private FilterStrategy filterStrategy;
    private CompressionTemplate compressionTemplate;
    private int[] imageData;

    public void setImageData(int[] data) {
        this.imageData = data;
    }

    public void setFilterStrategy(FilterStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

    public void setCompressionTemplate(CompressionTemplate compressionTemplate) {
        this.compressionTemplate = compressionTemplate;
    }

    public int[] process() {
        if (filterStrategy != null) {
            imageData = filterStrategy.filter(imageData);
        }

        if (compressionTemplate != null) {
            imageData = compressionTemplate.compress(imageData);
        }

        return imageData;
    }
}
