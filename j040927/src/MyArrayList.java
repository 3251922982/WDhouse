import java.util.Arrays;

public class MyArrayList implements List{
     public int[] ints;
     //有效元素个数
     public int usedSize;


    public MyArrayList() {
        this.ints = new int[10];
    }


    private void expansion(){
        ints= Arrays.copyOf(ints,ints.length*2);
    }


    public void add(int in){
        if(isFull()){
            expansion();
        }
        else{
            ints[usedSize]=in;
            usedSize++;
        }
    }



     //在 pos 位置新增元素
    public void add(int pos,int s ){
        if(pos<0||pos>(usedSize-1)){
            throw new PasOutOfException("下标不合法");
        }
        if(isFull()){
            expansion();
        }
        else{
            for(int i=usedSize-1;i>=pos;i--){
                ints[i+1]=ints[i];
            }
            ints[pos]=s;
            usedSize++;
        }
    }
//
//    // 判定是否包含某个元素
    public boolean contains(int in ){
        boolean det=false;
        for(int i=0;i<usedSize-1;i++){
         if(ints[i]==in){
                det=true;
            }

        }
        return det;
    }


    // 查找某个元素对应的位置
    public int indexOf(int toFind){
        if(isEmpty()){
            throw  new EmptyArrayException("空数组");
        }
        for(int i=0;i<usedSize-1;i++){
            if(ints[i]==toFind){
                return  i;
            }
        }
        return  -1;
    }


    // 获取 pos 位置的元素
    public int get(int pos){
        if(pos<0||pos>(usedSize-1)){
            throw new PasOutOfException("下标不合法");
        }
        if(isEmpty()){
            throw  new EmptyArrayException("空数组");
        }
        return  ints[pos];
    }


    // 给 pos 位置的元素设为 value
    public void set(int pos,int value){
        if(pos<0||pos>(usedSize-1)){
            throw new PasOutOfException("下标不合法");
        }
        if(isEmpty()){
            throw  new EmptyArrayException("空数组");
        }
        else{
            ints[pos]=value;
        }
    }


    //删除第一次出现的关键字key
    public void remove(int key){
        int position=indexOf(key);
        if(position!=-1){
            for(int i=position;i<=usedSize-2;i++){
                ints[i]=ints[i+1];
            }
            ints[usedSize-1]=0;
            usedSize--;
        }

    }




    // 获取顺序表长度
    public int size(){
        return usedSize;
    }

    // 清空顺序表
    public void clear(){
        for(int i=0;i<usedSize;i++){
            ints[i]=0;
        }
        usedSize=0;
    }





    public boolean isFull(){
        return usedSize==ints.length;
    }//判满

    public boolean isEmpty(){
        return  usedSize==0;
    }//判空

    @Override
    public String toString() {
        return "MyArrayList{" +
                "ints=" + Arrays.toString(ints) +
                '}';
    }
}
