package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Propietario;
import com.example.demo.service.IPropietarioService;

@Controller
@RequestMapping("/propietarios")
public class PropietarioController {
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	
	//http://localhost:8080/concesionario/propietarios/reporte
	@GetMapping("/reporte")
	public String buscarTodos(Model model){
		List<Propietario> lista= this.iPropietarioService.reporte();
		model.addAttribute("propietarios",lista);
		return "vistaReporte";
	}
	

}
