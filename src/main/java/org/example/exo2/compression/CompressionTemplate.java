package org.example.exo2.compression;

public abstract class CompressionTemplate {
    public final int[] compress(int[] data) {

        // ...
        return applyCompression(data);
    }

    protected abstract int[] applyCompression(int[] data);
}