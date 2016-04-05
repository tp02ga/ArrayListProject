package arrayList;

import java.util.Arrays;

public class ArrayList <T>
{
  private final int DEFAULT_SIZE = 10;
  private int currentSize = 0;
  
  Object[] elements;
  
  public ArrayList () 
  {
    elements = new Object[DEFAULT_SIZE];
  }
  
  public ArrayList (int initialCapacity)
  {
    elements = new Object[initialCapacity];
  }
  
  public void add(T element)
  {
    if (getMaxSize() == currentSize)
    {
      growArray();
    }
    
    elements[currentSize] = element;
    currentSize++;
    System.out.println(Arrays.toString(elements));
  }

  private void growArray()
  {
    // arrays in ArrayLists should typically grow by 50%
    
    // 1. create new array of size 50% larger than original array
    // 2. copy original array into new array
    System.out.println("Array is growing. Old size is: " + getMaxSize());
    
    Object[] newArray = Arrays.copyOf(elements, Math.round((float)getMaxSize()*1.5f));
    
    elements = newArray;
    System.out.println("New size is: " + getMaxSize());
  }

  protected int getMaxSize ()
  {
    return this.elements.length;
  }

  @SuppressWarnings("unchecked")
  public T get(int i)
  {
    return (T) elements[i];
  }

  @SuppressWarnings("unchecked")
  public T remove(int removalIndex)
  {
    T element = (T) elements[removalIndex];
    
    for (int i = removalIndex; i<getMaxSize()-1; i++)
    {
      elements[i] = elements[i+1];
    }
    
    currentSize--;
    
    return element;
  }
}
