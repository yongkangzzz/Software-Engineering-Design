package ic.doc;

import java.util.ArrayList;
import java.util.List;

public class RecentlyUsedList<E> {
  //Recently  used list
  private List<E> usedList;

  //Initialize a list
  public void initialize() {
    usedList = new ArrayList<E>();
  }

  //Constructor function
  public RecentlyUsedList() {
    initialize();
  }

  //Return the size of the list
  public int getListSize() {
    return usedList.size();
  }

  //Return true if the list is empty(0 item in the list)
  public boolean isEmpty() {
    return (getListSize() == 0);
  }

  //Add an item into the list and if duplication, delete the existing one
  public void addElement(E newItem) {
    usedList.remove(newItem);
    usedList.add(0, newItem); //Most recent one
  }

  //Used to get the item in the index position in the list
  public E getElement(int index) {
    E targetObject = null;
    try {
      targetObject = usedList.get(index);

    } catch (IllegalArgumentException e) {
      System.out.println("Please provide a legal index");
    }
    return targetObject;
  }

  //Retrieve the item in the index position in the list
  //The difference from method getElement is that this method will
  //set the retrieved item to be the most recent one
  public E retrieveElement(int index) {
    E targetObject = null;
    try {
      targetObject = usedList.get(index);
      if (index > 0) {
        usedList.remove(index);
        usedList.add(0, targetObject); //Set to be the most recent
      }
    } catch (IllegalArgumentException e) {
      System.out.println("Please provide a legal index");
    }
    return targetObject;
  }
}
