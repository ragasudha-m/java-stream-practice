# Java Stream API Practice Questions

A collection of practice problems and exercises to master the Java Stream API.

## 📚 Topics Covered

### 1. Basic Stream Operations
- Creating streams from collections, arrays, and values
- `forEach`, `count`, `collect`
- `filter`, `map`, `reduce`

### 2. Intermediate Operations
- `map` / `flatMap`
- `filter`
- `distinct`, `sorted`, `limit`, `skip`
- `peek`

### 3. Terminal Operations
- `collect`, `toList`, `toSet`, `toMap`
- `reduce`
- `findFirst`, `findAny`
- `anyMatch`, `allMatch`, `noneMatch`
- `min`, `max`, `count`

### 4. Collectors
- `Collectors.groupingBy`
- `Collectors.partitioningBy`
- `Collectors.joining`
- `Collectors.counting`
- `Collectors.summarizingInt`

### 5. Advanced Topics
- Parallel streams
- `Optional` with streams
- `IntStream`, `LongStream`, `DoubleStream`
- `Stream.iterate` and `Stream.generate`
- Infinite streams
- Method references

---

## 🧩 Practice Questions

### Basic
1. Given a list of integers, filter all even numbers and return them as a list.
2. Convert a list of strings to uppercase.
3. Find the maximum element from a list of integers.
4. Get the count of Strings that starts with letter 'A'
5. Calculate Square of all the numbers in a list and return the result as a list.

### Intermediate
6. Group a list of employees by their department.
8. Given list of words, join them into single string using delimiter.
9. Find Sum of all the numbers in a list using `reduce`.
10. Find the frequency of each word in a list of words using `Collectors.groupingBy` and `Collectors.counting`.
11. Check if all the numbers in a list are positive using `allMatch`.
9. Flatten a list of lists into a single list using `flatMap`.
10. Partition a list of numbers into even and odd using `partitioningBy`.
11. Remove duplicate elements in a list using streams.
12. Convert a list of objects to a `Map<id, name>`.

### Advanced
13. Find only the Duplicate elements in a list using streams.
14. Find the first non-repeated character in a string using streams.
13. Find the highest paid employee from a list of employees.
14. Find the second highest number in a list of integers.
14. Partition a list of employees into those who are above and below a certain salary threshold.
15. Find the longest string in a list. 
16. Sort employees by their salary.

---

## 🛠️ Prerequisites

- Java 8 or higher
- Basic knowledge of Lambda expressions
- Familiarity with Functional Interfaces (`Predicate`, `Function`, `Consumer`, `Supplier`)

## 🚀 Getting Started

```bash
git clone https://github.com/rmuru5_nike/java-stream-api-practice.git
cd java-stream-api-practice