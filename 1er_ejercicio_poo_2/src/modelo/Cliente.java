/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author edwii
 */
public class Cliente extends persona {
    private String nit;

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    @Override
    public void agregar(){
        System.out.println("NIT:  "+ getNit());
        System.out.println("NOMBRES:  "+ this.getNombres());
        System.out.println("APELLIDOS:  "+ this.getApellidos());
        System.out.println("DIRECCION:  "+ this.getDireccion());
        System.out.println("TELEFONO:  "+ this.getTelefono());
        System.out.println("FECHA DE NACIMIENTO:  "+ this.getFecha_nacimiento());
        
        
        
    
    
    }
    
}
