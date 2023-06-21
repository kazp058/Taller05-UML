/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.clases;

import java.time.LocalDateTime;

/**
 *
 * @author CltControl
 */
public class Incidente {
    protected int id;
    protected LocalDateTime fecha_reportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected String[] log_actualizaciones;
    protected LocalDateTime fecha_cerrado;
    protected String tipo;
    
    protected Usuario responsable;
    protected Usuario beneficiario;
}
