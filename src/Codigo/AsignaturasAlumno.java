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
public class AsignaturasAlumno {
    
    private String codigo;
    private String semestre;
    private String año;
    private String nota;
    private String situacion;

    public AsignaturasAlumno( String codigo, String semestre,String año, String nota, String situacion) {
        this.codigo = codigo;
        this.semestre = semestre;
        this.año = año;
        this.nota = nota;
        this.situacion = situacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getSemestre() {
        return semestre;
    }

    public String getNota() {
        return nota;
    }

    public String getSituacion() {
        return situacion;
    }    
    
    public String getAño() {
        return año;
    }  
    
    public int encontraAsig(Asignaturas asigDat[])
    {
        for (int i = 0; i < asigDat.length; i++  )
        {
            if(getCodigo().equalsIgnoreCase(asigDat[i].getCodigo()))
                return i;
        }
        return -1;
    }
    
}
