## Task 1 - investigation
### 1. What is point of NoSQL databases?

NoSQL databases are especially good at handeling Big Data. 
Advantages over relationel databases:

- Horizontal scalable 
- 
     -  <img src="https://media-exp1.licdn.com/dms/image/C4E12AQGTvaEI8H8q4g/article-cover_image-shrink_720_1280/0/1570364364976?e=1623888000&v=beta&t=gX7kmwymPkopN411vzCNeE1pZqmdk5ZpCzyBsO4N7DE" width="400">
- Flexible
  - Shemaless: 
     - You don't have to design a schema beforehand; therefore you don't have to be 100% sure what you want to store beforehand. 
     - And since you don't have to adhere to a special schema, you can at any moment change or fill in data.
- Distributed
- Fault tolerant
  - 100% uptime through replication



### 2. What is the CAP theorem?


- Consistency 
- Availability 
- Partition

The CAP theorem deals with the trade-off between consistency and availability. (A trade-off you in reality don't really want to make)
=> Do you want to allow copies of your data to get out of sync with each other or not.

**CAP vs ACID**

CAP Applies to distributed systems 
You can say that
     - CAP addresses cluster-wide data consistency, where as
     - ACID addresses an individual node's data consistency


#### 3. What are ideal use cases of HBase?

- Huge data volumes
- Key dependent access to data
- Real time access to data
- Quick access to data



Examples of real use cases:
     - Telecom industry
          - Storing billions of log records with real time access
     - Facebook
          - Real time messaging 
          - Huge datasets with billions of messages beeing pushed each month and a need for fast retrieval of these
     - Netflix
          - Terabytes of userdata
          - Storing and pushing terrabytes of ie music or video
