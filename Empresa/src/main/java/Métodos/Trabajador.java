/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Métodos;

/**
 *
 * @author hp
 */
public class Trabajador {
    
    private String numeroTrabajador;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int horasExtra;
    private int sueldoBase;
    private int anioIngreso;
    private int antiguedad;
    private int total;
    private double pagoHorasExtra = 275.5;

    public Trabajador(String nT, String nom, String pat, String mat, int horExt, int suel, int anio) {
        this.numeroTrabajador = nT;
        this.nombre = nom;
        this.apellidoPaterno = pat;
        this.apellidoMaterno = mat;
        this.horasExtra = horExt;
        this.sueldoBase = suel;
        this.anioIngreso = anio;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public String getNumeroTrabajador() {
        return numeroTrabajador;
    }

    public void setNumeroTrabajador(String numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
     public String toString() { 
        String Stan = "";
        Stan += numeroTrabajador + "\n";
        Stan += nombre + "\n";
        Stan += apellidoPaterno + "\n";
        Stan += apellidoMaterno + "\n";
        Stan += horasExtra + "\n";
        Stan += sueldoBase + "\n";
        Stan += anioIngreso;
        return Stan;
    }
    
       public double CalcularSueldo() {
        int Ant = 2022 - this.anioIngreso;
        total = (int) ((int) (this.sueldoBase + (this.sueldoBase * (antiguedad * 0.03) ))
                + this.horasExtra * pagoHorasExtra);
        return total;
       }

    }
}
