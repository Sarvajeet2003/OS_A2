// C program to show thread functions

#include <pthread.h>
#include <stdio.h>
#include <stdlib.h>

void* func(void* arg)
{
	// detach the current thread
	// from the calling thread
	pthread_detach(pthread_self());

	printf("Inside the thread\n");

	// exit the current thread
	pthread_exit(NULL);
}

void fun()
{
	pthread_t ptid;

	// Creating a new thread
	pthread_create(&ptid, NULL, &func, NULL);

	if(pthread_equal(ptid, pthread_self()))
		printf("Threads are equal\n");
	else
		printf("Threads are not equal\n");

	pthread_join(ptid, NULL);

	pthread_exit(NULL);
}

// Driver code
int main()
{
	fun();
	return 0;
}