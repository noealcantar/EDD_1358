/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Métodos;

import Métodos.Array;
import Métodos.Trabajador;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Empresa {

    public Empresa(File Arch) { //Constructor
        try {
            Path Ruta = Arch.toPath();
            BufferedReader lector = Files.newBufferedReader(Ruta);
            String Leido;

            while ((Leido = lector.readLine()) != null) {
                Lineas = Leido.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                TamLis = Leido.split("\n");
                rozmiar += TamLis.length;
                ArrayList<String> InnerArray = new ArrayList();
                for (String datos : Lineas) {
                    InnerArray.add(datos);
                }
                OutterArray.add(InnerArray);
            }

            //Esta parte es para asignar los valores al ADT Empleado
            Nomina = new Array (rozmiar - 1);
            int Columnas = 0;
            for (int Filas = 1; Filas < OutterArray.size(); Filas++) {
                Tra = new Trabajador (Integer.parseInt(OutterArray.get(Filas).get(0)), OutterArray.get(Filas).get(1), OutterArray.get(Filas).get(2), OutterArray.get(Filas).get(3), Integer.parseInt(OutterArray.get(Filas).get(4)), Integer.parseInt(OutterArray.get(Filas).get(5)), Integer.parseInt(OutterArray.get(Filas).get(6)));
                Nomina.setItem(Columnas, Emp);
                Columnas++;
            }

        } catch (IOException ex) {
        }

    }

    public void Lista_Sueldo() {
        for (int rozmita = 0; rozmita < Array.getLenght(); rozmita++) {
            Imp = Array.getItem(rozmita);
            System.out.println("Id: " + Imp.getNumeroTrabajador() + "; Sueldo: " + Imp.CalcularSueldo());
        }
    }

    public void Mayor_Ant() {
        int Max = 2023;
        String Who = "";
        String SeWho = "";
        for (int ind = 0; ind < Array.getLenght(); ind++) {
            Maximus = Array.getItem(ind);
            if (Maximus.getAnioIngreso() < Max) {
                Max = Maximus.getAnioIngreso();
                Who = Maximus.getNombre();
            }
        }
        System.out.println("Persona con mayor antiguedad: " + Who + ", desde: " + Max);

        for (int ind = 0; ind < Array.getLenght(); ind++) {
            MediumMax = Array.getItem(ind);
            if (MediumMax.getAnioIngreso() < Max && MediumMax.getNombre().equals(Who)) {
                //Si lo encuentra, no hace nada.
            } else {
                Max = MediumMax.getAnioIngreso();
                SeWho = MediumMax.getNombre();
            }
        }
        System.out.println("La segunda persona con mayor antiguedad: " + SeWho + ", desde: " + Max);
    }

    public void Menor_Ant() {
        int Max2 = 2016;
        String Who2 = "";
        String SeWho2 = "";
        for (int ind = 0; ind < Array.getLenght(); ind++) {
            Minumus = Array.getItem(ind);
            if (Minumus.getAnioIngreso() > Max2) {
                Max2 = Minumus.getAnioIngreso();
                Who2 = Minumus.getNombre();
            }
        }
        System.out.println("Persona con menor antiguedad: " + Who2 + ", desde: " + Max2);

        int Max20 = Max2;
        for (int ind = 0; ind < Array.getLenght(); ind++) {
            MediumMin = Array.getItem(ind);
            if (MediumMin.getAnioIngreso() == Max2) {
                if (MediumMin.getNombre().equals(Who2)) {
                    //Si lo encuentra, no hace nada.
                } else {
                    Max2 = MediumMin.getAnioIngreso();
                    SeWho2 = MediumMin.getNombre();
                }
            }
        }
        System.out.println("La segunda persona con menor antiguedad: " + SeWho2 + ", desde: " + Max2);
    }

}
