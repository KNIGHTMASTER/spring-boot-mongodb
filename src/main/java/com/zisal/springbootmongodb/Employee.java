package com.zisal.springbootmongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Created on 2/15/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Document(collection = "employee")
public class Employee {

    private String id;
    private String code;
    private String name;
    private String employeeParentId;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeParentId() {
        return employeeParentId;
    }

    public void setEmployeeParentId(String employeeParentId) {
        this.employeeParentId = employeeParentId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", employeeParentId=" + employeeParentId +
                '}';
    }
}
