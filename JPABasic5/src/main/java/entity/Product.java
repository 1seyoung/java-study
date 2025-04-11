package entity;

import entity.key.ProductKey;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity
@IdClass(ProductKey.class) // ProductKey 클래스가 Product의 복합키를 정의하는 클래스
public class Product {

  @Id
  private String code;

  @Id
  private int number;

  private String color;

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


}
