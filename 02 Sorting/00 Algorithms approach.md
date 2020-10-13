**Bubble Sort **: 

(no of steps)    => 7 5 4 2 0
      1)            5 4 2 0 7        // (n-i-1) element is sorted everytime
      2)            4 2 0 5 7 
      3)            2 0 4 5 7
      4)            0 2 4 5 7       // Sorted 
   
   
   (n-1) steps    for n items => therfore for 'n' items it will take (n-1) times


we will Iterate through the array => check for current element and next element => if small => then placed in current else placed in next element
likewise => for each iteration 
remember to write the edge case => like if it is sorted in the first attempt only return some boolean and break the loop :)
