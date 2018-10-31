package edu.luc.cs271.arrayqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FixedArrayQueue<E> implements SimpleQueue<E> {

  private final int capacity;

  private int size;

  private int front;

  private int rear;
  
  private node head;
  
  private node tail;

  private final E[] data;

  // TODO why do we need an explicit constructor?

  @SuppressWarnings("unchecked")
  public FixedArrayQueue(final int capacity) {
    this.capacity = capacity;
    this.data = (E[]) new Object[capacity];
    this.size = 0;
    this.front = 0;
    this.rear = capacity - 1;
  }

  @Override
  public boolean offer(final E obj) {
      // TODO
      if(size < capacity)
      size ++;
      rare = (rare + 1) % capacity
      data[rear] = obj 
      return true 
  }
      return false
   

  @Override
  public E peek() //return head.data if(head != null) {
    // TODO
    if (size == 0) {
        return null
    } else {
        return data[front];
    }
  }

  @Override //removeFirst
  public E poll() {
      // TODO
     if (size ==0) {
      return null;
  }   else  {
      E result = data[front];
      front = null
      front = (front + 1) % capacity 
      size --;
      return result;
  }
  }
      

  @Override
  public boolean isEmpty() {
     
       // TODO 
       if(size == 0)
       return true;
       else 
       return false
  }

  @Override
  // TODO 
  public int size() {
    return size;
  }

  @Override
  public List<E> asList() {
    // TODO implement using an ArrayList preallocated with the right size //RETURN ARRAYLIST WITH SIZE OF
    datalist = new Arraylist<>(size);
    while(!isEmpty()) { 
        datalist.add(data[front]) //adding to the list. Data is the array and front is the index that you are keeping track of. 
        front = (front + 1) % capacity;
        size --;
        //iterate and copy the items you find between rear and front 
    }
    return datalist();
    
    
  }

