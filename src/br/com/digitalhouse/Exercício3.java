package br.com.digitalhouse;

class Exercício3 {
    public static boolean verificarImparEMaior(Integer num1) {
        return num1 > 10 && num1 % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(verificarImparEMaior(11));
    }
}

