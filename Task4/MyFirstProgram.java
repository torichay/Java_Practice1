class MyFirstClass{
  public static void main(String[] s){
    MySecondClass o = new MySecondClass();
    int i, j;
    for (i=1; i<=8; i++){
      for (j=1; j<=8; j++){
        o.setField1(i);
        o.setField2(j);
        System.out.print(o.multiplicationOfFields());
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
class MySecondClass{
  private int field1, field2;

  MySecondClass(){
    field1 = 0;
    field2 = 0;
  }
  int getField1(){
    return field1;
  }
  int getField2(){
    return field2;
  }
  void setField1(int val){
    field1 = val;
  }
  void setField2(int val){
    field2 = val;
  }

  int multiplicationOfFields(){
    return field1 * field2;
  }
}
