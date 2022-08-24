package exceptions;

//Fazer a divisão de 2 valores inteiros


import javax.swing.*;
import java.awt.*;

public class UncheckedExceptions {
    public static void main(String[] args) {

        boolean ContinueLooping = true;
        boolean continueLooping = false;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                boolean ContinueLoopingontinueLooping = false;
            } catch (NumberFormatException var9) {
                var9.printStackTrace();
                JOptionPane.showMessageDialog((Component)null, "Entrada inválida, informe um número inteiro! " + var9.getMessage());
            } catch (ArithmeticException var10) {
                var10.printStackTrace();
                JOptionPane.showMessageDialog((Component)null, "Impossível dividir um número por 0.");
            } finally {
                System.out.println("Chegou no finally!");
            }
        } while(continueLooping);

        System.out.println("O código continua...");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
