/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_3_extends;

/**
 *
 * @author eduar
 */
public class EVA2_3_EXTENDS {

    public static void main(String[] args) {
        Estudiante estu = new Estudiante();
        estu.setNombre("Eduardo");
        estu.setApellido("Muñoz");
        estu.setEdad(18);
        estu.setNoControl("22550341");
        System.out.println("IMPRIMIR DATOS");
        System.out.println("NOMBRE: "+estu.getNombre());
        System.out.println("APELLIDO: "+estu.getApellido());
        System.out.println("EDAD: "+estu.getEdad());
        System.out.println("NO. CONTROL:"+estu.getNoControl());
        
        Proveedores prov1 = new Proveedores();
        prov1.setNombre("Eduardo");
        prov1.setApellido("Nieto");
        prov1.setEdad(25);
        prov1.setRfc("MUNR103");
        System.out.println("IMPRIMIR DATOS");
        System.out.println("NOMBRE "+prov1.getNombre());
        System.out.println("APELLIDO: "+prov1.getApellido());
        System.out.println("EDAD: "+prov1.getEdad());
        System.out.println("RFC:"+prov1.getRfc());
    }
}
