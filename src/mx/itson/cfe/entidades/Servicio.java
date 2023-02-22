/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.cfe.entidades;

import java.util.Date;

/**
 *
 * @author Alexis Bejarano
 */
public class Servicio {
    private Date fechaInicioServicio;
    private Date fechaFinServicio;
    private Date fechaLimitePago;
    private Date fechaCorte;
    private Double subTotal;
    private Double iva;
    private Double costoPorKwh;
    private Double lectura;

    /**
     * @return the fechaInicioServicio
     */
    public Date getFechaInicioServicio() {
        return fechaInicioServicio;
    }

    /**
     * @param fechaInicioServicio the fechaInicioServicio to set
     */
    public void setFechaInicioServicio(Date fechaInicioServicio) {
        this.fechaInicioServicio = fechaInicioServicio;
    }

    /**
     * @return the fechaFinServicio
     */
    public Date getFechaFinServicio() {
        return fechaFinServicio;
    }

    /**
     * @param fechaFinServicio the fechaFinServicio to set
     */
    public void setFechaFinServicio(Date fechaFinServicio) {
        this.fechaFinServicio = fechaFinServicio;
    }

    /**
     * @return the fechaLimitePago
     */
    public Date getFechaLimitePago() {
        return fechaLimitePago;
    }

    /**
     * @param fechaLimitePago the fechaLimitePago to set
     */
    public void setFechaLimitePago(Date fechaLimitePago) {
        this.fechaLimitePago = fechaLimitePago;
    }

    /**
     * @return the fechaCorte
     */
    public Date getFechaCorte() {
        return fechaCorte;
    }

    /**
     * @param fechaCorte the fechaCorte to set
     */
    public void setFechaCorte(Date fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    /**
     * @return the subTotal
     */
    public Double getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * @return the iva
     */
    public Double getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(Double iva) {
        this.iva = iva;
    }

    /**
     * @return the costoPorKwh
     */
    public Double getCostoPorKwh() {
        return costoPorKwh;
    }

    /**
     * @param costoPorKwh the costoPorKwh to set
     */
    public void setCostoPorKwh(Double costoPorKwh) {
        this.costoPorKwh = costoPorKwh;
    }

    /**
     * @return the lectura
     */
    public Double getLectura() {
        return lectura;
    }

    /**
     * @param lectura the lectura to set
     */
    public void setLectura(Double lectura) {
        this.lectura = lectura;
    }
    
    
    
}
