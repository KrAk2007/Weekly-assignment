package org.example.week9and10;

class NullPointerDemo {
    public static void generate() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handle() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled");
        }
    }

    public static void main(String[] args) {
        try {
            generate();
        } catch (Exception e) {
            System.out.println("Generated");
        }
        handle();
    }
}
