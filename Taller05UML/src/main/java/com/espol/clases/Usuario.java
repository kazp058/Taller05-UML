/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.clases;

/**
 *
 * @author CltControl
 */
public class Usuario {
    protected String usuario;
    protected String contrasena;
    protected String nombre;
    protected String apellido;
    
    protected Incidente[] incidentes;
    
    protected boolean logIn(){
        return true;
    }
    
    protected boolean logOut(){
        return false;
    }
}
