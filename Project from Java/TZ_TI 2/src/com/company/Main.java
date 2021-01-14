package com.company;

public class Main {

    public static void main(String[] args) {
        float p_x1_y1 = 0.12f, p_x1_y2 = 0.33f, p_x2_y1 = 0.05f, p_x2_y2 = 0.24f, p_x3_y1 = 0.15f, p_x3_y2 = 0.11f;
        float p_x1 = p_x1_y1 + p_x1_y2;
        float p_x2 = p_x2_y1 + p_x2_y2;
        float p_x3 = p_x3_y1 + p_x3_y2;
        float p_y1 = p_x1_y1 + p_x2_y1 + p_x3_y1;
        float p_y2 = p_x1_y2 + p_x2_y2 + p_x3_y2;
        System.out.println("P(x1) = " + p_x1);
        System.out.println("P(x2) = " + p_x2);
        System.out.println("P(x3) = " + p_x3);
        System.out.println("P(y1) = " + p_y1);
        System.out.println("P(y2) = " + p_y2);
        double hx = -(p_x1 * Math.log(p_x1))-(p_x2 * Math.log(p_x2))-(p_x3 * Math.log(p_x3));
        System.out.println("Hx = " + hx);
        double hy = -(p_y1 * Math.log(p_y1))-(p_y2 * Math.log(p_y2));
        System.out.println("Hy = " + hy);
        if (hx < hy)  System.out.println("Hx < Hy ");
        else if (hx > hy)  System.out.println("Hx > Hy ");
        else if (hx == hy)  System.out.println("Hx = Hy ");
    }
}
