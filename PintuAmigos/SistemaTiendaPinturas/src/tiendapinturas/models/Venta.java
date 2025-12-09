/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendapinturas.models;

import java.util.Date;

public class Venta {
    private int id;
    private String numeroTicket;
    private Date fecha;
    private double total;
    
    public Venta(int id, String numeroTicket, Date fecha, double total) {
        this.id = id;
        this.numeroTicket = numeroTicket;
        this.fecha = fecha;
        this.total = total;
    }
    
    // Getters
    public int getId() { return id; }
    public String getNumeroTicket() { return numeroTicket; }
    public Date getFecha() { return fecha; }
    public double getTotal() { return total; }
}