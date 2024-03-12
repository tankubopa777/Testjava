package SF211FinalPractice.src.Q4;
/* Auto class */

import java.text.DecimalFormat;

public class Auto {
  // instance variables
  private String model; // model of auto
  private int milesDriven; // number of miles driven
  private double gallonsOfGas; // number of gallons of gas

  private static int countAutos = 0; // static class variable

  public Auto() {
    model = "unknown";
    countAutos++; // increment static count of Auto objects
  }

  public Auto(String startModel, int startMilesDriven, double startGallonsOfGas) {
    model = startModel;
    setMilesDriven(startMilesDriven);
    setGallonsOfGas(startGallonsOfGas);
    countAutos++; // increment static count of Auto objects
  }

  public String getModel() {
    return model;
  }

  public int getMilesDriven() {
    return milesDriven;
  }

  public double getGallonsOfGas() {
    return gallonsOfGas;
  }

  public static int getCountAutos() {
    return countAutos;
  }

  public Auto setModel(String model) {
    this.model = model;
    return this;
  }

  public Auto setMilesDriven(int milesDriven) {
    if (milesDriven >= 0)
      this.milesDriven = milesDriven;
    return this;
  }

  public Auto setGallonsOfGas(double gallonsOfGas) {
    if (gallonsOfGas >= 0.0)
      this.gallonsOfGas = gallonsOfGas;

    return this;
  }

  public double milesPerGallon() {
    if (gallonsOfGas != 0.0)
      return milesDriven / gallonsOfGas;
    else
      return 0.0;
  }

  public String toString() {
    DecimalFormat gallonsFormat = new DecimalFormat("#0.0");
    return "Model: " + model + "\n miles driven: " + milesDriven + "\n gallons of gas: "
        + gallonsFormat.format(gallonsOfGas);
  }

  public boolean equals(Object o) {
    if (!(o instanceof Auto))
      return false;
    else {
      Auto autoA = (Auto) o;
      if (model.equals(autoA.model) && milesDriven == autoA.milesDriven
          && Math.abs(gallonsOfGas - autoA.gallonsOfGas) < 0.0001)
        return true;
      else
        return false;
    }
  }
}
