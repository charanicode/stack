
## Problem

Given an array of asteroids:
- Positive number means asteroid is moving right.
- Negative number means asteroid is moving left.
- Bigger asteroid destroys smaller asteroid during collision.
- If both are equal, both are destroyed.

Return the remaining asteroids after all collisions.

## Example

Input:

[10, 2, -5]


Output:

[10]


## Approach

Used **Stack** to store asteroids.

- Positive asteroids are directly pushed into the stack.
- Negative asteroids are compared with the top of the stack.
- Remove smaller asteroids and handle collisions.
- Push the asteroid only if it survives.

## Complexity

Time Complexity: O(n)

Space Complexity: O(n)

## Language

Java
