package mini_compiler;

/*
 Grupo: João Victor Martelleto de Paula Teixeira
*/

import lexical.Scanner;
import lexical.Token;
import lexical.LexicalException;

public class Main {
    public static void main(String[] args) {
        String filename = "programa.mc";
        Scanner sc = new Scanner(filename);
        try {
            Token tk;
            do {
                tk = sc.nextToken();
                if (tk != null) System.out.println(tk);
            } while (tk != null);
        } catch (LexicalException e) {
            System.err.println(e.toString());
        }
    }
}


