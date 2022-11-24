/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

import java.util.ArrayList;

/**
 *
 * @author nerea
 */
public class Reserva {
    private float precio_adulto;
    private float precio_nino;
    private float precio_grupo;
    private float total;
    private int numero_entradas_adulto;
    private int numero_entradas_nino;
    private String destino;
    private String fecha;
    private String lugar_salida;
    private String embarcadero;
    private String hora_salida;
    private String hora_llegada;
    private ArrayList<String>  posibles_fechas;

    public Reserva(float precio_adulto, float precio_nino, float precio_grupo, float total, int numero_entradas_adulto,
            int numero_entradas_nino, String destino, String fecha, String lugar_salida, String embarcadero, String hora_salida, String hora_llegada) {
        this.precio_adulto = precio_adulto;
        this.precio_nino = precio_nino;
        this.precio_grupo = precio_grupo;
        this.total = total;
        this.numero_entradas_adulto = numero_entradas_adulto;
        this.numero_entradas_nino = numero_entradas_nino;
        this.destino = destino;
        this.fecha = fecha;
        this.lugar_salida = lugar_salida;
        this.embarcadero = embarcadero;
        this.hora_salida = hora_salida;
        this.hora_llegada = hora_llegada;
    }

    public ArrayList<String> getPosibles_fechas() {
        return posibles_fechas;
    }

    public void setPosibles_fechas(ArrayList<String>  posibles_fechas) {
        this.posibles_fechas = posibles_fechas;
    }
    

    @Override
    public String toString() {
        return "Reserva{" + "precio_adulto=" + precio_adulto + ", precio_nino=" + precio_nino + ", precio_grupo=" + precio_grupo + ", total=" + total + ", numero_entradas_adulto=" + numero_entradas_adulto + ", numero_entradas_nino=" + numero_entradas_nino + ", destino=" + destino + ", fecha=" + fecha + ", lugar_salida=" + lugar_salida + ", embarcadero=" + embarcadero + ", hora_salida=" + hora_salida + ", hora_llegada=" + hora_llegada + '}';
    }
    

    public float getPrecio_adulto() {
        return precio_adulto;
    }

    public void setPrecio_adulto(float precio_adulto) {
        this.precio_adulto = precio_adulto;
    }

    public float getPrecio_nino() {
        return precio_nino;
    }

    public void setPrecio_nino(float precio_nino) {
        this.precio_nino = precio_nino;
    }

    public float getPrecio_grupo() {
        return precio_grupo;
    }

    public void setPrecio_grupo(float precio_grupo) {
        this.precio_grupo = precio_grupo;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getNumero_entradas_adulto() {
        return numero_entradas_adulto;
    }

    public void setNumero_entradas_adulto(int numero_entradas_adulto) {
        this.numero_entradas_adulto = numero_entradas_adulto;
    }

    public int getNumero_entradas_nino() {
        return numero_entradas_nino;
    }

    public void setNumero_entradas_nino(int numero_entradas_nino) {
        this.numero_entradas_nino = numero_entradas_nino;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar_salida() {
        return lugar_salida;
    }

    public void setLugar_salida(String lugar_salida) {
        this.lugar_salida = lugar_salida;
    }

    public String getEmbarcadero() {
        return embarcadero;
    }

    public void setEmbarcadero(String embarcadero) {
        this.embarcadero = embarcadero;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public String getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(String hora_llegada) {
        this.hora_llegada = hora_llegada;
    }
    
    
    
}

