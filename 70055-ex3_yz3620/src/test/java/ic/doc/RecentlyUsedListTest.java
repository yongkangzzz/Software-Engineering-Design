package ic.doc;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RecentlyUsedListTest {
  RecentlyUsedList newList = new RecentlyUsedList();

  @Test
  @SuppressWarnings("unchecked")
  //Check the initialization method
  public void testInitialization() {
    assertThat(newList.isEmpty(), is(true));
    newList.addElement(1);
    assertThat(newList.getListSize(), is(1));
    newList.initialize();
    assertThat(newList.isEmpty(), is(true));
  }

  @Test
  @SuppressWarnings("unchecked")
  //Check the addElement method
  public void testAddElement() {
    newList.addElement(1);
    assertThat(newList.getElement(0), is(1));
    newList.addElement("item");
    assertThat(newList.getElement(0), is("item"));
    newList.addElement(true);
    newList.addElement(true); //Check duplication
    assertThat(newList.getElement(0), is(true));
    assertThat(newList.getListSize(), is(3));
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testRetrieveElement() {
    //Check retrieveElement method
    newList.addElement(1);
    newList.addElement(true);
    newList.addElement("Something");
    assertThat(newList.getListSize(), is(3));
    assertThat(newList.retrieveElement(2), is(1));
    //Check whether the retrieved one is the most recent one
    assertThat(newList.getElement(0), is(1));
  }
}
