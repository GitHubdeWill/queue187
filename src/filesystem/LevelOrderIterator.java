package filesystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.NoSuchElementException;

import structures.Queue;


/**
 * An iterator to perform a level order traversal of part of a 
 * filesystem. A level-order traversal is equivalent to a breadth-
 * first search.
 * 
 * @author liberato
 *
 */
public class LevelOrderIterator extends FileIterator<File> {
	Queue<File> visitQueue = new Queue<File>();
	Queue<File> results = new Queue<File>();
	File[] ret;
	int index, count;
	
	/**
	 * Instantiate a new LevelOrderIterator, rooted at the rootNode.
	 * @param rootNode
	 * @throws FileNotFoundException if the rootNode does not exist
	 */
	public LevelOrderIterator(File rootNode) throws FileNotFoundException {
        	// TODO 1
		if (!rootNode.exists() || rootNode == null) 
			throw new FileNotFoundException("NotExist");
		visitQueue.enqueue(rootNode);
		while(!visitQueue.isEmpty()){
			if (visitQueue.peek().isDirectory()){
				File[] files = visitQueue.peek().listFiles();
				Arrays.sort(files);
				for (File f: files)
					visitQueue.enqueue(f);
			}
			results.enqueue(visitQueue.dequeue());
			count++;
		}
	}
	
	@Override
	public boolean hasNext() {
        	// TODO 2
		return !results.isEmpty();
	}

	@Override
	public File next() throws NoSuchElementException {
        	// TODO 3
		if (results.isEmpty()) throw new NoSuchElementException("Iteration failed");
        return results.dequeue();
	}

	@Override
	public void remove() {
		// Leave this one alone.
		throw new UnsupportedOperationException();		
	}

}
