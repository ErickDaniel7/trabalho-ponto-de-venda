/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cadastrarcerveja;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class CadastrarCerveja {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        System.out.println("Qual o nome da marca da cerveja: ");
        String SetarMarca = ler.next();
        System.out.print("Qual o cheiro da cerveja: ");
        String SetarCheiro = ler.next();
        System.out.print ("Qaual a idade da cerveja:");
        int SetarIdade = ler.nextInt();
        System.out.print ("Qaul o preço da cerveja: ");
        int SetarPreco = ler.nextInt();
        System.out.print ("Qual a localidade da cerveja: ");
        String SetarLocalidade = ler.next();
        System.out.print ("Qual o gosto da cerveja: ");
        String SetarGosto = ler.next();
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        Cerveja skol = new Cerveja();
        skol.cerveja = "adoçicado";
        skol.SetarCheiro = "doce";
        skol.SetarIdade = ("2");
        skol.SetarPreco = ("5");
        skol.SetarLocalidade("Europa");
        skol.Getcodigo("");
        
        Cerveja brahma = new Cerveja();
        brahma.SetarGosto = "aguado";
        brahma.cheiro = "adocicado";
        brahma.SetarIdade = ("1");
        brahma.SetarPreco = ("3");
        brahma.SetarLocalidade ("Rio de Janeiro");
        brahma.Getcodigo("");
        
        Cerveja heineken = new Cerveja();
        heineken.SetarGosto = "picante";
        heineken.SetarCheiro = "perfumado";
        heineken.SetarIdade = ("3");
        heineken.SetarPreco = ("6");
        heineken.SetarLocalidade("Amsterdã");
        heineken.Getcodigo("");
        
        Cerveja itaipava = new Cerveja();
        itaipava.SetarGosto = "maltado";
        itaipava.SetarCheiro = "repugnante";
        itaipava.SetarIdade = ("3");
        itaipava.SetarPreco = ("2");
        itaipava.SetarLocalidade("Brasil");
        itaipava.Getcodigo("");
        
        Cerveja kaiser = new Cerveja();
        kaiser.SetarGosto = "picante";
        kaiser.SetarCheiro = "agradável";
        kaiser.SetarIdade = ("7");
        kaiser.SetarPreco = ("6");
        kaiser.SetarLocalidade("Minas Gerais");
        kaiser.Getcodigo("");
        
        
    }
}
