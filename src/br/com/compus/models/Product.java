package br.com.compus.models;

public abstract class Product {
  private int id;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public abstract String getName();

  public abstract String getFormattedPrice();

  public abstract double getPrice();
}
