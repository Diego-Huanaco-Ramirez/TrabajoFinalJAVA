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
public class Asignaturas {
    
    private String Codigo;
    private String Nombre;
    private String hrsCat;
    private String hrsLab;
    private String hrsTal;

    public Asignaturas(String Codigo, String Nombre, String hrsCat, String hrsLab, String hrsTal) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.hrsCat = hrsCat;
        this.hrsLab = hrsLab;
        this.hrsTal = hrsTal;
    }

    public String getCodigo() {
        return Codigo;
    }

        public String getNombre() {
        return Nombre;
    }

    public String getHrsCat() {
        return hrsCat;
    }

    public String getHrsLab() {
        return hrsLab;
    }

    public String getHrsTal() {
        return hrsTal;
    }
    
    
}
