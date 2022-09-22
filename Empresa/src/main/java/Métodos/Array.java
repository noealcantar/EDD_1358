/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Métodos;

import Métodos.Trabajador;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

/**
 *
 * @author hp
 */

public class Array <Empresa>{

    public Array(File Arch) throws IOException {
        this.Ruta = Empresa.toPath();
        this.lector = Files.newBufferedReader(Ruta);
    }

       //C:\Users\hp\Documents\NetBeansProjects\Empresa\src
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File Arch = new File("C:\\Users\\hp\\Documents\\NetBeansProjects\\Empresa\\src");
        Array Prueba = new Array (Arch);//Sirve
        Prueba.Lista_Sueldo();
        System.out.println("--------------------|-|-|-|-|--------------------");
        
    }

    int rozmiar = 0;
    String LineasL = "";
    ArrayList<ArrayList<String>> OutterArray = new ArrayList();
    Trabajador < Empresa > Array 
    String[] Lineas;
    String[] TamLis;
    Trabajador Emp;
    Trabajador Imp;
    Trabajador Maximus;
    Trabajador MediumMax;
    Trabajador Minumus;
    Trabajador MediumMin;
    
    
    
    public void Lista_Sueldo() {
        for (int rozmita = 0; rozmita < Trabajador.getlenght(); rozmita++) {
            Imp = Trabajador.getitem(rozmita);
            System.out.println("Id: " + Imp.getNumeroTrabajador() + "; Sueldo: " + Imp.CalcularSueldo());
        }
    }
    
            Path Ruta;
            BufferedReader lector;
            String Leido;

            while (( =Trabajador.Empresa(Array){
                Lineas = Leido.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                TamLis = Leido.split("\n");
                rozmiar += TamLis.length;
                ArrayList<String> InnerArray = new ArrayList();
                for (String datos : Lineas) {
                    InnerArray.add(datos);
                }
                OutterArray.add(InnerArray);
        return null;
            }
}
        


        