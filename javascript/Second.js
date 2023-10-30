const Array = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5];

// Sort the array in descending order
Array.sort((a, b) => b - a);

console.log("Array sorted in descending order: " + Array);



/*
Approach:-

Apply the sort() method to the array you want to sort.
Provide a custom comparison function as the argument for sort(), where (a, b) => b - a ensures descending order.
The sort() function will rearrange the array elements in descending order.
The sorted array is now in descending order based on the specified comparison function.

*/