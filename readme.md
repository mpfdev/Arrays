# Arrays

## The most basic data structure

- Container object that holds a fixed number of values of a **single type**.
- The length of an array is established when the array is created.

## Java

- Create an array of integers

```java
int[] intArr = new int[5];
```

- Create an array and assign values to it at the same time

```java
int[] intArr = {1,2,3,4,5};
```

- `JAVA.UTIL.ARRAYS` class contains various methods for manipulating arrays in Java.

### Key methods provided by this class

- .length: returns the length of the array
- Arrays.sort(arr): sorts the elements in ascending order
- Arrays.fill(arr, value): fills the array with a specified value
- Arrays.toString(arr): returns a string representation of the array
- Arrays.copyOf(arr, arr.length): creates a copy of the array
- Arrays.binarySearch(arr, target): searches the array for a target value using binary algorithm
- Arrays.equals(arr, secondArr): compares two arrays and returns true or false.

# ArrayList

## Class implementation of the List interface

- Allows you to store a collection of objects in an ordered list
- Provides various methods for adding, removing, and accessing elements in the list

### Key methods provided by ArrayList

- .add(element): adds an element to the end of the list
- .addAll: adds all the elements in a specified collection to the list
- .clear(): removes all elements from the list
- .contains(value): returns true if the list contains the specified element
- .get(position): returns the element at the specified position in the list
- .indexOf(element): returns the index of the **first** occurrence of the element in the list
- .isEmpty(): returns true if the list is empty
- .remove(element): removes the **first** occurrence of the specified element from the list
- .set(position, value): replaces the element at the specified position with a value
- .size(): returns the numbers of elements in the list

## Difference for Array

- It can be slower than using array, **especially** if you need to perform a lot of insertions or deletions in the middle of the list.
	- It may be more efficient to use a data structure such as LinkedList
