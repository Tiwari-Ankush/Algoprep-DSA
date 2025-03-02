public class Java06timeComplexity {
}
// ###############################################
// TIME COMPLEXITY >> time required to complete the execution of code.

// 1. [a,b] >> b-a+1
// 2. [a,b) >> b-a
// 3. (a,b) >> b-a-1

// >> Some Properties let log having base 'a'
//     1. log a^N = N
//     2. log (a*b) = log a + log b

//     Example:
//         if log 64 = ans, ...log with base 2
//             then 2^ans = 64


// >> Sum of first N terms of AP is
//     (N/2)[2*a + (N-1)d]
//     a = starting number
//     d = difference betn consecutive numbers

// >> Sum of first N terms of GP is
//     a*[{(r^N)-1} / {r-1}]
//     a = starting number
//     r = common ratio / (multiple to get next number)



// >> 1 sec = 10^8 iterations.

// >> Sum of 1 -> N is [N*(N+1)]/2
//     and hence complexity is O(N^2)
// >> if 1 to N count then Complexity O(logN)

// >> if [N -> N/2 -> N/4 .....1] then there is logN iterations
//     hence, O(logN)

// >> if constant range means like [1......100]
//     then O(1)

// >> if (i*i =N) i.e. i = root(N),
//     hence [1 -> root(N)], complexity is O(root(N)).




// COMPARISON OF ITERATION
//    O( 1 < logN < Root(N) < N < N.logN < N.Root(N) < N^2 < 2^N )

// Big O notation >> approximate iteration count.


// steps for calculating time complexity >>
//     1. Calculate iteration
//     2. around '+' sign , neglect lower order terms.
//     3. Neglect constants.


// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
// SPACE COMPLEXITY >>
//     (Space used in 1 function) * (Maximum number of function in stack at point of time).

// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
