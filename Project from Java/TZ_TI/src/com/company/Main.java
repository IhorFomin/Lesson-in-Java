package com.company;

public class Main {

    public static void main(String[] args) {
        double m = 4;
        double p1 = 0.22f;
        double p2 = 0.33f;
        double p3 = 0.05f;
        double p4 = 0.4f;
        float t1 = 2.2f;
        float t2 = 1.8f;
        float t3 = 0.5f;
        float t4 = 3f;
        double h;
        h = -(p1 * Math.log(p1))-(p2 * Math.log(p2))-(p3 * Math.log(p3))-(p4 * Math.log(p4));
        System.out.println("H = " + h);
        double ts;
        ts = (t1 * p1)+(t2 * p2)+(t3 * p3)+(t4 * p4);
        System.out.println("Ts = " + ts);
        double hm;
        hm = h / ts;
        System.out.println("Hmax = " + hm);
        double r;
        r = 1 - (h / Math.log(m));
        System.out.println("R = " + r);
    }
}
