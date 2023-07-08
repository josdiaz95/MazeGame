package edu.wctc.maze;
import java.util.Stack;

public  enum PrintQueue {

    INSTANCE;
    private final Stack<String> strings = new Stack<>();

    public void enqueue(String str){
        strings.push(str);
    }
    public  String flush (){
        String allStrings = String.join("\n",strings);
        strings.clear();
        return allStrings;
    }
}