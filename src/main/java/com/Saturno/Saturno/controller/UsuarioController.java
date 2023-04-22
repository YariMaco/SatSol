/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Saturno.Saturno.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @GetMapping("/cuenta")
    public String showMiCuenta() {
        return "miCuenta";
    }

    @GetMapping("/cuenta/cambioC")
    public String showCambioContrasena() {
        
        return "cambioContrasena";
    }
    @PostMapping("/cuenta/cambioC")
    public String cambioContrasena() {
        
        return "reestablecida";
    }
    

    @GetMapping("/cuenta/cambioT")
    public String showCambioTelefono() {
        return "cambioTelefono";
    }

    
}
