# SieveOfEratoshenes

Finding the prime numbers that greater than 1 and less than 1000, using the Sieve Of Eratoshenes algorithm 

The Sieve Of Eratoshenes algorithm operates as follows:

a. Create a premitive-type boolean array with all elements initialized to true. Array elements with prime indices will remain true. All other array elements will eventually be set to false.

b. Starring with array index 2, determine whether a given element is true. if so loop through the remainder of the array and set to false every element whose index is a multiple of the index for the element with value true. Then continue the process with the next element with value true. For array index 2, all elements beyond element 2 in the array that have indices which are multiple of 2 (indices 4, 6, 8, 10, etc) will be set to false, for any index 3, all elements beyond element 3 in the array that have indices which are multiples of 3 (indices 6, 9, 12, 15, etc.) will be set to false and so on.


SieveOfEratoshenes algorithm:   https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
