package com.nttdata.pt1.util;

import lombok.Data;
import lombok.Getter;

/**
 * Clase utilitaria para manejo de cadenas.
 *
 * @author EAFB
 * @date 02 May 2018
 */

@Data
public class ExpertString {

    private static final String CEDULA = "C";
    private static final String PASAPORTE = "P";

    /**
     * valida la cadena que llega como parémetro si es vacía o nula.
     *
     * @param cadena Cadena a validar.
     * @return boolean
     */
    public static boolean isEmptyOrNull(String cadena){
        if(cadena!=null){
            return cadena.isEmpty();
        }
        return true;
    }

    public static boolean valIdType(String cadena){
        if(cadena!=null){
            if(CEDULA.equals(cadena) || PASAPORTE.equals(cadena)){
                return false;
            }
        }
        return true;
    }

}
