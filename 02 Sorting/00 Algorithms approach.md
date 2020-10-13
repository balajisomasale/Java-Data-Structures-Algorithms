

-----------------------------------------------------------------------------------------------------
**Bubble Sort **:  (Inefficient because it takes so many swaps within )

(no of steps)    => 7 5 4 2 0 <br>
      1)            5 4 2 0 7        // (n-i-1) element is sorted everytime <br>
      2)            4 2 0 5 7 <br>
      3)            2 0 4 5 7 <br>
      4)            0 2 4 5 7       // Sorted <br>
   
   
   (n-1) steps    for n items => therfore for 'n' items it will take (n-1) times


we will Iterate through the array => check for current element and next element => if small => then placed in current else placed in next element
likewise => for each iteration 
remember to write the edge case => like if it is sorted in the first attempt only return some boolean and break the loop :)


-----------------------------------------------------------------------------------------------------

**Selection Sort **:  (Efficient )

(no of steps)    => 5 2 -1 6 3 <br>
      1)           -1 2 5  6 3        // Search for MIN element in entire items and sort it in first position and it is fixed  <br>
      2)           -1 2 5  6 3        // 2 is selected next and is placed next to prev value 1   <br>
      3)           -1 2 3  5 6        // 3 is selected next and is placed next to 2 <br>
      4)           -1 2 3  5 6        // 5 is selected and is placed next to 3 and breaks the loops since last element would be the highest       // Sorted <br>





