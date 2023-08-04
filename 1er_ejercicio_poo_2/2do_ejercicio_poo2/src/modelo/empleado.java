/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author edwii
 */
public class empleado extends persona{
    private String cod;
    private String puesto;
    public empleado(){}
    public empleado(String cod, String puesto, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.cod = cod;
        this.puesto = puesto;
    }

    public String getcod() {
        return cod;
    }

    public void setcod(String cod) {
        this.cod = cod;
    }
    
    public String getpuesto() {
        return puesto;
    }

    public void setpuesto(String puesto) {
        this.puesto = puesto;
    }
    
    @Override
    public void agregar(){
    System.out.println("Codigo:  "+getcod());
    System.out.println("Puesto:  "+getpuesto());
    System.out.println("Nombres:  "+getNombres());
    System.out.println("Apellidos:  "+getApellidos());
    System.out.println("Direccion:  "+getDireccion());
    System.out.println("Telefono:  "+getTelefono());
    System.out.println("Fecha de Nacimiento:  "+getFecha_nacimiento());
    System.out.println("------------------------------------");
    
    
    
    }
    
    
}
    
    

