package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")

public class Employee {

  @Id
  @Column(name="id")
  //@GeneratedValue(strategy = GenerationType.AUTO) //hibernate에 위임 (hibernate가 DB에 맞게 id를 생성)
  @GeneratedValue(strategy = GenerationType.IDENTITY) // DBMS 에 맞는 Entity 테이블의 ID 컬럼을 이용(Auto Increment)
  private int id;
  private String name;
  private String address;

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
  }
}