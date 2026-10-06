package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ServerSocket ss = new ServerSocket(3000);
        Socket s = ss.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(ss.getInputStream()));
        PrintWriter out = new PrintWriter(ss.getOutputStream(), true);

        System.out.println("Qualcuno si è collegato");

        do {
            String parola = in.readLine();
            if (parola.equals("")) {
                break;
            }
            String parolaMaiuscola = parola.toUpperCase();
            out.println(parolaMaiuscola);
        } while (true);
    }
}