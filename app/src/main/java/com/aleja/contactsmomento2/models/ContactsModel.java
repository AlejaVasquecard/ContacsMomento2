package com.aleja.contactsmomento2.models;

import java.io.Serializable;

public class ContactsModel implements Serializable {
    private int _id;
    private String nombre;
    private String apellido;
    private String celular;
    private String fijo;
    private String correo;
    private String empresa;

    public ContactsModel() {
    }

    public ContactsModel(String nombre, String apellido, String celular, String fijo, String correo, String empresa) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        setCelular(celular);
        this.setFijo(fijo);
        this.setCorreo(correo);
        this.setEmpresa(empresa);
    }

    public ContactsModel(int _id, String nombre, String apellido, String celular, String fijo, String correo, String empresa) {
        this.set_id(_id);
        this.setNombre(nombre);
        this.setApellido(apellido);
        setCelular(celular);
        this.setFijo(fijo);
        this.setCorreo(correo);
        this.setEmpresa(empresa);
    }

    @Override
    public String  toString(){
        return "ContactsModel{" +
                "_id=" + _id +
                ", nombre='" + nombre  + '\'' +
                ", apellido='" + apellido  + '\'' +
                ", celular='" + celular + '\'' +
                ", fijo='" + fijo + '\'' +
                ", correo='" + correo + '\'' +
                ", empresa='" + empresa + '\'' +
                '}';
    }


    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        celular = celular;
    }

    public String getFijo() {
        return fijo;
    }

    public void setFijo(String fijo) {
        this.fijo = fijo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
