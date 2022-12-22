# Arrays

## The most basic data structure

- Container object that holds a fixed number of values of a **single type**.
- The length of an array is established when the array is created.

### Java

- Create an array of integers

```java
int[] intArr = new int[5];
``

- Create an array and assign values to it at the same time

```java
int[] intArr = {1,2,3,4,5};
```

- `JAVA.UTIL.ARRAYS` class contains various methods for manipulating arrays in Java.

#### Key methods provided by this class

- .length: returns the length of the array
- Arrays.sort(arr): sorts the elements in ascending order
- Arrays.fill(arr, value): fills the array with a specified value
- Arrays.toString(arr): returns a string representation of the array
- Arrays.copyOf(arr, arr.length): creates a copy of the array
- Arrays.binarySearch(arr, target): searches the array for a target value using binary algorithm
- Arrays.equals(arr, secondArr): compares two arrays and returns true or false.
