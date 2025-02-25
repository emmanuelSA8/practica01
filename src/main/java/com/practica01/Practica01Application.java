package com.practica01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Practica01Application {

    public static void main(String[] args) {
        SpringApplication.run(Practica01Application.class, args);
        System.out.println("🚀 Servidor iniciado en: http://localhost:91/arboles");

        // 🔹 Mantiene la aplicación activa hasta que presiones ENTER
        Scanner scanner = new Scanner(System.in);
        System.out.println("Presiona ENTER para cerrar la aplicación...");
        scanner.nextLine();
    }
}
