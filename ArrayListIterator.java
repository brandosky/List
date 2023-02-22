package uaslp.objetos.list.arraylist;


public class ArrayListIterator {
    public int i=0;
    String []array;
    public String next(){

     String value=array[i];
     i++;

        return value;
    }

    public boolean hasNext(){
        if(array[i]==null){
            return false;
        }else {
            return true;
        }
    }
}
