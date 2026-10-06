package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        ServerSocket ss = new ServerSocket(3000);
        Socket s = ss.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        System.out.println("Qualcuno si è collegato");

        do {
            String parola = in.readLine();
            if (parola.equals("exit")) {
                break;
            }
            String parolaMaiuscola = parola.toUpperCase();
            out.println(parolaMaiuscola);
        } while (true);
    }
}