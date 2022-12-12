package com.rodrigoMoguillansky.integrador.exceptions;

public class NotFoundException extends Exception {
    public NotFoundException() {
        super("No hay resultados para la busqueda");
    }
}
