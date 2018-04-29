class A {
  private int A1;
  private float A2;
  private String A3;
  private String A4;

  public int getA1() {
    return A1;
  }
   
  public void setA1(int A1) {
    this.A1 = A1;
  }
   
  public double getA2() {
    return A2;
  }
   
  public void setA2(float A2) {
        this.A2 = A2;
  }

  public String getA3(){
    return A3;
  }
  
  public void setA3(String A3){
    this.A3 = A3;
  }

  public float soma(){
    return this.A1 + this.A2;
  }

  public String getA4(){
    return A4;
  }
  
  public void setA4(String A3){
    this.A4 = A4;
  }
  
}