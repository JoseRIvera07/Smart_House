#include<gpio.h>
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

#define IN 0
#define OUT 1
#define HIGH 1
#define LOW 0

int main(int argc, char* argv[]){
	int doorState = 0;

	if ( strcmp(argv[1],"pinMode") == 0 ){
		int pin = atoi(argv[2]);
		int state = atoi(argv[3]);
		pinMode(pin, state);
		//printf("pinMode(%d,%d)\n",pin,state);
	}
	else if ( strcmp(argv[1],"digitalWrite") == 0  ){
		int pin = atoi(argv[2]);
		int state = atoi(argv[3]);
		digitalWrite(pin, state);
		//printf("digitalWrite(%d,%d)\n",pin,state);
	}
	else if ( strcmp(argv[1],"digitalRead") == 0 ){
		int pin = atoi(argv[2]);
		doorState = digitalRead(pin);
		printf("%d", doorState);
		//printf("digitalRead(%d)\n",pin);
	}
	else{
		printf("None\n");
	}
	return 0;
}
