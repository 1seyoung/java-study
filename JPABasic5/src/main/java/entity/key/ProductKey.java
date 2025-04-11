package entity.key;

import java.util.Objects;

/**
 *
 * The composite primary key class must be public.
 * It must have a no-args constructor.
 * It must define the equals() and hashCode() methods.
 * It must be Serializable.
 */
public class ProductKey {
  private static final long serialVersionUID = 1L;

  private String code;
  private int number;

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

  // 생성자 생략  기본 생성자


  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductKey that = (ProductKey) o;
    return number == that.number && Objects.equals(code, that.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, number);
  }
}
