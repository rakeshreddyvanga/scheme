/**
 * 
 */
package graphProject;

/**
 * @author rvanga
 *
 */
public interface IGraphLibrary {
	
	public boolean createGraph(String graphName, int costInterval); 
	public boolean addEdge(String graphName, String from, String to, int cost);
	public String addGraph(String fromGraph, String toGraph);
	public String computePath(String graph, String from, String to);
}
