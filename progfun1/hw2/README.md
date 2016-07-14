 ## Overview

 ### Basic Functions on Sets
 - Define a function singletonSet which creates a singleton set from one integer value: the set represents the set of the one given element. Now that we have a way to create singleton sets, we want to define a function that allow us to build bigger sets from smaller ones.
 - Define the functions union,intersect, and diff, which takes two sets, and return, respectively, their union, intersection and differences. diff(s, t) returns a set which contains all the elements of the set s that are not in the set t.
 - Define the function filter which selects only the elements of a set that are accepted by a given predicate p. The filtered elements are returned as a new set.

 ### Queries and Transformations on Sets
 - Implement forall using linear recursion. For this, use a helper function nested inforall.
 - Using forall, implement a function exists which tests whether a set contains at least one element for which the given predicate is true. Note that the functions forall and exists behave like the universal and existential quantifiers of first-order logic.
 - Finally, write a function map which transforms a given set into another one by applying to each of its elements the given function.