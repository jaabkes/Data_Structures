package linear;
import java.util.AbstractList;
import java.util.Iterator;
/**
 * 
 * @author jacobabkes
 * This class implements a Sorted Linked List. The type of this list MUST be a
 * comparable type. 
 * @param <E>
 */
public class SortedLinkedList<E extends Comparable<E>> extends AbstractList<E> implements Iterable<E>
{
	private SLLNode<E> head;
	int size;
	
	/**
	 * 
	 * @param data
	 */
	public SortedLinkedList(E data) 
	{
		head = new SLLNode<E>(data, null);
		size++;
	}
	
	/**
	 * Returns the head node
	 * @return
	 */
	public SLLNode<E> getHead()
	{
		return head;
	}
	


	@Override
	public E get(int index)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size()
	{
		return size;
	}
	
	public void add(SLLNode<E> toAdd) 
	{
		//TODO
	}
	public Iterator<E> iterator()
	{
		return new SLLIterator();
	}
	/**
	 * 
	 * @author jacobabkes
	 *
	 * @param <E>
	 */
	private static class SLLNode<E extends Comparable<E>>
	{
		E data = null;
		SLLNode next = null;
		private SLLNode(E data, SLLNode next) 
		{
			this.next = next;
			this.data = data;
		}
		//TODO
	}
	
	/**
	 * 
	 * @author jacobabkes
	 *
	 * @param <E>
	 */
	private class SLLIterator implements Iterator<E>
	{
		public SLLIterator() {
			// TODO
		}

		@Override
		public boolean hasNext()
		{
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public E next()
		{
			// TODO Auto-generated method stub
			return null;
		}


	}
}
