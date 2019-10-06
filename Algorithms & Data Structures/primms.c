/* Seth Miller - 02/20/2019 (MM/DD/YYYY)
   Southwest Baptist University - Spring 2019
   CIS-3333 - Algorithms & Data Structures
   Assignment 2 - Primm's Algorithm
*/

#include <stdio.h>
#define nodes 4 /* number of nodes in, height, and width of the adjacency matrix */
                /* should never be greater than the length of nodeNames array below */
main()
{
	int adjmatrix[ nodes ][ nodes ] = {
		{ 0, 8, 1, 0 },
		{ 8, 0, 6, 3 },
		{ 1, 6, 0, 2 },
		{ 0, 3, 2, 0 }
	};
	/* the adjacency matrix */
	/* values of rows are distances from one node to all other nodes */
	/* values of columns are distances to a node from all other nodes */

	int visited[ nodes ] = { 1, 0, 0, 0 };
	/* for each node, 0 = unvisited, 1 = visited */
	/* first node is initially marked as visited because it is starting point */

	int cost[ nodes ] = { 0, 10000, 10000, 10000 };
	/* cost or shortest distance to node */
	/* first node is starting point, so cost is 0 */

	int previous[ nodes ] = { -1, -1, -1, -1 };
	/* index of previous node, 0=A, 1=B, etc. */
	/* -1 = no previous node, so node is starting point */

	char nodeNames[ 10 ] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };
	/* the name of nodes in order, A = starting point */

	/* Displaying adjacency matrix */
	printf( "=========================\n" );
	printf( "PRIMM'S ALGORITHM\n\n" );
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

	/* Perform algorithm and calculate shortest paths */

	int nodeFrom, nodeTo, done;
	nodeFrom = 0;
	done = 0;
	/* the node we are traveling from and the node we are traveling to */
	/* done = whether the calculation is done, 0 = not done, 1 = done */
	
	/* while the calculation is not done */
	while( done != 1 )
	{
		for ( nodeTo = 0; nodeTo < nodes; nodeTo++ )
		{
			int this = adjmatrix[ nodeFrom ][ nodeTo ];
			/* the distance from the node we are visiting to the node we are evaluating */

			if ( visited[ nodeTo ] == 0 && this != 0 && this < cost[ nodeTo ] )
			{
				cost[ nodeTo ] = this;
				previous[ nodeTo ] = nodeFrom;
			}
			/* end of if */
		}
		/* end of for( nodeTo = 0; nodeTo < nodes; nodeTo++ ) */

		visited[ nodeFrom ] = 1;
		/* end of operations for this node, mark it visited (1) */

		/* select next node to visit, new nodeFrom */
		/* will be lowest cost unvisited node */
				
		int lowestCost = 10000;
		/* lowest cost of unvisited nodes */
		/* if cost from a node to any other node is higher, lowestCost will need to be updated/increased */
		
		int x;
		for ( x = 0; x < nodes; x++ )
		{
			/* test if node is lowest cost unvisited node */
			if ( cost[ x ] < lowestCost && visited[ x ] != 1 )
			{
				nodeFrom = x;
				lowestCost = cost[ x ];
			}
			/* end of if ( cost[ x ] < lowestCost && visited[ x ] != 1 ) */
		}
		/* end of for ( x = 0; x < nodes; x++ ) */

		/* if nodeFrom has not been updated, all the nodes have been visited, so calculation is done */

		if ( visited[ nodeFrom ] == 1 )
		{
			done = 1;
		}
		/* end of if ( visited[ nodeFrom ]  == 1 ) */
	}
	/* end of while ( done != 1 ) */

	/* DEBUGGING
	printf( "\nALGORITHM COMPLETE\n\n" );
	END OF DEBUGGING */

	/* Display results after primm's algorithm is performed on adjacency matrix */

	printf( "Node\tCost\tPrevious\n" );
	printf( "=========================\n" );
	
	int node;
	for ( node = 0; node < nodes; node++ )
	{
		/* Display each node by name, its cost, and the previous node of the path */
		printf( "%c", nodeNames[ node ] );
		printf( "\t%d", cost[ node ] );
		printf( "\t%c\n", nodeNames[ previous[ node ] ] );
	}
	/* end of for ( node = 0; node < nodes; node++ ) */
	
	printf( "=========================\n" );
}
/* end of main() */