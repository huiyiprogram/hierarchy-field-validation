# Hierarchy field validation
This project is created to solve the challenge of validating fields that has a hierarchy structure.  

```java
class Test {
   String category;
   String subCategory;
   String finalValue;
}
```

## Questions to answer
1. How can we check if each nested value belongs to its parent? E.g. finalValue belongs to a specific subCategory and category
