package entity.key;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;
@Embeddable
public class StudentKey  implements Serializable {

  public String code;
  public int number;
  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentKey that = (StudentKey) o;
    return number == that.number && Objects.equals(code, that.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, number);
  }
}
