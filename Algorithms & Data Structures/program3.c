/* Seth Miller - 02/23/2019 - 03/08/2019 (MM/DD/YYYY)
   Southwest Baptist University - Spring 2019
   CIS-3333 - Algorithms & Data Structures
   Program 3 - Dynamic Memory Management
*/

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define STRING_LENGTH 1000000
/* the length of the character array/word in each node in our linked list */
/* test with small length, and finish code by setting it to 1,000,000 */

/* A node in our linked list */
struct node
{
	char * word; /* the character array connected to the node */
	struct node * next; /* the next node in the linked list */

}; /* end of struct node */

/* Declaring the enqeueue and dequeue functions */
/* int enqueue( char * string, struct node ** front, struct node ** tail ); */
/* char * dequeue( struct node ** front, struct node ** tail ); */

/* the method to enqueue a node to the tail of the linked list */

int enqueue ( char * string, struct node ** front, struct node ** tail )
{
	struct node * temp = ( struct node * ) malloc ( sizeof( struct node ) );
	if ( temp == NULL )
	{
		return 0;

	} /* end of if */

	else
	{
		( * temp ).word = string; /* can add a print after this to test */
		temp -> next = NULL; /* same as ( * temp ). */

		if ( ( * front ) == NULL )
		{
			*front = temp;

		} /* end of if ( ( * front ) == NULL ) */

		else
		{
			( * tail ) -> next = temp;

		} /* end of else */

		* tail = temp;
		return 1;

	} /* end of else */

} /* end of enqueue */

/* dequeue a node from the head/front of the linked list */

char * dequeue ( struct node ** front, struct node ** tail )
{
	struct node * temp;
	char * string = NULL;

	if ( ( * front ) != NULL ) /* means there is something in there */
	{
		temp = * front; /* so you remember where the node is */
		string = ( * front ) -> word; /* so you remember where its data is */

		if ( ( * front ) -> next == NULL )
		{
			* tail = NULL;

		} /* end of if ( ( *front -> next == NULL ) */

		( * front ) = ( temp ) -> next;

		free( ( * temp ).word ); /* deallocate the character array/word attached to the node */
		free( temp ); /* deallocate the node no matter what */

	} /* end of if ( ( * front ) != NULL ) */

	return string;

} /* end of dequeue */

main()
{
	struct node ** front = ( struct node ** ) malloc ( sizeof( struct node * ));
	struct node ** tail = ( struct node ** ) malloc ( sizeof( struct node * ));

	int nodesDequeued = 0;
	/* the number of nodes that we dequeue before running out of memory */
	/* will be printed at the end of the main program */

	* front = NULL;
	* tail = NULL;

	/* enqueue 10 nodes to fill up the linked list initially */
	int i, j;
	srand( time( NULL ) );

	for ( i = 0; i < 10; i++ )
	{
		char * word = ( char * ) malloc ( STRING_LENGTH * sizeof( int ) );

		/* fill char array with random characters */
		for ( j = 0; j < STRING_LENGTH; j++ )
		{
			word[ j ] = rand() % 26 + 65;

		} /* end of for ( j = 0; j < STRING_LENGTH; j++ ) */

		enqueue( word, front, tail );

	} /* end of for ( i = 0; i < 10; i++ ) */

	/* enqueue and then dequeue 100,000 nodes */
	/* DON'T FORGET TO SET i < # TO i < 100,000 */
	for ( i = 0; i < 100000; i++ )
	{
		char * word = ( char * ) malloc ( STRING_LENGTH * sizeof( int ) );

		/* fill char array with random characters */
		for ( j = 0; j < STRING_LENGTH; j++ )
		{
			word[ j ] = rand() % 26 + 65;

		} /* end of for ( j = 0; j < STRING_LENGTH; j++ ) */

		enqueue( word, front, tail );
		dequeue( front, tail );
		nodesDequeued++;

	} /* end of for ( i = 0; i < 100000; i++ ) */

	/* dequeue 12 nodes */
	/* empties the list and checks twice to see if dequeue method crashes when linked list is empty */
	for ( i = 0; i < 12; i++ )
	{
		dequeue( front, tail );
		nodesDequeued++;

	} /* end of for ( i = 0; i < 12; i++ ) */

	printf( "NODES DEQUEUED: %d", nodesDequeued );

} /* end of main */