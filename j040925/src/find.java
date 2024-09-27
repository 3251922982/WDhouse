class find{
    public static <T extends Comparable<T>> T  findMin(T[] ClassS){
        T min=ClassS[0];
        for(int i=0;i< ClassS.length;i++){
            if(min.compareTo(ClassS[i])>0){
                min=ClassS[i];
            }
        }
        return  min;
    }

}
