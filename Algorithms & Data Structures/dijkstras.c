/* Seth Miller - 02/20/2019 (MM/DD/YYYY)
   Southwest Baptist University - Spring 2019
   CIS-3333 - Algorithms & Data Structures
   Assignment 1 - Dijkstra's Algorithm
*/

#include <stdio.h>
#define nodes 5 /* number of nodes in, width, and length of adjacency matrix */
				/* should never be greater than length of nodeNames array below */
main()
{
	int adjmatrix[ nodes ][ nodes ] = {
		{ 0, 4, 0, 11, 10 },
		{ 4, 0, 3, 0, 6 },
		{ 0, 3, 0, 2, 4 },
		{ 11, 0, 2, 0, 1 },
		{ 10, 6, 4, 1, 0 } };

	/* the adjacency matrix */
	/* values of rows are distances from one node to all other nodes */
	/* values of columns are distances to a node from all other nodes */

	int visited[ nodes ] = { 1, 0, 0, 0, 0 };
	/* for each node, 0 = unvisited, 1 = visited */
	/* first node is initially marked as visited because it is starting point */

	int cost[ nodes ] = { 0, 10000, 10000, 10000, 10000 };
	/* cost or shortest distance known from starting point to node */
	/* first node is starting point, so cost is 0 */

	int previous[ nodes ] = { -1, -1, -1, -1, -1 };
	/* index of previous node, 0=A, 1=B, etc. */

	char nodeNames[ 10 ] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };
	/* the name of nodes in order, A = starting point */

	/* Displaying adjacency matrix */
	printf( "=========================\n" );
	printf( "DIJKSTRA'S ALGORITHM\n\n" );
	printf( "Adjacency matrix:\n" );
	printf( "=========================\n" );
	int i, j;

	for ( i = 0; i < nodes; i++ )
	{
		for ( j = 0; j < nodes; j++ )
		{
			printf( "%d  ", adjmatrix[ i ][ j ] );
		}
		/* end of for ( j = 0; j < nodes; j++ ) */

		printf( "\n" );
	}
	/* end of for ( i = 0; i < nodes; i++ ) */

	printf( "=========================\n" );

	/* Calculate shortest paths */
	int nodeFrom, nodeTo, done;
	nodeFrom = 0;
	done = 0;
	/* the node we are visiting and traveling from & the node we are traveling to */
	/* done = whether the calculation is done, 0 = not done, 1 = done */

	/* while the calculation is not done */
	while ( done != 1 )
	{
		for ( nodeTo = 0; nodeTo < nodes; nodeTo++ )
		{
			int this = adjmatrix[ nodeFrom ][ nodeTo ];
			/* the distance from the node we are visiting to the node we are evaluating */

			/* test if this node has been visited */
			/* and if cost of this node is 0 */
			/* and if cost of this node plus cost of node we are going to is less than cost of node we are coming from/visiting */
			
			if ( visited[ nodeTo ] == 0 && this != 0 && this + cost[ nodeFrom ] < cost[ nodeTo ] )
			{
				cost[ nodeTo ] = this + cost[ nodeFrom ];
				previous[ nodeTo ] = nodeFrom;
			}
			/* end of if */
		}
		/* end of for ( nodeTo = 0; nodeTo < nodes; nodeTo++ ) */

		visited[ nodeFrom ] = 1;
		/* end of operations for this node, mark it visited (1) */

		/* select next node to visit, new nodeFrom */
		/* will be lowest cost unvisited node */

		int lowestCost = 1000;
		/* lowest cost from unvisited nodes */
		/* if cost from a node to any other node is higher, lowestCost will need to be updated/increased */

		int x;
		for( x = 0; x < nodes; x++ )
		{
			/* test if node is lowest cost unvisited node */
			if ( cost[ x ] < lowestCost && visited[ x ] != 1 )
			{
				nodeFrom = x;
				lowestCost = cost[ x ];
			}
			/* end of if ( cost[ x ] < lowestCost && visited[ x ] != -1 ) */
		}
		/* end of for ( x = 0; x < nodes; x++ ) */

		/* If nodeFrom has not been updated, all the nodes have been visited, so calculation is done */

		if ( visited[ nodeFrom ] == 1 )
		{
			done = 1;
		}
		/* end of if ( visited[ nodeFrom ] == 1 ) */
	}
	/* end of while ( done != 1 ) */

	/* DEBUGGING
	printf( "\nALGORITHM COMPLETE\n\n" );
	END OF DEBUGGING */

	/* Display results after algorithm is performed on adjacency matrix */

	printf( "Node\tCost\tPrevious Node\n" );
	printf( "=========================\n" );
	
	int node;
	for ( node = 0; node < nodes; node++ )
	{
		/* Display each node by name, its cost, and the previous node of the path */
		printf( "%c", nodenames[ node ] );
		printf( "\t%d", cost[ node ] );
		printf( "\t%c\n", nodeNames[ previous[ node ] ] );
	}
	/* end of for ( node = 0; node < nodes; node++ ) */
	
	printf( "=========================\n" );
}
/* end of main () */