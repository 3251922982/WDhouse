 public  class MyArray<T extends Number>{
    public Object[] MyArray1;

     public MyArray(Object[] myArray1) {
         MyArray1 = myArray1;
     }

     public void setMyArray(int a, T b){
        MyArray1[a]=b;
    }

    public Object getMyArray(int a) {
        return MyArray1[a];
    }
}