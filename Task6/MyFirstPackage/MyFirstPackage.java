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