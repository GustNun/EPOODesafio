package dominio;
import java.lang.Math;

public class Paralelepipedo {
    private float arestaA;
    private float arestaB;
    private float arestaC;
    
    public Paralelepipedo(float arestaA, float arestaB, float arestaC){
        this.arestaA = arestaA;
        this.arestaB = arestaB;
        this.arestaC = arestaC;
    }

    public float getArestaA() {
        return arestaA;
    }

    public void setArestaA(float arestaA) {
        this.arestaA = arestaA;
    }

    public float getArestaB() {
        return arestaB;
    }

    public void setArestaB(float arestaB) {
        this.arestaB = arestaB;
    }

    public float getArestaC() {
        return arestaC;
    }

    public void setArestaC(float arestaC) {
        this.arestaC = arestaC;
    }
    public double lado() { 
        return Math.sqrt((arestaA*arestaA)+(arestaB*arestaB));
    }
    
    public double diagonal() { 
        return Math.sqrt((lado()*lado())+(arestaC*arestaC));
    }
}
