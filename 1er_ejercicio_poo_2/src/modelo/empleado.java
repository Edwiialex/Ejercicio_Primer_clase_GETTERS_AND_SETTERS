/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author edwii
 */
public class empleado extends persona {
    private String puesto,codigo;

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    @Override
    public void agregar(){
    System.out.println("codigo:  "+this.getCodigo());
    System.out.println("nombre:  "+this.getNombres());
    System.out.println("apellido:  "+this.getApellidos());
    System.out.println("direccion:  "+this.getDireccion());
    System.out.println("telefono:  "+this.getTelefono());
    System.out.println("fecha de nacimiento:  "+this.getFecha_nacimiento());
    System.out.println("puesto:  "+this.getPuesto());
    }
    
}
