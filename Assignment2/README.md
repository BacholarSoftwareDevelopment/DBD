# Assignment 2 | Column-based databases
## Assignment
https://datsoftlyngby.github.io/soft2021spring/resources/1fd325b2-assignment_column_db.pdf

## Task 1 - investigation
### 1. What is the point of NoSQL databases?

NoSQL databases are especially good at handeling Big Data. 
Advantages over relationel databases:

- Horizontal scalable 
<p align="center">
<img src="https://media-exp1.licdn.com/dms/image/C4E12AQGTvaEI8H8q4g/article-cover_image-shrink_720_1280/0/1570364364976?e=1623888000&v=beta&t=gX7kmwymPkopN411vzCNeE1pZqmdk5ZpCzyBsO4N7DE" width="400">
</p>

- Flexible
  - Shemaless: 
     - You don't have to design a schema beforehand; therefore you don't have to be 100% sure what you want to store beforehand. 
     - And since you don't have to adhere to a special schema, you can at any moment change or fill in data.
- Distributed
- Fault tolerant
  - 100% uptime through replication



### 2. What is the CAP theorem?

*/(se video 15. april 1,5-2 timer inde)

- Consistency 
- Availability 
- Partition

The CAP theorem deals with the trade-off between consistency and availability. 
=> Do you want to allow copies of your data to get out of sync with each other or not.

<p align="center">
<img src="https://www.researchgate.net/profile/Hamzeh_Khazaei/publication/282679529/figure/fig2/AS:614316814372880@1523475950595/Visualization-of-CAP-theorem.png" width="400">
</p>

***CAP vs ACID***

*CAP Applies to distributed systems 
You can say that
     - CAP addresses cluster-wide data consistency, where as
     - ACID addresses an individual node's data consistency*


### 3. What are ideal use cases of HBase?

- Huge data volumes
- Key dependent access to data
- Real time access to data
- Quick access to data



Examples of real use cases:
- Telecom industry
     - Storing billions of log records with real time access
- Facebook messenger
     - Real time messaging 
     - Huge datasets with billions of messages beeing pushed each month and a need for fast retrieval of these 
- Netflix
     - Terabytes of userdata
     - Storing and pushing terrabytes of ie music or video

## Task 2 - Bloom filters
Bloom filters are used in hbase as an incredible optimization. Solve the following.

### 1. What is a bloom filter?
It's a very cool data structure!

### 2. What is an advantage of bloom filters over hash tables?
### 3. What is a disadvantage of bloom filters?
### 4. Using your language of choice, implement a bloom filter with add and check functions. The backing bit-array can simply be a long (64 bit integer).
### 5. If you are to store one million ASCII strings with an average size of 10 characters in a hash set, what would be the approximate space consumption?
### 6. The following equation gives the required number of bits of space per inserted key, where E is the false positive rate. b = 1.44log2(1/E) (1)
### 7. How many bits per element are required for a 1% false positive rate?
### 8. How many bits per element are required for a 5% false positive rate?
### 9. If you are to store one million ASCII strings with an average size of 10 characters in a bloom filter, what would be the approximate space consumption, given an allowed false positive rate of 5%?.

## Task 3 - Huffman coding
HBase internally uses a compression that is a combination of LZ77 and Huffman
Coding.

### 1. Generate Huffmann Code (and draw the Huffmann Tree) based on the following string: “beebs beepps!!!!! their eerie ears hear pears”
### 2. How many bits is the compressed string? How many bits is the raw ASCII string?
### 3. Compress “pete is here” with the Huffmann tree from before.
### 4. Write your own 10 word sentence. Generate the Huffmann Code (a newHuffmann Tree), and write a new compressed message (ie. in binary). Swap with one of your fellow students, and decompress each other’s message.

## Task 4 - Map and Reduce

Solve the following using Javascript, for example in your browser’s developer console.

### 1. Map the list of numbers to a list of their square roots:
      [1, 9, 16, 100]
### 2. Map the list of words so each is wrapped in a <h1> tag:
            
            [“Intro”, “Requirements”, “Analysis”, “Implementation”, “Conclusion”, “Discussion”, “References”]
### 3. Use map to uppercase the words (all letters):
    [“i’m”, “yelling”, “today”]
### 4. Use map to transform words into their lengths: 
      [“I”, “have”, “looooooong”, “words”]
### 5. Get the json file comics.json from the course site. Paste it into your browser’s Javascript console. Use map to get all the image urls, and wrap them in img-tags.
### 6. Use reduce to sum the array of numbers:
    [1,2,3,4,5]
### 7. Use reduce to sum the x-value of the objects in the array: 
    [{x: 1},{x:2},{x: 3}]
### 8. Use reduce to flatten an array of arrays:
    [[1,2],[3,4],[5,6]]
### 9. Use reduce to return an array of the positive numbers: 
    [-3, -1, 2, 4, 5]
### 10. Optional: The accumulator function can obviously use objects outside of itself. Use reduce to implement groupBy. For example:
          p e o pl e = [
          {name : ’ Rikke ’ , age : 4 6} ,
          {name : ’ Michael ’ , age : 4 7} ,
          {name : ’ Mathias ’ , age : 46}
          ] ;
should be turned into
         
         g roupedPeople = groupBy ( pe ople , ’ age ’ ) ;
          /*
          g roupPe ople :
          {
          4 6: [
          {name : ’ Rikke ’ , age : 4 6 } ,
          {name : ’ Mathias ’ , age : 4 6 }
          ] ,
          4 7: [
          {name : ’ Michael ’ , age : 4 7 }
          ]
          }
          */
  
  
  
