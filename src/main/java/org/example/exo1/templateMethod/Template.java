package org.example.exo1.templateMethod;

public abstract class Template {
    public double templateMethod(int a, int b){
return a+b;
    }
    protected abstract double partOne(int a, int b);
    protected abstract double partTwo(int a, int b);

}
