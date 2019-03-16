package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller

public class Controlador {
//private List<> valores = new ArrayList<>()

  //  @RequestMapping(path = "/prueba")
    //Public String lista (Model model){
      //  model.addAttribute("lista",valores);
        //return"prueba";

    Cita nueva = new Cita();
   // @RequestMapping(value = "/cv")
  /*  public void registrar(){

    } */

    @GetMapping("/datos")
    public String obtenerDatos(Model model){
        nueva.getCliente();
        nueva.getCorreo();
        nueva.getAsunto();
        nueva.getDoctor();
        nueva.getHora();
        nueva.getFecha();
        nueva.getAsunto();

        model.addAttribute("add", nueva);
        return "cv";
    }
}
