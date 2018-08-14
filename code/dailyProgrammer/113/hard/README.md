# Memory Allocation Insanity!
<div class="md"><p><strong>Description:</strong></p>
<p>Cyberdyne Systems Corporation is working on a powerful new processors, but due to a management snafu, the management has only allowed your code 512 Kilobytes (524288 Bytes) to implement your application's heap! For those unfamiliar with the <a href="http://en.wikipedia.org/wiki/Dynamic_memory_allocation#Dynamic_memory_allocation">heap</a>, it is an area of memory for processes where (the process) can allocate variable memory sizes on at run-time.</p>
<p>The problem here is that you can't use any pre-built code or libraries to serve your memory allocation needs in this tiny space, so you are now going to have to re-implement your own <a href="http://en.wikipedia.org/wiki/C_dynamic_memory_allocation">malloc and free</a> functions!</p>
<p>Your goal is to implement two functions, regardless of language, named "malloc" and "free". Malloc takes a number of bytes (up to a maximum of 128 Kb at a time) and returns either a new address (array) that your process can use, or returns an invalid point (empty array) if there is not enough free space. This array must be continuous (i.e. a continuous block of 128 Kb). Free simply takes the given array and allows it to be reused by future malloc function calls.</p>
<p>Your code must only work in 512Kb, meaning that both the allocate memory AND the related data structures must reside in this 512Kb space. Your code is not part of this measurement. As an example, if you use a linked-list that requires one byte over-head for each allocated chunk, that means you must be able to contain this linked-list structure and the allocated spaces.</p>
<p>There are many methods to implement a heap structure; investigate either the Linux Slab allocator, or try to stick to the obvious solutions of linked lists. Don't forget to coalesce freed spaces over time! An example of this situations is when you have three blocks, left, middle, and right, where the left and right are unallocated, but the middle is allocated. Upon free-ing the middle block, your code should understand that there aren't three free blocks left, but instead one large unified block!</p>
<p><strong>Formal Inputs &amp; Outputs:</strong></p>
<p><em>Input Description:</em></p>
<ul>
<li><code>void* malloc(size_t ByteCount);</code> // Returns a pointer to available memory that is the "ByteCount" size in bytes</li>
<li><code>void free(void* Ptr);</code> // Frees a given block of memory on this heap</li>
</ul>
<p><em>Output Description:</em></p>
<p>No formal output is required, but a helpful tool for you to develop is printing the memory map of the heap, useful for debugging.</p>
<p><strong>Sample Inputs &amp; Outputs:</strong></p>
<ul>
<li><code>void* PtrA = Malloc(131072);</code> // Allocating 128Kb; success</li>
<li><code>void* PtrB = Malloc(131072);</code> // Allocating 128Kb; success</li>
<li><code>void* PtrC = Malloc(131072);</code> // Allocating 128Kb; success</li>
<li><code>void* PtrD = Malloc(131072);</code> // Allocating 128Kb; fails, unlikely to return 128Kb since any implementation will require memory over-head, thus you will have less than 128Kb left on the heap before calling this function</li>
<li><code>free(PtrC);</code> // Free 128Kb; success</li>
<li><code>void* PtrD = Malloc(131072);</code> // Allocating 128Kb; success</li>
</ul>
<p><strong>Note</strong></p>
<p>It is likely that you will have to implement this simulation / code in C or C++, simply because many high-level languages such as Java or Ruby will hide the necessary low-level memory controls required. You can still use these high-level languages, but you must be very strict about following the memory limitation rule.</p>
</div>
