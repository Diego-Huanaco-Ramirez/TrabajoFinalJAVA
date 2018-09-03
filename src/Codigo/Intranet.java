/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import interfaz.Inicio;

/**
 *
 * @author PC
 */
public class Intranet {

    public static Inicio inicio;
    public static AsignaturasAlumno[] asigAl = new AsignaturasAlumno[1000];
    public static Asignaturas[] asigDat = new Asignaturas[16];
    public static Alumno[] alumno = new Alumno[1];
    public static int contAsig;
    public static int posAsig;
    public static int posAsigal;

    public static void main(String[] args) {
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        
    }
    
}
