package com.dancingcloudservices;

sealed interface X permits Main {}
public record Main(String msg) implements X {
    public static void main(String[] args) {
        X x = new Main("Hello Java 17 world!");
        System.out.println(x instanceof Main m ? m.msg : "Uh oh!");
    }
}
