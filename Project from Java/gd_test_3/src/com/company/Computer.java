package com.company;

public class Computer {
    class Proccessor {
        private boolean isStar = false;
        public void start () {
            isStar = true;
        }
        public void shutdown () {
            isStar = false;
        }
    }
    class RAM {
        private boolean isStar = false;
        public void start () {
            isStar = true;
            System.out.println("isStar = " + isStar);
        }
        public void shutdown () {
            isStar = false;
            System.out.println("isStar = " + isStar);
        }
    }
    Proccessor i7 = new Proccessor();
    RAM transfer = new RAM();
}
