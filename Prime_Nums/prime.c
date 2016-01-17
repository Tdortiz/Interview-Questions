#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>

int* calculatePrime(int max, int* count){
    
    int* primes = malloc(sizeof(int) * (max) );
    primes[*count] = 2;
    (*count)++; 
    
    // Calculates all prime numbers between 1 and a max value
    for(int i = 1; i <= max; i+= 2){
        if( i == 1) // skips 1
            continue;
        
        double sq = sqrt( (double) i);
        for(int j = 0; j < (*count) ; j++){

            if(primes[j] > sq){
                primes[(*count)] = i;
                (*count)++;
                break;
            }
            
            if( i % primes[j] == 0){ // its not a prime number
                break;  
            } else { // if its not divisible by j 
                if( primes[j] >= (int) sq ){
                    primes[(*count)] = i;
                    (*count)++;
                    break;
                } else {
                    continue;
                }
            }
        }
    }
    
    return primes;
}

int main( int argc, char *argv[] ) {
    int max;
    int* count = malloc(sizeof(int));
    *count = 0;
    
    if(argc > 0){
       max = atoi(argv[1]);
    } else {
        return 1;
    }
    
    FILE* f = fopen("output.txt", "w");
    
    clock_t start = clock();
    int* primes = calculatePrime(max, count);
    clock_t end = clock();
    printf( "%d\n", (int)((end - start) / 1000));
    
    // Array printing loop
    for(int i = 0; i < (*count); i++)
        fprintf( f, "%i\n", primes[i] );
    
    free( primes );
    
    return 0;
    
    
}