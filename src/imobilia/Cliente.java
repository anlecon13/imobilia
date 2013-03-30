/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imobilia;

import java.util.ArrayList;

/**
 *
 * @author aleon
 */
public class Cliente {
    	private long cedula;
	private int cCod;
	private String nombre;
        private String apellido1;
        private String apellido2;
	//Físico / Jurídico /pendiente por pensar
	private long telefono;
	private String direccion;
        private ArrayList<Factura> facturas = new ArrayList<Factura>();
	//Periodo de pago (30 días – 60 días)/pendiente
    
        //constructor sobrecargado 
    public Cliente (){}
    //constructor por verificar y modificar
    public Cliente(long cedula, int cCod, String nombre, String apellido1, String apellido2,long telefono, String direccion) {
        this.cedula = cedula;
        this.cCod = cCod;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    //getters y setters
    
    //agrega una nueva factura por pagar y retorna true
    public boolean setFactura(Factura factura)
    {
        if (factura instanceof Factura)
        {
            return this.facturas.add(factura);
        } 
        else 
        {
            return false;
        }
      
    }
    //busca las facturas que pertenecen al cliente sin pagar y retorna un array con ellas.
    public ArrayList<Factura> getFacturasPorPagar(){
        ArrayList<Factura> facturasPorPagar = new ArrayList<Factura>();
        if(facturas.size()>0)
        {
            for (Factura f: facturas)
            {
                if (!f.esPagada())
                {
                    facturasPorPagar.add(f);
                }
            }
            return facturasPorPagar;
        }
        else 
        {
            return null;
        }
        
    }
    
    public long getCedula() {
        return cedula;
    }
    public void setCedula(long cedula) {
        this.cedula = cedula;
    }
    public int getcCod() {
        return cCod;
    }
    public void setcCod(int cCod) {
        this.cCod = cCod;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido1() {
        return apellido1;
    }
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public String getApellido2() {
        return apellido2;
    }
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    public long getTelefono() {
        return telefono;
    }
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    public String getdireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
   
}
