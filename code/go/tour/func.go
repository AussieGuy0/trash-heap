package main

import (
    "fmt"
    "math/rand"
)

func add(x int, y int) int {
    return x + y    
}

// Shortened type declaration
func minus(x, y int) int {
    return x - y    
}

// Multi return
func swap(x, y string) (string, string) {
    return y, x
}

// Named return varaiables
func rand2() (x, y int) {
   x = rand.Intn(10)
   y = rand.Intn(10)
   return
}

func main() {
    fmt.Println(add(4, 2))
    fmt.Println(minus(4, 2))
    a, b := swap("hello", "world")
    fmt.Println(a, b)
}
