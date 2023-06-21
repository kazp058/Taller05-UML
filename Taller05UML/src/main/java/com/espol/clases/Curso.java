/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.clases;

import com.espol.abstractas.ActividadSumativa;

/**
 *
 * @author CltControl
 */
public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    
    private ActividadSumativa[] actividadesSumativas;
    private Foro[] foros;
    
    private Estudiante[] estudiantesEnEsperaDeInscripcion;
    private Estudiante[] estudiantesInscritos;
    
    private Profesor responsable;
    
}
