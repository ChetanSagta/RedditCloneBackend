package app.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Person {

  private int personId;
  @Id
  @Column(length = 250)
  private String personName;
  private Date insTs;
  private Date updTs;
  @Lob
  private byte[] avatar;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
    Person person = (Person) o;
    return Objects.equals(personId, person.personId);
  }

  @Override
  public int hashCode() {
    return 0;
  }
}
