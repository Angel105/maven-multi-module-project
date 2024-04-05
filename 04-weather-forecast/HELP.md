## Get started with Maven-Multi-Module Project

[Multi module Projects Playlist](https://www.youtube.com/playlist?list=PLJyMAT_Wb6qp9RiusxeWxvsfi7VeZtdcY)

### Setting up a Multi-Module Project and Adding new features and compiling :

[[LD] Maven in Eclipse (m2e) 03 - Multi-Module Projects | Let's Develop With](https://www.youtube.com/watch?v=BPxGC7YJOng&list=PLwAX_Bwbts_c4iHfJBN9JU1tNdmzgo6E_&index=3)

### Managing Dependencies and Adding Apache Commons as a Managed Dependency :

[[LD] Maven in Eclipse (m2e) 04 - Dependency Management | Let's Develop With](https://www.youtube.com/watch?v=46aUD21L2hk&list=PLwAX_Bwbts_c4iHfJBN9JU1tNdmzgo6E_&index=4)

#### Talk about the Scope of a Maven dependency :

* compile
* provided
* runtime
* test
* system

##### COMPILE SCOPE
The COMPILE Scope is the default scope.
COMPILE-scoped dependencies are available on all class-paths of the project.


##### PROVIDED SCOPE
PROVIDED-scoped dependencies are needed for compilation, but are PROVIDED by the ENVIRONMENT in PRODUCTION.


##### RUNTIME SCOPE
RUNTIME-scoped dependencies are not required for compilation, but for the PRODUCTION mode (you need them at RUNTIME,
e.g. implementation of the jdbc interfaces for MySQL DB, which you do not compile against,
but you need them for your application to run later on.)

##### TEST SCOPE
TEST-scoped dependencies are included for test compilation and execution only (e.g. junit dependencies).
These dependencies are not going to be included when you ship the application, but they are included when you execute your test.

##### SYSTEM SCOPE
SYSTEM-scoped dependencies are explicitly referenced jars that are not automatically managed. It is not something used very often.

### Talk about Maven Lifecycles is available in the episode  :

[[LD] Maven - Lifecycles | Let's Develop With](https://www.youtube.com/watch?v=AnXMfDo0mPM&list=PLwAX_Bwbts_c4iHfJBN9JU1tNdmzgo6E_&index=5)


### Talk about Maven Terminology is available in the episode  :

[[LD] Maven in Eclipse (m2e) 06 - Terminology | Let's Develop With](https://www.youtube.com/watch?v=q6x73WXwxGg&list=PLwAX_Bwbts_c4iHfJBN9JU1tNdmzgo6E_&index=6)

### Talk about Maven Repositories is available in the episode  :

[[LD] Maven in Eclipse (m2e) 07 - Repositories | Let's Develop With](https://www.youtube.com/watch?v=2aNC1EAnpqo&list=PLwAX_Bwbts_c4iHfJBN9JU1tNdmzgo6E_&index=7)

### Talk about Maven MVN Install is available in the episode  :

[[LD] Maven in Eclipse (m2e) 08 - MVN Install | Let's Develop With](https://www.youtube.com/watch?v=EMfd2FwKKHY&list=PLwAX_Bwbts_c4iHfJBN9JU1tNdmzgo6E_&index=8)


#### The speaker's website is available per  [link](http://letsdeveloper.com/).

### Talk about Deployment in Maven is available in the episode  :

[[LD] Maven in Eclipse #09 - Deployment | Let's Develop With](https://www.youtube.com/watch?v=8MRLzhH7tQM&list=PLwAX_Bwbts_c4iHfJBN9JU1tNdmzgo6E_&index=9)

### Talk about Release Preparation with Maven is available in the episode  :

[[LD] Maven in Eclipse #10 - Release Prepare | Let's Develop With](https://www.youtube.com/watch?v=L_bVYHhnjGs&list=PLwAX_Bwbts_c4iHfJBN9JU1tNdmzgo6E_&index=10)

### Talk about Performing Release in Maven is available in the episode  :

[[LD] Maven in Eclipse #11 - Release Perform | Let's Develop With](https://www.youtube.com/watch?v=6zf-maEzrMM&list=PLwAX_Bwbts_c4iHfJBN9JU1tNdmzgo6E_&index=11)

### Talk about Project Setup without a Wizard is available in the episode  :

[[LD] Maven in Eclipse #01a - Setup w/o Wizard | Let's Develop With](https://www.youtube.com/watch?v=z0JEA8sSLUA&list=PLwAX_Bwbts_c4iHfJBN9JU1tNdmzgo6E_&index=12)

### Talk about Reference Repositories is available in the episode  :

[[LD] Maven in Eclipse #12 - Reference Repos | Let's Develop With](https://www.youtube.com/watch?v=h6ZwZDty8W4&list=PLwAX_Bwbts_c4iHfJBN9JU1tNdmzgo6E_&index=13)

### Talk about Snapshot Repositories is available in the episode  :

[[LD] Maven in Eclipse #13 - Snapshot Repos | Let's Develop With](https://www.youtube.com/watch?v=yTvh2fZHFy0&list=PLwAX_Bwbts_c4iHfJBN9JU1tNdmzgo6E_&index=14)

### Talk about Deploying to GitHub is available in the episode  :

[[LD] Maven in Eclipse #14 - Deploy to GitHub | Let's Develop With](https://www.youtube.com/watch?v=gBd5Yraoqp4&list=PLwAX_Bwbts_c4iHfJBN9JU1tNdmzgo6E_&index=15)

### Talk about Releasing to GitHub is available in the episode  :

[[LD] Maven in Eclipse #15 - Release to GitHub | Let's Develop With](https://www.youtube.com/watch?v=FFq0V_LZGZ4&list=PLwAX_Bwbts_c4iHfJBN9JU1tNdmzgo6E_&index=16)

### Talk about Test Run, Surefire naming convention,  is available in the episode  :

[[LD] Maven in Eclipse - Tests Run: 0 | Let's Develop With](https://www.youtube.com/watch?v=I15SQsMBjSM&list=PLwAX_Bwbts_c4iHfJBN9JU1tNdmzgo6E_&index=17)



