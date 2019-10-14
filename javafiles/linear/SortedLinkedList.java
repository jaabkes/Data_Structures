package linear;

import java.util.AbstractList;
import java.util.Iterator;

/**
 * 
 * @author jacobabkes This class implements a Sorted Linked List. The type of
 *         this list MUST be a comparable type.
 * @param <E>
 */
public class SortedLinkedList<E extends Comparable<E>> extends AbstractList<E> implements Iterable<E> {
	private SLLNode<E> head;
	private int size;

	/**
	 * 
	 * @param data
	 */
	public SortedLinkedList(E data) {
		head = new SLLNode<E>(data, null);
		size++;
	}

	@Override
	public E get(int index) {
		if (index < 0 || index > size - 1) {
			throw new IllegalArgumentException("Index is < 0 or > size-1");
		}
		SLLNode<E> looking = head;
		int counter = 0;
		while (looking != null) {
			if (counter == index)
				return looking.data;
			counter++;
			looking = looking.next;
		}
		return null;
	}

	@Override
	public int size() {
		return size;
	}

	/**
	 * This method will perform an insertion add in order to maintain a sorted list
	 * 
	 * @param toAdd
	 * @return
	 */
	@Override
	public boolean add(E data) {
		if (data == null)
			return false;
		SLLNode<E> added = new SLLNode<E>(data, null);
		SLLNode<E> looking = head;
		if (added.data.compareTo(looking.data) < 0) // if it is the first item
		{
			added.next = head;
			head = added; // update the head reference
			size++;
			return true;
		}
		while (looking.next != null && added.data.compareTo(looking.next.data) > 0) {
			looking = looking.next;
		}
		added.next = looking.next;
		looking.next = added;
		size++;
		return true;
	}

	/**
	 * Returns true if the given data entry was removed
	 * 
	 * @param data
	 * @return
	 */
	public boolean remove(E data) {
		if (data == null) // null data does not exist because it can't be sorted
			return false;
		if (head.data.compareTo(data) == 0) // if its the head node
		{
			head = head.next; // removes it from the chain
			size--;
			return true;
		}
		SLLNode<E> looking = head;
		while (looking.next != null) {
			if (looking.next.data.compareTo(data) == 0) {
				looking.next = looking.next.next; // remove it from the chain
				size--;
				return true;
			}
		}
		return false;
	}

	/**
	 * Removes the item at the given index and returns it
	 * returns null if the index doesn't exist
	 * 
	 * @return
	 */
	public E remove(int index) 
	{
		if(index > size-1 || index < 0)
			return null;
		//TODO
		return null;

	}

	public Iterator<E> iterator() {
		return new SLLIterator();
	}

	/**
	 * 
	 * @author jacobabkes
	 *
	 * @param <E>
	 */
	private static class SLLNode<E extends Comparable<E>> {

		E data = null;
		SLLNode<E> next = null;

		/**
		 * Throws an illegal argument exception if you attempt to insert null data
		 * 
		 * @param data
		 * @param next
		 */
		private SLLNode(E data, SLLNode<E> next) {
			if (data == null)
				throw new IllegalArgumentException();
			this.next = next;
			this.data = data;
		}

	}// SLLNode End

	/**
	 * 
	 * @author jacobabkes
	 *
	 * @param <E>
	 */
	private class SLLIterator implements Iterator<E> {
		public SLLIterator() {
			// TODO
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public E next() {
			// TODO Auto-generated method stub
			return null;
		}

	} // end of SLLIterator

	
	
	/**
	 * This method is will only work if type E has it's own toString method
	 */
	public String toString() {
		SLLNode<E> looking = head;
		String returned = "";
		while (looking != null) {
			returned = returned + "(" + looking.data + ")--> ";
			looking = looking.next;
		}
		return returned;
	}

} // End of SLL
