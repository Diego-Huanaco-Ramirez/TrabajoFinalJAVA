/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

/**
 *
 * @author PC
 */
public class Alumno {
    
    private String rut;
    private String Nombre;
    private String año;
    private String sexo;

    public Alumno(String rut, String Nombre, String año, String sexo) {
        this.rut = rut;
        this.Nombre = Nombre;
        this.año = año;
        this.sexo = sexo;
    }


    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getAño() {
        return año;
    }

    public String getSexo() {
        return sexo;
    }
    
}
