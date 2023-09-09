package med.voll.api.medico;

import med.voll.api.direccion.DatosDireccion;


//DTO: DATE TRANSFER OBJECT
public record DatosRegistroMedico(String nombre, String email, String documento, Especialidad especialidad, DatosDireccion direccion) {
}
