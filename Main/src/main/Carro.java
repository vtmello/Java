package main;

import javax.swing.JOptionPane;

public class Carro {

    private String marca;
    private int ano;
    private int marcha;
    private boolean ligado;
    private int velocidade;
    private boolean freio;

    public void ligar() {
        if (this.ligado == false) {
            this.ligado = true;
            JOptionPane.showMessageDialog(null, "Carro Ligado");
        } else {
            System.out.println("Carro já está ligado.");
        }
    }

    public void acelerar(int velocidade) {
        if (this.ligado == true) {
            if (this.freio == false) {
                if (this.marcha == 0) {
                    JOptionPane.showMessageDialog(null, "Está em ponto morto.");
                } else if (this.marcha == 1) {
                    if (velocidade < 30) {
                        this.velocidade = velocidade;
                        System.out.println(this.velocidade);
                    }
                } else if (this.marcha == 2) {
                    if (velocidade < 50) {
                        this.velocidade = velocidade;
                        System.out.println(this.velocidade);
                    }
                } else if (this.marcha == 3) {
                    if (velocidade < 80) {
                        this.velocidade = velocidade;
                        System.out.println(this.velocidade);
                    }
                }
            }
        }
    }

    public void desligar() {
        if (this.ligado == true) {
            this.ligado = false;
            JOptionPane.showMessageDialog(null, "Carro desligado.");
        } else {
            System.out.println("Carro já se encontra desligado.");
        }
    }

    public void trocarMarcha() {
        this.marcha = this.marcha + 1;
    }

}
