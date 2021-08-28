package com.company;

public class Main {

    public static void main(String[] args) {

        Admin admin = new Admin();//se intancia la clase y llama la informacion de clase de admin y la herencia
        admin.setRol("superuser"); //se envia un dato al rol el cual admin hereda de perfil
        System.out.println(admin.getRol());


    }
}
