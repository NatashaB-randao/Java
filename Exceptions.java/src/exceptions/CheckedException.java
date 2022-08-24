//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package br.com.dio.exceptions;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;

public class CheckedException {
    public CheckedException() {
    }

    public static void main(String[] args) {
        String nomeDoArquivo = "romance-blake-crouch.txt";

        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException var7) {
            JOptionPane.showMessageDialog((Component)null, "Revise o nome do arquivo que você deseja imprimir! " + var7.getCause());
            var7.printStackTrace();
        } catch (IOException var8) {
            JOptionPane.showMessageDialog((Component)null, "Ocorreu um erro inesperado! Entre em contato com o suporte! " + var8.getCause());
        } finally {
            System.out.println("Chegou no finally!");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);
        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(line != null);

        bw.flush();
        br.close();
    }
}
