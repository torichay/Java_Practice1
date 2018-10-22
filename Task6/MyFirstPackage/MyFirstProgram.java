import MyFirstPackage.*;
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