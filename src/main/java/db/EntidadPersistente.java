package db;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class EntidadPersistente {
  @Id
  @GeneratedValue
  private int id;

  public void setId(int id){
    this.id = id;
  }

  public int getId() {
    return id;
  }
}

