package arrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ArrayListTests
{
  @Test
  public void should_add_an_element_to_arraylist ()
  {
    // arrange
    ArrayList<String> sut = new ArrayList<>();
    
    // act
    sut.add("My First Element");
    
    // assert
    assertThat(sut.get(0), is("My First Element"));
  }
  
  @Test
  public void should_make_arraylist_grow_when_adding_elements ()
  {
    // arrange
    ArrayList<Integer> sut = new ArrayList<>(2);
    
    // act
    sut.add(1);
    sut.add(2);
    sut.add(3);
    
    // assert
    assertThat(sut.get(2), is(3));
  }
  
  @Test
  public void should_make_arraylist_grow_multiple_times_when_adding_elements ()
  {
    // arrange
    ArrayList<Integer> sut = new ArrayList<>(1);
    
    // act
    sut.add(1);
    sut.add(2);
    sut.add(3);
    sut.add(4);
    sut.add(5);
    sut.add(6);
    sut.add(7);
    sut.add(8);
    sut.add(9);
    sut.add(10);
    
    // assert
    assertThat(sut.get(2), is(3));
    assertThat(sut.get(9), is(10));
  }
  
  @Test
  public void should_remove_first_element_from_ararylist ()
  {
    ArrayList<String> sut = new ArrayList<>(1);
    
    sut.add("First element");
    sut.add("Second element");
    sut.add("Third element");
    sut.add("Fourth element");
    
    sut.remove(0);
    
    assertThat(sut.get(0), is("Second element"));
  }
  
  @Test
  public void should_remove_middle_element_from_ararylist ()
  {
    ArrayList<String> sut = new ArrayList<>(1);
    
    sut.add("First element");
    sut.add("Second element");
    sut.add("Third element");
    sut.add("Fourth element");
    
    sut.remove(1);
    
    assertThat(sut.get(0), is("First element"));
    assertThat(sut.get(1), is("Third element"));
    assertThat(sut.get(2), is("Fourth element"));
  }
  
  @Test
  public void should_remove_last_element_from_ararylist ()
  {
    ArrayList<String> sut = new ArrayList<>(1);
    
    sut.add("First element");
    sut.add("Second element");
    sut.add("Third element");
    sut.add("Fourth element");
    
    sut.remove(3);
    
    assertThat(sut.get(0), is("First element"));
    assertThat(sut.get(1), is("Second element"));
    assertThat(sut.get(2), is("Third element"));
  }
  
  @Test
  public void should_remove_all_elements_and_readd_to_ararylist ()
  {
    ArrayList<String> sut = new ArrayList<>(1);
    
    sut.add("First element");
    sut.add("Second element");
    sut.add("Third element");
    sut.add("Fourth element");
    
    sut.remove(0);
    sut.remove(0);
    sut.remove(0);
    sut.remove(0);
    
    sut.add("First element");
    sut.add("Second element");
    sut.add("Third element");
    sut.add("Fourth element");
    
    assertThat(sut.get(0), is("First element"));
    assertThat(sut.get(1), is("Second element"));
    assertThat(sut.get(2), is("Third element"));
    assertThat(sut.get(3), is("Fourth element"));
  }
}


