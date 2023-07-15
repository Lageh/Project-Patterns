package com.gui.creation.prototype.products;

import com.gui.creation.prototype.interfaces.Prototype;

import java.lang.reflect.Field;

public class Client implements Prototype{

    private String name;
    private String phone;
    private String address;
    private int age;

    public Client(String name, String phone, String address, int age) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Client clone() throws CloneNotSupportedException {
        Client clone = new Client(this.name, this.phone, this.address, this.age);
        System.out.println("cloning....");
        return clone;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        String newLine = System.getProperty("line.separator");
        String[] className = this.getClass().getName().split("\\.");
        result.append(className[className.length - 1]);
        result.append( " Object {" );
        result.append(newLine);

        //determine fields declared in this class only (no fields of superclass)
        Field[] fields = this.getClass().getDeclaredFields();

        //print field names paired with their values
        for ( Field field : fields  ) {
            result.append("  ");
            try {
                result.append( field.getName() );
                result.append(": ");
                //requires access to private field:
                result.append( field.get(this) );
            } catch ( IllegalAccessException ex ) {
                System.out.println(ex);
            }
            result.append(newLine);
        }
        result.append("}");

        return result.toString();
    }
}
