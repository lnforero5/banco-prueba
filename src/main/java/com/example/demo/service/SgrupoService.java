package com.example.demo.service;

import java.util.ArrayList;



import org.springframework.stereotype.Service;





@Service
public class SgrupoService{
	
	public ArrayList<Integer> grupo(ArrayList<Integer> capacidad_grupo) {
		
		ArrayList<Integer> grupo_n = capacidad_grupo;
		ArrayList<Integer> tam_f = new ArrayList<Integer>();
		int suma_total = 0;
		
		for(int i: grupo_n) suma_total += i;

		
		for (int j = 1; j  <= suma_total; j++) {
	            if (suma_total % j == 0) {
	                if (validar_n(capacidad_grupo, j)) {
	                	tam_f.add(j);
	                }
	            }	           
	    }
		
		
		return tam_f;
	}
	
    static boolean validar_n(ArrayList<Integer> grupo_n, int tam) {
        int x = tam;
        for (int n_capacidad : grupo_n) {           
            if (x == n_capacidad) {
                x = tam;
            } else if (x < n_capacidad) {             
                return false;
            } else {
                x = x - n_capacidad;
            }
        } 
        return x == tam;
    }

}
