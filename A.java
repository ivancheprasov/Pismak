class A {
  int y30;
  int y38;
  int y19;
  int y23;
  int y21;
  long y31;
  long y14;
  long y26;
  int[] y2 = {-1, 3, -2, 3};
  int[] y22 = {1, 2, -2, -3};
  int[] y29 = {-1, -1, 3, -3};
  static int y24;
  static int y40;
  static int y39;
  static int y33;
  static int y25;
  public A() {
    y30 = 1;
    y38 = 4;
    y19 = 5;
    y23 = 1;
    y21 = 4;
    y31 = 9L;
    y14 = 8L;
    y26 = 3L;
  }
  public void y7() {
    System.out.println("метод y7 в классе A");
    System.out.println(y29[1]);
  }
  public void y37() {
    System.out.println("метод y37 в классе A");
    System.out.println(y22[2] + y22[1]);
  }
  public void y11() {
    System.out.println("метод y11 в классе A");
    System.out.println(y21);
  }
  public void y4() {
    System.out.println("метод y4 в классе A");
    System.out.println(y21 << 2);
  }
  public void y34() {
    System.out.println("метод y34 в классе A");
    System.out.println(y38 - 4);
  }
  public void y13() {
    System.out.println("метод y13 в классе A");
    System.out.println(++y38);
  }
  public static void y3() {
    System.out.println("метод y3 в классе A");
    System.out.println(y33);
  }
  public static void y20() {
    System.out.println("метод y20 в классе A");
    System.out.println((y33 + 2));
  }
  public static void y35() {
    System.out.println("метод y35 в классе A");
    System.out.println(y25);
  }
  public static void y5() {
    System.out.println("метод y5 в классе A");
    System.out.println((y25 - 3));
  }
  public void y6(A r) {
    r.y7();
  }
  public void y6(E r) {
    r.y37();
  }
}
