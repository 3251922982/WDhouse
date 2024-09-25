 public  class MyArray<T extends Number>{
    public Object[] MyArray=new MyArray[3];
    public void setMyArray(int a,T b){
        MyArray[a]=b;
    }

    public Object getMyArray(int a) {
        return MyArray[a];
    }
}